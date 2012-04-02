/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public class rectangle extends shape {
    private double x, y, width, height;

    public rectangle(double X, double Y, double Width, double Height) {
        x = X;
        y = Y;
        width = Width;
        height = Height;
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
    public double getLeftBound() {
        return x;
    }
    public double getRightBound() {
        return x+width;
    }
    public double getTopBound() {
        return y;
    }
    public double getBottomBound() {
        return y+width;
    }
    public double getSize() {
        return width*height;
    }

    public boolean equals(rectangle r) {
        return (x==r.x && y==r.y && width==r.width && height==r.height);
    }

    public void print() {
        System.out.println("rectangle(" + x + " " + y + " " + width + " " + height + ")");
    }
    public String printToString() {
        String str = "rectangle(" + x + "," + y + "," + width + "," + height + ")";
        return str;
    }
}
