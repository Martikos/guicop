/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package structures;

import java.util.ArrayList;


public class node {
    private ArrayList<component> components = new ArrayList();
    private ArrayList<Double> values = new ArrayList();
    private ArrayList<String> strings = new ArrayList();

    private String label;
    private boolean satisfied = false;;
    private node left, right;
    private boolean hasLeft = false, hasRight = false;


    public node() {}
    public node(String str) {
        label = str;
    }
    public void addComponent(component c) {
        components.add(c);
    }
    public component getComponent(int i) {
        return components.get(i);
    }
    public int getCardinal() {
        return components.size();
    }
    public int getValuesSize() {
        return values.size();
    }
    public int getStringsSize() {
        return strings.size();
    }
    public String getLabel() {
        return label;
    }
    public double getValue(int i) {
        return values.get(i);
    }
    public void setSatisfied(boolean s) {
        satisfied = s;
    }
    public void setLabel(String s) {
        label = s;
    }

    public void setLeft(node n) {
        left = n;
        hasLeft = true;
    }
    public void setRight(node n) {
        right = n;
        hasRight = true;
    }
    public void addValue(double d) {
        values.add(d);
    }
    public String getString(int i) {
        return strings.get(i);
    }
    public void addString(String str) {
        strings.add(str);
    }
    public boolean hasLeft() {
        return hasLeft;
    }
    public boolean hasRight() {
        return hasRight;
    }
    public boolean isLeaf() {
        return (!hasLeft && !hasRight);
    }
    public node getLeft() {
        if(hasLeft)
            return left;
        else
            return null;
    }
    public node getRight() {
        if(hasRight)
            return right;
        else
            return null;
    }
    public boolean getSatisfied() {
        return satisfied;
    }
    public void print() {
        System.out.println(label);
        if(hasLeft)
            left.print();
        if(hasRight)
            right.print();
    }




}

