/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package guicop;

import java.util.ArrayList;
import java.util.HashMap;

public class checker {
    
    HashMap tokenMap = new HashMap();
    HashMap operationSignMap = new HashMap();

    // Operator types
    String[] combineOperators = {"leftto", "rightto", "above", "below", "contains", "over", "leftaligned", "rightaligned", "topaligned", "bottomaligned", "smaller", "equal"};
    String[] textOperators = {"textconcat", "textsubstr", "textsmaller"};
    String[] logicOperators = {"and", "or", "xor"};
    String[] arithmeticOperators = {"+", "-", "/", "*"};
    String[] equalOperator = {"="};
    String[] propertyAccessOperators = {"."};

    ArrayList<String[]> ops;

    public void checker() {
        for(int i=0; i<combineOperators.length; i++)
            tokenMap.put(combineOperators[i], "1");
        for(int i=0; i<logicOperators.length; i++)
            tokenMap.put(logicOperators[i], "2");
        for(int i=0; i<arithmeticOperators.length; i++)
            tokenMap.put(arithmeticOperators[i], "3");
        for(int i=0; i<propertyAccessOperators.length; i++)
            tokenMap.put(propertyAccessOperators[i], "4");
        for(int i=0; i<equalOperator.length; i++)
            tokenMap.put(equalOperator[i], "5");
        for (int i= 0; i < textOperators.length; i++)
            tokenMap.put(textOperators[i], "6");

        operationSignMap.put("+", "plus");
        operationSignMap.put("-", "minus");
        operationSignMap.put("/", "over");
        operationSignMap.put("*", "times");
        operationSignMap.put(".", "dot");
    }
    
}
