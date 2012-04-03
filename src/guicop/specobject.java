/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package guicop;

import geometric.*;
import structures.*;

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

}
