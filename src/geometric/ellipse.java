/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;

public class ellipse extends shape {
    private int x, y, width, height;

    public ellipse(){}
    public ellipse(int X, int Y, int Width, int Height) {
        x = X;
        y=  Y;
        width = Width;
        height = Height;
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

    public int getLeftBound() {
        return x;
    }
    public int getRightBound() {
        return x+width;
    }
    public int getTopBound() {
        return y;
    }
    public int getBottomBound() {
        return y+width;
    }
    public int getSize() {
        return (width*height);
    }

    public boolean equals(ellipse e) {
        return (x==e.getX() && y==e.getY() && width==e.getWIDTH() && height==e.getHEIGHT());
    }

    public void fromString(String objectString) {
        String arguments = objectString.substring(objectString.indexOf("(")+1, objectString.indexOf(")"));
        String[] params = arguments.split(",");
        x = Integer.parseInt(params[0]);
        y = Integer.parseInt(params[1]);
        width = Integer.parseInt(params[2]);
        height = Integer.parseInt(params[3]);
    }
    public void print() {
        System.out.println("ellipse(" + x + " " + y + " " + width + " " + height + ")");
    }
    public String printToString() {
        String str = "ellipse(" + x + "," + y + "," + width + "," + height + ")";
        return str;
    }

}
