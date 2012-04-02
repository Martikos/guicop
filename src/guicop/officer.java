/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package guicop;

import parsers.*;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class officer {
    private ArrayList<specobject> objects;

    public officer() {
        objects = new ArrayList();
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
}
