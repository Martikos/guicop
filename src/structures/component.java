/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package structures;

import geometric.*;

import java.util.ArrayList;

public class component {
    private ArrayList<shape> shapes = new ArrayList();

    public component() {}
    public void addShape(shape s) {
        shapes.add(s);
    }
    public shape getShape(int i) {
        return shapes.get(i);
    }

    public double getCardinal() {
        return shapes.size();
    }

    public double getMostLeft() {
        if(shapes.size()>0) {
            double left = shapes.get(0).getLeftBound();
            for(int i=0; i<shapes.size();i++)
                if(left>shapes.get(i).getLeftBound())
                    left = shapes.get(i).getLeftBound();
            return left;
        }
        else
            return 0;
    }
    public double getMostRight() {
        if(shapes.size()>0) {
            double right = shapes.get(0).getRightBound();
            for(int i=0; i<shapes.size();i++)
                if(right<shapes.get(i).getRightBound())
                    right = shapes.get(i).getRightBound();
            return right;
        }
        else
            return 0;
    }
    public double getMostTop() {
        if(shapes.size()>0) {
            double top = shapes.get(0).getTopBound();
            for(int i=0; i<shapes.size();i++)
                if(top>shapes.get(i).getTopBound())
                    top = shapes.get(i).getTopBound();
            return top;
        }
        else
            return 0;
    }
    public double getMostBottom() {
        if(shapes.size()>0) {
            double bottom = shapes.get(0).getBottomBound();
            for(int i=0; i<shapes.size();i++)
                if(bottom<shapes.get(i).getBottomBound())
                    bottom = shapes.get(i).getBottomBound();
            return bottom;
        }
        else
            return 0;
    }
    public double getSize() {
        if(shapes.size()>0) {
            double size = shapes.get(0).getSize();
            for(int i=0; i<shapes.size();i++)
                if(size<shapes.get(i).getSize())
                    size = shapes.get(i).getSize();
            return size;
        }
        else
            return 0;
    }


    public boolean equals(component c) {
        return (this.getMostBottom()==c.getMostBottom() && this.getMostTop()==c.getMostTop() && this.getMostLeft()==c.getMostLeft() && this.getMostRight()==c.getMostRight());
    }

    public void print() {
        for(int i=0; i<shapes.size(); i++) {
            shapes.get(i).print();
        }
    }
    public String printToString() {
        String returnString = "";
        for(int i=0; i<shapes.size(); i++) {
            returnString = returnString + shapes.get(i).printToString();
        }
        return returnString;
    }


}
