/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package guicop;

import geometric.*;
import structures.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class specobject {

    private officer blart;
    private HashMap variables;
    private Tree properties;
    private Tree constraints;

    private node startNode, endNode;
    ArrayList<variable> instances = new ArrayList();

    private String id;
    private boolean solved;


    public specobject(officer o, String ids, Tree v, Tree p, Tree c) {
        blart = o;
        id = ids;
        variables = new HashMap();
        solved = false;
        
        // get variables
        for (int j= 0; j < v.getChildCount(); j++) {
            Tree sameVariableTree = v.getChild(j);
            String variableType = sameVariableTree.getText();
            for (int k= 0; k < sameVariableTree.getChildCount(); k++) {
                String variableName = sameVariableTree.getChild(k).getText();
                variables.put(variableName, variableType);
            }
        }
        // get properties
        properties = p;
        // get constraints
        constraints = c.getChild(0);

        node n = new node();
        startNode = buildNodeTree(constraints, n);
    }

    public boolean check() {
        blart.initializeLeafs(startNode, instances, variables);
        checker ch = new checker(variables, instances);
        endNode = ch.traverse(startNode);

        boolean satisfied = endNode.getSatisfied();
        solved = true;
        if(satisfied)
            System.out.println(id + " is satisfied");
        else
            System.out.println(id + " is not satisfied");
        return satisfied;
    }

    public boolean getSolved() {
        return solved;
    }
    public String getId() {
        return id;
    }
    private node buildNodeTree(Tree t, node n) {
        if (!t.isNil()) {
            Tree left, right;
            boolean isLeaf_left=true, isLeaf_right = true;
            node newLeft, newRight;
            if(t.getChildCount()>0) {
                if(!t.getChild(0).isNil()) {
                    String str = t.getChild(0).getText();
                    left = t.getChild(0);
                    isLeaf_left = (left.getChildCount()==0);
                    newLeft = new node(left.getText());
                    if(!isLeaf_left)
                        n.setLeft(buildNodeTree(left,newLeft));
                    else
                        n.setLeft(new node(left.getText()));
                }
                if(!t.getChild(1).isNil()) {
                    String str = t.getChild(1).getText();
                    right = t.getChild(1);
                    isLeaf_right = (right.getChildCount()==0);
                    newRight = new node(right.getText());
                    if(!isLeaf_right)
                        n.setRight(buildNodeTree(right,newRight));
                    else
                        n.setRight(new node(right.getText()));
                }
            }
            n.setLabel(t.getText());
        }
        return n;
    }

    public int[] getProperties() {
        int x=0, y=0, width=0, height=0;
        // each child is a property member variable
        for (int i= 0; i < properties.getChildCount(); i++) {
            // this is either x, y, width or height
            Tree propertyTree = properties.getChild(i);
            String propertyID = propertyTree.getText();
            int result = 0;
            for (int j= 0; j<propertyTree.getChildCount(); j++) {
                // dots and operations
                Tree property = propertyTree.getChild(j);
                String text = property.getText();
                double Result = 0;
                if (text.equals(".")) {
                    try {
                        String nameVariable = property.getChild(0).getText();
                        String memberVariable = property.getChild(1).getText();
                        // call dot operator
                        // get the type of the variable from the type map
                        String type = variables.get(nameVariable).toString();
                        // construct the string of the operation, ex: getX() :
                        String getter = "get" + memberVariable.toUpperCase();
                        Method m;
                        Class theClass = Class.forName("geometric." + type);
                        m = theClass.getMethod(getter);
                        int index = -1;
                        for(int fori=0; fori<instances.size(); fori++)
                            if(instances.get(fori).getId().equals(nameVariable))
                            {
                                index = fori;
                                break;
                            }
                        if(index>=0) {
                            // do logic here
                            variable var = instances.get(index);
                            for(int fori=0; fori<var.getinstancesSize(); fori++) {
                                shape s = var.getShape(fori).getShape(0);
                                String str = "";
                                str = m.invoke(s).toString();
                                Result = Double.parseDouble(str);
                                if(j==0)
                                    result += Result;
                                j++;
                                if(j<propertyTree.getChildCount()) {
                                    property = propertyTree.getChild(j);
                                    text = property.getText();
                                    if(text.equals("+") || text.equals("-") || text.equals("*") || text.equals("/")) {
                                                        if(text.equals("+"))
                                                            result+=Result;
                                                        else if(text.equals("-"))
                                                            result-=Result;
                                                        else if(text.equals("*"))
                                                            result*=Result;
                                                        else if(text.equals("/") && Result!=0)
                                                            result/=Result;
                                    }
                                }
                            }
                        }
                    }  catch (Exception e) {e.printStackTrace();}
                }
                if(propertyID.equals("x"))
                    x = result;
                else if(propertyID.equals("y"))
                    y = result;
                else if(propertyID.equals("width"))
                    width = result;
                else if(propertyID.equals("height"))
                    height = result;
            }
        }
        int[] array = new int[4];
        array[0] = x;
        array[1] = y;
        array[2] = width;
        array[3] = height;
        return array;
    }

}
