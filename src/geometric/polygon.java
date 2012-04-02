/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;
import java.util.ArrayList;

public class polygon extends shape {
    private ArrayList<Double> x;
    private ArrayList<Double> y;

    public polygon(ArrayList xs, ArrayList ys) {
        x = xs;
        y = ys;
    }

    public double getSize() {
        return x.size();
    }
    public double getLeftBound() {
        Double first = x.get(0);
        for(int i=0; i<x.size(); i++)
            if(x.get(i)<first)
                first=x.get(i);
        return first;

    }
    public double getRightBound(){
        Double first = x.get(0);
        for(int i=0; i<x.size(); i++)
            if(x.get(i)>first)
                first=x.get(i);
        return first;
    }
    public double getTopBound() {
        Double first = y.get(0);
        for(int i=0; i<y.size(); i++)
            if(y.get(i)<first)
                first=y.get(i);
        return first;
    }
    public double getBottomBound(){
        Double first = y.get(0);
        for(int i=0; i<y.size(); i++)
            if(y.get(i)>first)
                first=y.get(i);
        return first;
    }

    public void print() {
        System.out.print("(");
        for(int i=0; i<x.size(); i++) {
            System.out.print(x.get(i) + "," + y.get(i));
        }
        System.out.println(")");
    }
    public String printToString() {
        String str = "polygon(";
        for(int i=0; i<x.size(); i++) {
            if(i!=0)
                str+=",";
            str += x.get(i) + "," + y.get(i);
        }
        str+=")";
        return str;
    }
}
