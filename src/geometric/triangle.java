/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public class triangle extends shape{
    private int x1, y1, x2, y2, x3, y3;

    public triangle(){}
    public triangle(int X1, int Y1, int X2, int Y2, int X3, int Y3) {
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
        x3 = X3;
        y3 = Y3;
    }
    public int getX1() {
        return x1;
    }
    public int getX2 () {
        return x2;
    }
    public int getX3 () {
        return x3;
    }
    public int getY1() {
        return y1;
    }
    public int getY2() {
        return y2;
    }
    public int getY3() {
        return y3;
    }

    public int getLeftBound() {
        int left = x1;
        if(x2<left)
            left = x2;
        if(x3<left)
            left = x3;
        return left;
    }
    public int getRightBound() {
        int right = x1;
        if(x2>right)
            right = x2;
        if(x3>right)
            right = x3;
        return right;
    }
    public int getTopBound() {
        int top = y1;
        if(y2<top)
            top = y2;
        if(y3<top)
            top = y3;
        return top;
    }
    public int getBottomBound() {
        int bottom = y1;
        if(y2>bottom)
            bottom = y2;
        if(y3>bottom)
            bottom = y3;
        return bottom;
    }
    
    public int getSize() {
        return (this.getLeftBound() - this.getRightBound())*(this.getBottomBound()-this.getTopBound());
    }

    public boolean equals(triangle t) {
        return (x1==t.x1 && x2==t.x2 && x3==t.x3 && y1==t.y1 && y2==t.y2 && y3==t.y3);
    }

    public void fromString(String objectString) {

    }
    public void print() {
        System.out.println("triangle(" + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3 + ")");
    }
    public String printToString() {
        String returnString = "triangle(" + x1 + "," + y1 + "," + x2 + "," + y2 + "," + x3 + "," + y3 + ")";
        return returnString;
    }
}
