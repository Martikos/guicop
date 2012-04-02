/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public abstract class shape {
    abstract public double getLeftBound();
    abstract public double getRightBound();
    abstract public double getTopBound();
    abstract public double getBottomBound();
    abstract public double getSize();
    abstract public void print();
    abstract public String printToString();
}
