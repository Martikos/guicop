/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public class line extends shape {
    private int x1, y1, x2, y2;

    public line(){}
    public line(int X1, int Y1, int X2, int Y2) {
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
    }
    public int getX1() {
        return x1;
    }
    public int getX2() {
        return x2;
    }
    public int getY1() {
        return y1;
    }
    public int getY2() {
        return y2;
    }
    public int getLeftBound() {
        if(x1<x2)
            return x1;
        else
            return x2;
    }
    public int getRightBound() {
        if(x2>x1)
            return x2;
        else
            return x1;
    }
    public int getTopBound() {
        if(y1<y2)
            return y1;
        else
            return y2;
    }
    public int getBottomBound() {
        if(y2>y1)
            return y2;
        else
            return y1;
    }
    
    public int getSize() {
        return 0;
    }

    public void fromString(String objectString) {
        String arguments = objectString.substring(objectString.indexOf("(")+1, objectString.indexOf(")"));
        String[] params = arguments.split(",");
        x1 = Integer.parseInt(params[0]);
        y1 = Integer.parseInt(params[1]);
        x2 = Integer.parseInt(params[2]);
        y2 = Integer.parseInt(params[3]);
    }
    public void print() {
        System.out.println("line(" + x1 + ","+ y1 + "," + x2 + "," + y2 + ")");
    }
    public String printToString() {
        String str = "line(" + x1 + ","+ y1 + "," + x2 + "," + y2 + ")";
        return str;
    }
    
}
