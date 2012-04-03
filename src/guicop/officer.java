/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package guicop;

import geometric.*;
import parsers.*;

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

    private HashMap typeToShapesListIndex;
    private ArrayList<ArrayList<shape>> shapes;
    private String[] classes = {"rectangle", "triangle", "ellipse", "line", "polygon", "text", "textrect"};

    public officer() {
        objects = new ArrayList();
        shapes = new ArrayList();
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

            // get variables
            Tree variablesTree = objectTree.getChild(0);

            // get properties
            Tree properties = objectTree.getChild(1);

            // get constraints
            Tree constraints = objectTree.getChild(2);
            
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

    public void printList() {
        for (int i= 0; i < shapes.size(); i++) {
            for (int j= 0; j < shapes.get(i).size(); j++) {
                System.out.println(shapes.get(i).get(j).printToString());
            }
        }
    }
}
