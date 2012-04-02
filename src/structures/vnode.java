/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package structures;

import java.util.ArrayList;

// values node
public class vnode extends node {
    private node left, right;
    private boolean hasLeft, hasRight;
    private String label;
    private ArrayList<Double> values;


    public vnode(String str) {
        label = str;
        values = new ArrayList();
        hasLeft = false;
        hasRight = false;
    }

    public node getLeft() {
        return left;
    }
    public node getRight() {
        return right;
    }
    public void setLeft(node n) {
        left = n;
        hasLeft = true;
    }
    public void setRight(node n) {
        right = n;
        hasRight = true;
    }
    public boolean hasLeft() {
        return hasLeft;
    }
    public boolean hasRight() {
        return hasRight;
    }
    public String getLabel() {
        return label;
    }

    public double getValue(int i) {
        return values.get(i);
    }
    public void addValue(double d) {
        values.add(d);
    }

    public boolean getSatisfied() {
        return (values.size()>0);
    }
}
