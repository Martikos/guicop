/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package structures;

public abstract class node {
    private node left, right;
    private boolean hasLeft, hasRight;
    private String label;

    abstract public node getLeft();
    abstract public node getRight();
    abstract public boolean hasLeft();
    abstract public boolean hasRight();
    abstract public String getLabel();

}
