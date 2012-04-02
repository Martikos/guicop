/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public class textrect extends shape {

    private double x, y, width, height;
    private String str;

    public textrect(double X, double Y, double W, double H, String STR) {
        x = X;
        y = Y;
        width = W;
        height = H;
        str = STR;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getWIDTH() {
        return width;
    }
    public double getHEIGHT() {
        return height;
    }
    public String getSTRING() {
        return str;
    }
    public double getLeftBound() {
        return x;
    }
    public double getRightBound() {
        return x + width;
    }
    public double getTopBound() {
        return y;
    }
    public double getBottomBound() {
        return y + height;
    }
    public double getSize() {
        return width*height;
    }
    public void print() {
        System.out.println("textrect(" + x + "," + y + "," + width + "," + height + "," + str + ")");
    }
    public String printToString() {
        String returnString = "textrect(" + x + "," + y + "," + width + "," + height + "," + str + ")";
        return returnString;
    }


}
