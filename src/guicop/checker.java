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


public class checker {

    // spec object related
    private ArrayList<variable> instances = new ArrayList();

    // checker related
    private HashMap tokenMap;
    private HashMap typeMap;
    private HashMap operationSignMap;
    private HashMap primitiveShapes;

    // Primitive shapes
    private String[] shapes = {"rectangle", "ellipse", "polygon", "text", "textrect", "triangle", "line"};

    // Operator types
    String[] combineOperators = {"leftto", "rightto", "above", "below", "contains", "over", "leftaligned", "rightaligned", "topaligned", "bottomaligned", "smaller", "equal"};
    String[] textOperators = {"textconcat", "textsubstr", "textsmaller"};
    String[] logicOperators = {"and", "or", "xor"};
    String[] arithmeticOperators = {"+", "-", "/", "*"};
    String[] equalOperator = {"=="};
    String[] propertyAccessOperators = {"."};

    ArrayList<String[]> ops;

    public checker(HashMap t, ArrayList ins) {
        instances = ins;
        typeMap = t;
        tokenMap = new HashMap();
        operationSignMap = new HashMap();
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

        primitiveShapes = new HashMap();
        for (int i= 0; i < shapes.length; i++) {
            primitiveShapes.put(shapes[i], "");
        }
        
    }
    
    private node solve(node n1, node n2, String op) {
        boolean satisfied = false;
        node n3 = new node();
        String label = "(" + n1.getLabel() + " " + op + " " + n2.getLabel() + ")";
        System.out.println("Solving for: " + label);
        n3.setLabel(label);


        String opType = tokenMap.get(op).toString();
        if(opType.equals("1")) {
            System.out.println("Number of positional checks: " + n1.getCardinal() + " x " + n2.getCardinal());
            for(int i=0; i<n1.getCardinal(); i++)
                for(int j=0; j<n2.getCardinal(); j++)
                {
                    component c1 = n1.getComponent(i);
                    component c2 = n2.getComponent(j);
                    boolean check = false;
                    Method m;
                    try {
                        m = checker.class.getMethod(op, component.class, component.class);
                        String str = m.invoke(this, c1, c2).toString();
                        check = str.equals("true");
                    } catch(Exception e) {e.printStackTrace();}

                    if(check)
                    {
                        component c3 = merge(c1, c2);
                        n3.addComponent(c3);
    //                    System.out.print("New Component: ");
    //                    c3.print();
                        satisfied = true;

                        // add instances
                        if(c1.getCardinal()==1) {
                            for(int ll=0; ll<instances.size(); ll++) {
                                if(instances.get(ll).getId().equals(n1.getLabel())) {
                                    // means you found the one that has the id the same as the one in the label
                                    instances.get(ll).addInstance(c1);
                                }
                            }
                        }
                        if(c2.getCardinal()==1) {
                            for(int ll=0; ll<instances.size(); ll++) {
                                if(instances.get(ll).getId().equals(n2.getLabel())) {
                                    // means you found the one that has the id the same as the one in the label
                                    instances.get(ll).addInstance(c2);
                                }
                            }
                        }
                    }
                }
            if(!satisfied)
                System.out.println("Specification error for solving: " + label);
            n3.setSatisfied(satisfied);
     //       System.out.println("After this operation, the list of intances is: ");
            for(int ll=0; ll<instances.size(); ll++) {
   //             instances.get(ll).print();
            }
        }
        else if(opType.equals("3")) {
            System.out.println("Number of arithmetic operations: " + n1.getValuesSize() + " x " + n2.getValuesSize());
            String sign = operationSignMap.get(op).toString();
            for(int i=0; i<n1.getValuesSize(); i++)
                for(int j=0; j<n2.getValuesSize(); j++)
                {
                    double d1 = n1.getValue(i);
                    double d2 = n2.getValue(j);
                    double d3 = 0;
                    Method m;
                    try {
                        m = checker.class.getMethod(sign, double.class, double.class);
                        String str = m.invoke(this, d1, d2).toString();
                        d3 = Double.parseDouble(str);
                    } catch(Exception e) {e.printStackTrace();}
                    n3.addValue(d3);
                    n3.setSatisfied(true);
                }
        }
        // AND/OR/XOR operators
        else if(opType.equals("2")) {
            System.out.println("Number of logic operations: " + n1.getCardinal() + " x " + n2.getCardinal());
            Method m;
            try {
                m = checker.class.getMethod(op, node.class, node.class);
                String returnValue = m.invoke(this, n1, n2).toString();
                boolean check = returnValue.equals("true");
                n3.setSatisfied(check);
            } catch(Exception e) {e.printStackTrace();}

            if(op.equals("and")) {
                HashMap c1s = new HashMap();
                for(int i=0; i<n1.getCardinal(); i++) {
                    // don't the value here, can be anything
                    c1s.put(n1.getComponent(i).printToString(), "c1");
                }
                for(int i=0; i<n2.getCardinal(); i++) {
                    component c2 = n2.getComponent(i);
                    if(c1s.containsKey(c2.printToString())) {
                        n3.addComponent(c2);
                    }
                }
            }
            else if(op.equals("or")) {
                for(int i=0; i<n1.getCardinal(); i++) {
                    n3.addComponent(n1.getComponent(i));
                }
                for(int i=0; i<n2.getCardinal(); i++) {
                    n3.addComponent(n2.getComponent(i));
                }
            }
            else if(op.equals("xor")) {

            }

        }
        // for the dot operator
        else if(opType.equals("4")) {
            try {
                String memberVariable = n2.getLabel();
                String variableName = n1.getLabel();

                // get the type of the variable from the type map
                String type = typeMap.get(variableName).toString();
                // construct the string of the operation, ex: getX() :
                String getter = "get" + memberVariable.toUpperCase();
                Method m;

                Class t;
                if(primitiveShapes.containsKey(type))
                    t = Class.forName("geometric." + type);
                else
                    t = Class.forName("geometric.rectangle");
                
                m = t.getMethod(getter);

                int index = -1;

                for(int i=0; i<instances.size(); i++) {
                    if(instances.get(i).getId().equals(variableName))
                    {
                        index = i;
                        break;
                    }
                }

                if(index>=0) {


                    // do logic here
                    variable var = instances.get(index);
                    System.out.println("Number of member variable settings: " + var.getinstancesSize());
                    for(int i=0; i<var.getinstancesSize(); i++) {
                        shape s = var.getShape(i).getShape(0);
                        String str = "";
                        str = m.invoke(s).toString();

                        if(!memberVariable.toUpperCase().equals("STRING"))
                        {

                            double d = Double.parseDouble(str);
                            n3.addValue(d);
                            // System.out.println("value added" + d);
                        }
                        else
                        {
                            n3.addString(str);
                        }
                        n3.addComponent(var.getShape(i));
                    }
                }

                /*
                for(int i=0; i<n1.getCardinal(); i++)
                {
                    for(int j=0; j<n1.getComponent(i).getCardinal(); j++)
                    {
                        shape s = n1.getComponent(i).getShape(j);
                        String str = "";
                        str = m.invoke(s).toString();

                        if(!memberVariable.toUpperCase().equals("STRING"))
                        {
                            double d = Double.parseDouble(str);
                            n3.addValue(d);
                        }
                        else
                        {
                            n3.addString(str);
                        }
                    }

                }
                 *
                 */
                for(int i=0; i<n3.getValuesSize(); i++)
                {
   //                 System.out.println(n3.getValue(i));
                }
                for(int i=0; i<n3.getStringsSize(); i++)
                {
   //                 System.out.println(n3.getString(i));
                }
            } catch(Exception e) {e.printStackTrace();}
    //        System.out.println("After this operation, the list of intances is: ");
            for(int ll=0; ll<instances.size(); ll++) {
    //            instances.get(ll).print();
            }
        }
        else if(opType.equals("5")) {

            System.out.println("Number of equal checks: " + n1.getValuesSize() + " x " + n2.getValuesSize());
            System.out.println("Number of components: " + n1.getCardinal() + " x " + n2.getCardinal());
            for(int i=0; i<n1.getValuesSize(); i++) {
                for(int j=0; j<n2.getValuesSize(); j++)
                {
                    // TODO: i don't trust this
         //           if(i!=j) {
                        double d1 = n1.getValue(i);
                        double d2 = n2.getValue(j);
                        double d3 = 0;
                        boolean check = equals(d1, d2);
                        if(check)
                        {
                            satisfied = true;
                        }
                        n3.setSatisfied(satisfied);
       //             }
                }
            }
    //        System.out.println(n1.getStringsSize() + " " + n2.getStringsSize());
            boolean sat = false;
            for(int i=0; i<n1.getStringsSize(); i++)
                for(int j=0; j<n2.getStringsSize(); j++)
                {
                    String str1 = n1.getString(i);
                    if(str1.contains("\""))
                        str1 = str1.split("\"")[1];
                    String str2 = n2.getString(j);
                    if(str2.contains("\""))
                        str2 = str1.split("\"")[1];
               //     System.out.println("checking : " + str1 + " with " + str2);
                    if(str1.toLowerCase().equals(str2.toLowerCase()))
                    {
                        sat = true;
                        n3.setSatisfied(true);
                    }

                }
            if(!sat && !satisfied)
                System.out.println("Specification error for solving: " + label);
        }
        else if(opType.equals("6")) {
            String variable1 = n1.getLabel();
            String variable2 = n2.getLabel();
            int index1 = -1;
            int index2 = -1;
            for(int i=0; i<instances.size(); i++) {
                if(instances.get(i).getId().equals(variable1))
                    index1 = i;
                if(instances.get(i).getId().equals(variable2))
                    index2 = i;
            }
            if(index1>=0 && index2>=0) {
                    // do logic here
                    variable var1 = instances.get(index1);
                    variable var2 = instances.get(index2);

                    if(op.equals("textconcat")) {
                        for (int i= 0; i < var1.getinstancesSize(); i++) {
                            for (int j= 0; j < var2.getinstancesSize(); j++) {
                                String t1 = ((textrect)(var1.getShape(i).getShape(0))).getSTRING();
                                String t2 = ((textrect)(var2.getShape(i).getShape(0))).getSTRING();
                                Method m;
                                String str = "";
                                try {
                                    m = specobject.class.getMethod(op, String.class, String.class);
                                    str = m.invoke(this, t1, t2).toString();
                                } catch (Exception e) {e.printStackTrace();}
                                str = str.replaceAll("\"", "");
                                n3.addString(str);
                                n3.setSatisfied(true);
                                satisfied = true;
                                System.out.println(str);
                            }
                        }
                    }
                    else{
                        for (int i= 0; i < var1.getinstancesSize(); i++) {
                            for (int j= 0; j < var2.getinstancesSize(); j++) {
                                String t1 = ((textrect)(var1.getShape(i).getShape(0))).getSTRING();
                                String t2 = ((textrect)(var2.getShape(i).getShape(0))).getSTRING();
                                Method m;
                                String str = "";
                                try {
                                    m = specobject.class.getMethod(op, String.class, String.class);
                                    str = m.invoke(this, t1, t2).toString();
                                } catch (Exception e) {e.printStackTrace();}
                                if(str.equals("true"))
                                {
                                    satisfied = true;
                                    n3.setSatisfied(true);
                                }
                            }
                        }
                    }

                }
            if(!satisfied) {
                System.out.println("Specification error for solving: " + label);
            }
        }
        return n3;

    }



    private node solveProperties(node n1, node n2, String op) {
        boolean satisfied = false;
        node n3 = new node();
        String label = "(" + n1.getLabel() + " " + op + " " + n2.getLabel() + ")";
        System.out.println("Solving for: " + label);
        n3.setLabel(label);


        String opType = tokenMap.get(op).toString();
        if(opType.equals("1")) {
            System.out.println("Number of positional checks: " + n1.getCardinal() + " x " + n2.getCardinal());
            for(int i=0; i<n1.getCardinal(); i++)
                for(int j=0; j<n2.getCardinal(); j++)
                {
                    component c1 = n1.getComponent(i);
                    component c2 = n2.getComponent(j);
                    boolean check = false;
                    Method m;
                    try {
                        m = checker.class.getMethod(op, component.class, component.class);
                        String str = m.invoke(this, c1, c2).toString();
                        check = str.equals("true");
                    } catch(Exception e) {e.printStackTrace();}

                    if(check)
                    {
                        component c3 = merge(c1, c2);
                        n3.addComponent(c3);
    //                    System.out.print("New Component: ");
    //                    c3.print();
                        satisfied = true;

                        // add instances
                        if(c1.getCardinal()==1) {
                            for(int ll=0; ll<instances.size(); ll++) {
                                if(instances.get(ll).getId().equals(n1.getLabel())) {
                                    // means you found the one that has the id the same as the one in the label
                                    instances.get(ll).addInstance(c1);
                                }
                            }
                        }
                        if(c2.getCardinal()==1) {
                            for(int ll=0; ll<instances.size(); ll++) {
                                if(instances.get(ll).getId().equals(n2.getLabel())) {
                                    // means you found the one that has the id the same as the one in the label
                                    instances.get(ll).addInstance(c2);
                                }
                            }
                        }
                    }
                }
            if(!satisfied)
                System.out.println("Specification error for solving: " + label);
            n3.setSatisfied(satisfied);
     //       System.out.println("After this operation, the list of intances is: ");
            for(int ll=0; ll<instances.size(); ll++) {
   //             instances.get(ll).print();
            }
        }
        else if(opType.equals("3")) {
            System.out.println("Number of arithmetic operations: " + n1.getValuesSize() + " x " + n2.getValuesSize());
            String sign = operationSignMap.get(op).toString();
            int min = n1.getValuesSize();
            if(min>n2.getValuesSize())
                min = n2.getValuesSize();
            for (int i= 0; i < min; i++)
                {
                    double d1 = n1.getValue(i);
                    double d2 = n2.getValue(i);
                    double d3 = 0;
                    Method m;
                    try {
                        m = checker.class.getMethod(sign, double.class, double.class);
                        String str = m.invoke(this, d1, d2).toString();
                        d3 = Double.parseDouble(str);
                    } catch(Exception e) {e.printStackTrace();}
                    n3.addValue(d3);
                    n3.setSatisfied(true);
                }
        }
        // AND/OR/XOR operators
        else if(opType.equals("2")) {
            System.out.println("Number of logic operations: " + n1.getCardinal() + " x " + n2.getCardinal());
            Method m;
            try {
                m = checker.class.getMethod(op, node.class, node.class);
                String returnValue = m.invoke(this, n1, n2).toString();
                boolean check = returnValue.equals("true");
                n3.setSatisfied(check);
            } catch(Exception e) {e.printStackTrace();}

            if(op.equals("and")) {
                HashMap c1s = new HashMap();
                for(int i=0; i<n1.getCardinal(); i++) {
                    // don't the value here, can be anything
                    c1s.put(n1.getComponent(i).printToString(), "c1");
                }
                for(int i=0; i<n2.getCardinal(); i++) {
                    component c2 = n2.getComponent(i);
                    if(c1s.containsKey(c2.printToString())) {
                        n3.addComponent(c2);
                    }
                }
            }
            else if(op.equals("or")) {
                for(int i=0; i<n1.getCardinal(); i++) {
                    n3.addComponent(n1.getComponent(i));
                }
                for(int i=0; i<n2.getCardinal(); i++) {
                    n3.addComponent(n2.getComponent(i));
                }
            }
            else if(op.equals("xor")) {

            }

        }
        // for the dot operator
        else if(opType.equals("4")) {
            try {
                String memberVariable = n2.getLabel();
                String variableName = n1.getLabel();

                // get the type of the variable from the type map
                String type = typeMap.get(variableName).toString();
                // construct the string of the operation, ex: getX() :
                String getter = "get" + memberVariable.toUpperCase();
                Method m;

                Class t;
                if(primitiveShapes.containsKey(type))
                    t = Class.forName("geometric." + type);
                else
                    t = Class.forName("geometric.rectangle");

                m = t.getMethod(getter);

                int index = -1;

                for(int i=0; i<instances.size(); i++) {
                    if(instances.get(i).getId().equals(variableName))
                    {
                        index = i;
                        break;
                    }
                }

                if(index>=0) {


                    // do logic here
                    variable var = instances.get(index);
                    System.out.println("Number of member variable settings: " + var.getinstancesSize());
                    for(int i=0; i<var.getinstancesSize(); i++) {
                        shape s = var.getShape(i).getShape(0);
                        String str = "";
                        str = m.invoke(s).toString();

                        if(!memberVariable.toUpperCase().equals("STRING"))
                        {

                            double d = Double.parseDouble(str);
                            n3.addValue(d);
                            // System.out.println("value added" + d);
                        }
                        else
                        {
                            n3.addString(str);
                        }
                        n3.addComponent(var.getShape(i));
                    }
                }

                /*
                for(int i=0; i<n1.getCardinal(); i++)
                {
                    for(int j=0; j<n1.getComponent(i).getCardinal(); j++)
                    {
                        shape s = n1.getComponent(i).getShape(j);
                        String str = "";
                        str = m.invoke(s).toString();

                        if(!memberVariable.toUpperCase().equals("STRING"))
                        {
                            double d = Double.parseDouble(str);
                            n3.addValue(d);
                        }
                        else
                        {
                            n3.addString(str);
                        }
                    }

                }
                 *
                 */
                for(int i=0; i<n3.getValuesSize(); i++)
                {
   //                 System.out.println(n3.getValue(i));
                }
                for(int i=0; i<n3.getStringsSize(); i++)
                {
   //                 System.out.println(n3.getString(i));
                }
            } catch(Exception e) {e.printStackTrace();}
    //        System.out.println("After this operation, the list of intances is: ");
            for(int ll=0; ll<instances.size(); ll++) {
    //            instances.get(ll).print();
            }
        }
        else if(opType.equals("5")) {

            System.out.println("Number of equal checks: " + n1.getValuesSize() + " x " + n2.getValuesSize());
            System.out.println("Number of components: " + n1.getCardinal() + " x " + n2.getCardinal());
            for(int i=0; i<n1.getValuesSize(); i++) {
                for(int j=0; j<n2.getValuesSize(); j++)
                {
                    // TODO: i don't trust this
         //           if(i!=j) {
                        double d1 = n1.getValue(i);
                        double d2 = n2.getValue(j);
                        double d3 = 0;
                        boolean check = equals(d1, d2);
                        if(check)
                        {
                            satisfied = true;
                        }
                        n3.setSatisfied(satisfied);
       //             }
                }
            }
    //        System.out.println(n1.getStringsSize() + " " + n2.getStringsSize());
            boolean sat = false;
            for(int i=0; i<n1.getStringsSize(); i++)
                for(int j=0; j<n2.getStringsSize(); j++)
                {
                    String str1 = n1.getString(i);
                    if(str1.contains("\""))
                        str1 = str1.split("\"")[1];
                    String str2 = n2.getString(j);
                    if(str2.contains("\""))
                        str2 = str1.split("\"")[1];
               //     System.out.println("checking : " + str1 + " with " + str2);
                    if(str1.toLowerCase().equals(str2.toLowerCase()))
                    {
                        sat = true;
                        n3.setSatisfied(true);
                    }

                }
            if(!sat && !satisfied)
                System.out.println("Specification error for solving: " + label);
        }
        else if(opType.equals("6")) {
            String variable1 = n1.getLabel();
            String variable2 = n2.getLabel();
            int index1 = -1;
            int index2 = -1;
            for(int i=0; i<instances.size(); i++) {
                if(instances.get(i).getId().equals(variable1))
                    index1 = i;
                if(instances.get(i).getId().equals(variable2))
                    index2 = i;
            }
            if(index1>=0 && index2>=0) {
                    // do logic here
                    variable var1 = instances.get(index1);
                    variable var2 = instances.get(index2);

                    if(op.equals("textconcat")) {
                        for (int i= 0; i < var1.getinstancesSize(); i++) {
                            for (int j= 0; j < var2.getinstancesSize(); j++) {
                                String t1 = ((textrect)(var1.getShape(i).getShape(0))).getSTRING();
                                String t2 = ((textrect)(var2.getShape(i).getShape(0))).getSTRING();
                                Method m;
                                String str = "";
                                try {
                                    m = specobject.class.getMethod(op, String.class, String.class);
                                    str = m.invoke(this, t1, t2).toString();
                                } catch (Exception e) {e.printStackTrace();}
                                str = str.replaceAll("\"", "");
                                n3.addString(str);
                                n3.setSatisfied(true);
                                satisfied = true;
                                System.out.println(str);
                            }
                        }
                    }
                    else{
                        for (int i= 0; i < var1.getinstancesSize(); i++) {
                            for (int j= 0; j < var2.getinstancesSize(); j++) {
                                String t1 = ((textrect)(var1.getShape(i).getShape(0))).getSTRING();
                                String t2 = ((textrect)(var2.getShape(i).getShape(0))).getSTRING();
                                Method m;
                                String str = "";
                                try {
                                    m = specobject.class.getMethod(op, String.class, String.class);
                                    str = m.invoke(this, t1, t2).toString();
                                } catch (Exception e) {e.printStackTrace();}
                                if(str.equals("true"))
                                {
                                    satisfied = true;
                                    n3.setSatisfied(true);
                                }
                            }
                        }
                    }

                }
            if(!satisfied) {
                System.out.println("Specification error for solving: " + label);
            }
        }
        return n3;

    }

    public node traverse(node n) {
        if(n.hasLeft() && n.hasRight())
        {
            node left = n.getLeft();
            node right = n.getRight();
            if(!left.isLeaf()) {
                node l = traverse(left);
                n.setLeft(l);
            }
            if(!right.isLeaf()) {
                n.setRight(traverse(right));
            }
            left = n.getLeft();
            right = n.getRight();
            if(left.isLeaf() && right.isLeaf()) {
                String operation = n.getLabel();
                return solve(left, right, operation);
            }
        }
        return n;
    }
        public node traverseProperties(node n) {
        if(n.hasLeft() && n.hasRight())
        {
            node left = n.getLeft();
            node right = n.getRight();
            if(!left.isLeaf()) {
                node l = traverseProperties(left);
                n.setLeft(l);
            }
            if(!right.isLeaf()) {
                n.setRight(traverseProperties(right));
            }
            left = n.getLeft();
            right = n.getRight();
            if(left.isLeaf() && right.isLeaf()) {
                String operation = n.getLabel();
                return solveProperties(left, right, operation);
            }
        }
        return n;
    }
    private component merge(component c1, component c2) {
        component c3 = new component();
        for(int i=0; i<c1.getCardinal(); i++)
            c3.addShape(c1.getShape(i));
        for(int i=0; i<c2.getCardinal(); i++)
            c3.addShape(c2.getShape(i));
        return c3;
    }

    
    // Operators
        // Positional Operators
    public boolean leftto(component c1, component c2) {
        boolean check = (c1.getMostRight() <= c2.getMostLeft());
  //      System.out.println(c1.getMostRight() + " <= " +  c2.getMostLeft() + " : " + check);
        return (c1.getMostRight() <= c2.getMostLeft());
    }
    public boolean rightto(component c1, component c2) {
        return (c1.getMostLeft() >= c2.getMostRight());
    }
    public boolean above(component c1, component c2) {
        boolean check = (c1.getMostBottom() <= c2.getMostTop());
 //       System.out.println(c1.getMostBottom() + " <= " +  c2.getMostTop() + " : " + check);
        return (c1.getMostBottom() <= c2.getMostTop());
    }
    public boolean below(component c1, component c2) {
        boolean check = (c1.getMostTop() <= c2.getMostBottom());
  //      System.out.println(c1.getMostTop() + " <= " +  c2.getMostBottom() + " : " + check);
        return check;
    }
    public boolean contains(component c1, component c2) {
    //    c1.print();
    //    c2.print();
        return ((c1.getMostTop()<=c2.getMostTop()) && (c1.getMostLeft()<=c2.getMostLeft()) && (c1.getMostBottom()>=c2.getMostBottom()) && (c1.getMostRight()>=c2.getMostRight()));
    }
    public boolean over(component c1, component c2) {
        boolean left = (c1.getMostLeft() > c2.getMostLeft()) && (c1.getMostLeft() < c2.getMostRight());
        boolean top = (c1.getMostTop() > c2.getMostTop()) && (c1.getMostTop()<c2.getMostBottom());
        boolean right = (c1.getMostRight()<c2.getMostRight() && c1.getMostRight()>c2.getMostLeft());
        boolean bottom = (c1.getMostBottom()<c2.getMostBottom() && c1.getMostBottom()>c2.getMostTop());
       //  System.out.println(left + " " + top + " " + right + " " + bottom);
        return (left&&top || right&&top || left&&bottom || right&&bottom || top&&bottom || left&&right);
    }
    public boolean leftaligned(component c1, component c2) {
        return (c1.getMostLeft()==c2.getMostLeft());
    }
    public boolean rightaligned(component c1, component c2) {
        return (c1.getMostRight()==c2.getMostRight());
    }
    public boolean topaligned(component c1, component c2) {
        return (c1.getMostTop()==c2.getMostTop());
    }
    public boolean bottomaligned(component c1, component c2) {
        return (c1.getMostBottom()==c2.getMostBottom());
    }
    public boolean smaller(component c1, component c2) {
        return (c1.getSize()<c2.getSize());
    }
    public boolean equal(component c1, component c2) {
        return (c1.getSize()==c2.getSize());
    }
        // Text Operators
    public String textconcat(String t1, String t2) {
        return t1.concat(t2);
    }
    public boolean textsubstr(String t1, String t2) {
        return t2.contains(t1);
    }
    public boolean textsmaller(String t1, String t2) {
        return (t1.length()<=t2.length());
    }
        // Logic Operators
    public boolean and(node n1, node n2) {
        return (n1.getSatisfied() && n2.getSatisfied());
    }
    public boolean or(node n1, node n2) {
        return (n1.getSatisfied() || n2.getSatisfied());
    }
    public boolean xor(node n1, node n2) {
        return ((n1.getSatisfied() && !n2.getSatisfied()) || (!n1.getSatisfied() && n2.getSatisfied()));
    }
        // Arithmetic Operators
    public double plus(double x, double y) {
        return (x+y);
    }
    public double minus(double x, double y) {
        return (x-y);
    }
    public double times(double x, double y) {
        return (x*y);
    }
    public double over(double x, double y) {
        return (x/y);
    }
    public boolean equals(double x, double y) {
        // System.out.println(x + " =? " + y);
        return (x==y);
    }
}

