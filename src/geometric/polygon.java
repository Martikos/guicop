/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package geometric;
import java.util.ArrayList;

public class polygon extends shape {
    private ArrayList<Integer> x;
    private ArrayList<Integer> y;

    public polygon() {}
    public polygon(ArrayList xs, ArrayList ys) {
        x = xs;
        y = ys;
    }

    public int getSize() {
        return x.size();
    }
    public int getLeftBound() {
        int first = x.get(0);
        for(int i=0; i<x.size(); i++)
            if(x.get(i)<first)
                first=x.get(i);
        return first;

    }
    public int getRightBound(){
        int first = x.get(0);
        for(int i=0; i<x.size(); i++)
            if(x.get(i)>first)
                first=x.get(i);
        return first;
    }
    public int getTopBound() {
        int first = y.get(0);
        for(int i=0; i<y.size(); i++)
            if(y.get(i)<first)
                first=y.get(i);
        return first;
    }
    public int getBottomBound(){
        int first = y.get(0);
        for(int i=0; i<y.size(); i++)
            if(y.get(i)>first)
                first=y.get(i);
        return first;
    }
    
    public void fromString(String objectString) {
        String arguments = objectString.substring(objectString.indexOf("(")+1, objectString.indexOf(")"));
        String[] params = arguments.split(",");
        for(int i=0; i<params.length; i+=2) {
            x.add(Integer.parseInt(params[i]));
            y.add(Integer.parseInt(params[i+1]));
        }
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
