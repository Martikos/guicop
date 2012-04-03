/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package guicop;

import geometric.*;
import parsers.*;
import structures.*;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.reflect.Method;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;


public class officer {
    private ArrayList<specobject> objects;
    private ArrayList<node> solved;
    private HashMap typeToShapesListIndex;
    private ArrayList<ArrayList<shape>> shapes;
    private String[] classes = {"rectangle", "triangle", "ellipse", "line", "polygon", "text", "textrect"};

    public officer() {
        objects = new ArrayList();
        shapes = new ArrayList();
        solved = new ArrayList();
        for (int i= 0; i < classes.length; i++) {
            shapes.add(new ArrayList());
        }
        typeToShapesListIndex = initShapesListIndex(classes);
    }

    private HashMap initShapesListIndex(String[] c) {
        HashMap m = new HashMap();
        for (int i= 0; i < c.length; i++) {
            m.put(c[i], i);
        }
        return m;
    }

    public void readSpec (String filePath) throws Exception {
        ANTLRReaderStream in = new ANTLRReaderStream(new FileReader(filePath));
        specLexer lexer = new specLexer(in);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	specParser parser = new specParser(tokens);
	specParser.specobjects_return result = parser.specobjects();
	
        Tree ast = (Tree)result.getTree();
        // now each child of this tree is an object by it self,
        // need to convert it to a spec object (with all it's fields) and place it in the list

        // for each user defined object in file
        for (int i= 0; i < ast.getChildCount(); i++) {
            Tree objectTree = ast.getChild(i);
            String id = objectTree.getText();

            // get variables
            Tree variables = objectTree.getChild(0);

            // get properties
            Tree properties = objectTree.getChild(1);

            // get constraints
            Tree constraints = objectTree.getChild(2);

            objects.add(new specobject(this, id, variables, properties, constraints));
            
        }
    }
    public void readOut (String filePath) throws Exception {
        ANTLRReaderStream in = new ANTLRReaderStream(new FileReader(filePath));
        outLexer lexer = new outLexer(in);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	outParser parser = new outParser(tokens);
	outParser.listofproperties_return result = parser.listofproperties();
	Tree ast = (Tree)result.getTree();

        HashMap temp = new HashMap();
        
        for (int i= 0; i < ast.getChildCount(); i++) {
            Tree subAst = ast.getChild(i);
            String objectType = subAst.getText();
            // construct object string (ex: rectangle(12,23,34,45))
            String objectStr = objectType + "(";
            for (int j= 0; j < subAst.getChildCount(); j++) {
                if(j>0)
                    objectStr += ",";
                objectStr += subAst.getChild(j).getText();
            }
            objectStr+= ")";

            // find and the constructor based on the type of the object
            Class theClass = Class.forName("geometric." + objectType);
            Object obj = theClass.getConstructors()[0].newInstance();
            shape newShape = (shape)obj;
            newShape.fromString(objectStr);

            // if a similar object has not been alread added, add it to the list
            if(!temp.containsKey(objectStr)) {
                temp.put(objectStr, "");
                int index = Integer.parseInt(typeToShapesListIndex.get(objectType).toString());
                shapes.get(index).add(newShape);
            }
        }
        temp.clear();
    }

    public void initializeLeafs(node n, ArrayList<variable> instances, HashMap typeMap) {
        boolean x = n.hasLeft() && n.hasRight();
        if(n.hasLeft() && n.hasRight())
        {
            node left = n.getLeft();
            node right = n.getRight();
            initializeLeafs(left, instances, typeMap);
            initializeLeafs(right, instances, typeMap);

        }
        else {
            if(typeMap.containsKey(n.getLabel())) {
                // the object was declared in the variables section
                String objectType = typeMap.get(n.getLabel()).toString();
                String id = n.getLabel();
                if(typeToShapesListIndex.containsKey(objectType)) {
                    int index = Integer.parseInt(typeToShapesListIndex.get(objectType).toString());
                    ArrayList<shape> s = shapes.get(index);
                    variable v = new variable(id);
                    for (int i= 0; i < s.size(); i++) {
                        component c = new component();
                        c.addShape(s.get(i));
                        v.addInstance(c);
                        n.addComponent(c);
                    }
                    instances.add(v);
                }
            }
            else {
                // the object should be another user defined object

                // see if it has already been checked
                boolean alreadyChecked = false;
                String currentId = n.getLabel();
                for (int i= 0; i < solved.size(); i++) {
                    if(currentId.equals(solved.get(i).getLabel())) {
                        n = solved.get(i);
                        alreadyChecked = true;
                    }
                }
                // if it has not yet been check, check it
                boolean savedToCheck = false;
                if(!alreadyChecked) {
                    for (int i= 0; i < objects.size(); i++) {
                        if(currentId.equals(objects.get(i).getId())) {
                            specobject speco = objects.get(i);
                            boolean checko = speco.check();
                            node n2 = speco.getProperties();
                            for (int j= 0; j < n2.getCardinal(); j++) {
                                n.addComponent(n2.getComponent(j));
                            }
                            savedToCheck = true;
                        }
                    }
                }
                // if it has not been checked and is not even in the list of objects to check, throw an error
                if(!alreadyChecked && !savedToCheck)
                    if(!currentId.equals("x") && !currentId.equals("y") && !currentId.equals("width") && !currentId.equals("height"))
                        System.out.println("object '" + currentId + "' does not exist");
            }
        }
    }
    
    public boolean check(String str) {
        System.out.println("Checking for object: " + str);
        if(objects.size()>0) {
            boolean check = false;
            boolean found = false;
            for(int i=0; i<objects.size(); i++) {
                if(objects.get(i).getId().equals(str))
                {
                    found = true;
                    specobject n = objects.get(i);
                    check = n.check();
                    node n2 = n.getProperties();
                    // remove objects from specobjects
                    objects.remove(i);
                    // add it's node to list of solved nodes
                    solved.add(n2);
                    break;
                }
            }
            if(!found) {
                // check list of solved objects
                for (int i= 0; i < solved.size(); i++) {
                    String solvedId = solved.get(i).getLabel();
                    if(solvedId.equals(str)) {
                        return solved.get(i).getSatisfied();
                    }
                }
                System.out.println("Error: Checking for a non defined object.");
                return false;
                
            }
            else
                return check;

                
        }
        else
            return false;

    }
    public void printList() {
        for (int i= 0; i < shapes.size(); i++) {
            for (int j= 0; j < shapes.get(i).size(); j++) {
                System.out.println(shapes.get(i).get(j).printToString());
            }
        }
    }
}
