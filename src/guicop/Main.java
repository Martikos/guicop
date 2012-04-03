/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package guicop;

public class Main {
    public static void main(String[] args) {
        officer blart = new officer();
        
        String outLocation = "/home/elm/sandbox/aub/fyp/testcases/calc/out";
        try {
            blart.readOut(outLocation);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
