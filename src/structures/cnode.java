/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package structures;

import java.util.ArrayList;

// components node
public class cnode extends node {
    private node left, right;
    private boolean hasLeft, hasRight;
    private String label;
    private ArrayList<component> components;

    public cnode(String l) {
        label = l;
        components = new ArrayList();
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

    public void addComponent(component c) {
        components.add(c);
    }
    public component getComponent(int i) {
        return components.get(i);
    }
    public ArrayList getComponents() {
        return components;
    }

    public boolean getSatisfied() {
        return (components.size()>0);
    }
}
