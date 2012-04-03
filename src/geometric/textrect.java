/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public class textrect extends shape {

    private int x, y, width, height;
    private String str;

    public textrect(){}
    public textrect(int X, int Y, int W, int H, String STR) {
        x = X;
        y = Y;
        width = W;
        height = H;
        str = STR;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getWIDTH() {
        return width;
    }
    public int getHEIGHT() {
        return height;
    }
    public String getSTRING() {
        return str;
    }
    public int getLeftBound() {
        return x;
    }
    public int getRightBound() {
        return x + width;
    }
    public int getTopBound() {
        return y;
    }
    public int getBottomBound() {
        return y + height;
    }
    public int getSize() {
        return width*height;
    }

    public void fromString(String objectString) {

    }
    public void print() {
        System.out.println("textrect(" + x + "," + y + "," + width + "," + height + "," + str + ")");
    }
    public String printToString() {
        String returnString = "textrect(" + x + "," + y + "," + width + "," + height + "," + str + ")";
        return returnString;
    }


}
