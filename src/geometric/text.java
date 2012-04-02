/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public class text extends shape {

    private double x, y;
    private String str;

    public text(String t, double xx, double yy) {
        str = t;
        x = xx;
        y = yy;
    }
    public String getText() {
        return str;
    }
    public double getLeftBound() {
        return x;
    }
    public double getRightBound() {
        return x + str.length()*5;
    }
    public double getTopBound() {
        return y;
    }
    public double getBottomBound() {
        return y + 10;
    }
    public double getSize() {
        return (this.getLeftBound() - this.getRightBound())*(this.getBottomBound()-this.getTopBound());
    }
    public void print() {
        System.out.println("text(" + x + "," + y + "," + str + ")");
    }
    public String printToString() {
        String returnString = "text(" + x + "," + y + "," + str + ")";
        return returnString;
    }
}
