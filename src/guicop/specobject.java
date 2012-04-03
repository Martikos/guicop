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
    private checker ch;
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
        ch = new checker(variables, instances);
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

    public node getProperties() {

        HashMap property = new HashMap();
        String[] ps = {"x", "y", "width", "height"};
        ArrayList<ArrayList<Integer>> returnList = new ArrayList();
        for (int i = 0; i < ps.length; i++) {
            property.put(ps[i], i);
            returnList.add(new ArrayList());
        }
        
        int minValuesSize = 10000;
        for (int i= 0; i < properties.getChildCount(); i++) {
            Tree child = properties.getChild(i);
            for (int j= 0; j < child.getChildCount(); j++) {
                Tree subChild = child.getChild(j);
                node n1 = new node();
                node n2 = buildNodeTree(subChild, n1);

                blart.initializeLeafs(n2, instances, variables);
                node res = ch.traverse(n2);
                int num = res.getValuesSize();
                if(num<minValuesSize)
                    minValuesSize = num;
                if(property.containsKey(child.getText().toLowerCase())) {
                    int index = Integer.parseInt(property.get(child.getText().toLowerCase()).toString());
                    for (int k= 0; k < minValuesSize; k++) {
                        returnList.get(index).add((int)res.getValue(k));
                    }
                }
            }
        }
        // make sure all lists have size less than minValuesSize
        node n = new node(id);
        for (int i= 0; i < minValuesSize; i++) {
            component c = new component();
            int x = Integer.parseInt(returnList.get(0).get(i).toString());
            int y = Integer.parseInt(returnList.get(1).get(i).toString());
            int width = Integer.parseInt(returnList.get(2).get(i).toString());
            int height = Integer.parseInt(returnList.get(3).get(i).toString());
            rectangle r = new rectangle(x, y, width, height);
            c.addShape(r);
            n.addComponent(c);
        }
        return n;
        
    }

}
