/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public class text extends shape {

    private int x, y;
    private String str;

    public text(){}
    public text(String t, int xx, int yy) {
        str = t;
        x = xx;
        y = yy;
    }
    public String getText() {
        return str;
    }
    public int getLeftBound() {
        return x;
    }
    public int getRightBound() {
        return x + str.length()*5;
    }
    public int getTopBound() {
        return y;
    }
    public int getBottomBound() {
        return y + 10;
    }
    public int getSize() {
        return (this.getLeftBound() - this.getRightBound())*(this.getBottomBound()-this.getTopBound());
    }

    public void fromString(String objectString) {

    }
    public void print() {
        System.out.println("text(" + x + "," + y + "," + str + ")");
    }
    public String printToString() {
        String returnString = "text(" + x + "," + y + "," + str + ")";
        return returnString;
    }
}
