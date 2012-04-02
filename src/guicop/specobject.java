/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package guicop;

import geometric.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class specobject {
    private HashMap variables;
    private Tree properties;
    private Tree constraints;
    
    private String id;


    public specobject(Tree v, Tree p, Tree c) {
        variables = new HashMap();
        
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
        constraints = c;
    }
}
