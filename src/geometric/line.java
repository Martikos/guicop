/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public class line extends shape {
    private double x1, y1, x2, y2;

    public line(double X1, double Y1, double X2, double Y2) {
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
    }
    public double getX1() {
        return x1;
    }
    public double getX2() {
        return x2;
    }
    public double getY1() {
        return y1;
    }
    public double getY2() {
        return y2;
    }
    public double getLeftBound() {
        if(x1<x2)
            return x1;
        else
            return x2;
    }
    public double getRightBound() {
        if(x2>x1)
            return x2;
        else
            return x1;
    }
    public double getTopBound() {
        if(y1<y2)
            return y1;
        else
            return y2;
    }
    public double getBottomBound() {
        if(y2>y1)
            return y2;
        else
            return y1;
    }
    
    public double getSize() {
        return 0;
    }
    
    public void print() {
        System.out.println("line(" + x1 + ","+ y1 + "," + x2 + "," + y2 + ")");
    }
    public String printToString() {
        String str = "line(" + x1 + ","+ y1 + "," + x2 + "," + y2 + ")";
        return str;
    }
    
}
