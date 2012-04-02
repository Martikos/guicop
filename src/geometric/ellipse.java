/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public class ellipse extends shape {
    private double x, y, width, height;

    public ellipse(double X, double Y, double Width, double Height) {
        x = X;
        y=  Y;
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
        return (width*height);
    }

    public boolean equals(ellipse e) {
        return (x==e.getX() && y==e.getY() && width==e.getWIDTH() && height==e.getHEIGHT());
    }
    public void print() {
        System.out.println("ellipse(" + x + " " + y + " " + width + " " + height + ")");
    }
    public String printToString() {
        String str = "ellipse(" + x + "," + y + "," + width + "," + height + ")";
        return str;
    }

}
