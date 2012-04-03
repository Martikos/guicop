/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public abstract class shape {
    abstract public int getLeftBound();
    abstract public int getRightBound();
    abstract public int getTopBound();
    abstract public int getBottomBound();
    abstract public int getSize();

    abstract public void fromString(String objectString);
    abstract public void print();
    abstract public String printToString();
}
