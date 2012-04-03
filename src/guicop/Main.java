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

        String specFile = "/home/elm/sandbox/aub/fyp/guicop-specification-language/specSample";
        String outFile = "/home/elm/sandbox/aub/fyp/guicop-specification-language/outSample";

        try {
            blart.readSpec(specFile);
     //       blart.readOut(outFile);
     //       blart.printList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
