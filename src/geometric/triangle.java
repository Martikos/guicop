/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public class triangle extends shape{
    private double x1, y1, x2, y2, x3, y3;

    public triangle(double X1, double Y1, double X2, double Y2, double X3, double Y3) {
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
        x3 = X3;
        y3 = Y3;
    }
    public double getX1() {
        return x1;
    }
    public double getX2 () {
        return x2;
    }
    public double getX3 () {
        return x3;
    }
    public double getY1() {
        return y1;
    }
    public double getY2() {
        return y2;
    }
    public double getY3() {
        return y3;
    }

    public double getLeftBound() {
        double left = x1;
        if(x2<left)
            left = x2;
        if(x3<left)
            left = x3;
        return left;
    }
    public double getRightBound() {
        double right = x1;
        if(x2>right)
            right = x2;
        if(x3>right)
            right = x3;
        return right;
    }
    public double getTopBound() {
        double top = y1;
        if(y2<top)
            top = y2;
        if(y3<top)
            top = y3;
        return top;
    }
    public double getBottomBound() {
        double bottom = y1;
        if(y2>bottom)
            bottom = y2;
        if(y3>bottom)
            bottom = y3;
        return bottom;
    }
    
    public double getSize() {
        return (this.getLeftBound() - this.getRightBound())*(this.getBottomBound()-this.getTopBound());
    }

    public boolean equals(triangle t) {
        return (x1==t.x1 && x2==t.x2 && x3==t.x3 && y1==t.y1 && y2==t.y2 && y3==t.y3);
    }

    public void print() {
        System.out.println("triangle(" + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3 + ")");
    }
    public String printToString() {
        String returnString = "triangle(" + x1 + "," + y1 + "," + x2 + "," + y2 + "," + x3 + "," + y3 + ")";
        return returnString;
    }
}
