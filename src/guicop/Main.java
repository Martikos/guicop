/**
 * @author M4rc Adam
 * Department of Electrical and Computer Engineering
 * Faculty of Engineering and Architecture
 * American University of Beirut
 */
package guicop;

import java.util.ArrayList;

public class Main {

    private static officer guicop = new officer();
    private static String speclocation = "spec";
    private static String outlocation = "out";

    public static void main(String[] args) throws Exception {

        boolean help = false;
        ArrayList<String> objects = new ArrayList();

        for(int i=0; i<args.length; i++) {
            if(args[i].equals("-spec"))
            {
                speclocation = args[i + 1];
                args[i+1] = "";
            }
            else if(args[i].equals("-out"))
            {
                outlocation = args[i + 1];
                args[i+1] = "";
            }
            else if(args[i].equals("--help")) {
                help = true;
                System.out.println("GUICop help manual");
            }
            else
                if(!args[i].equals(""))
                    objects.add(args[i]);
        }

        if(!help) {
            guicop.readOut(outlocation);
            guicop.readSpec(speclocation);

            for(int i=0; i<objects.size(); i++)
                guicop.check(objects.get(i));

        }

        /*
        String specFile = "/home/elm/sandbox/aub/fyp/guicop-specification-language/specSample";
        String outFile = "/home/elm/sandbox/aub/fyp/guicop-specification-language/outSample";

        try {
            guicop.readSpec(specFile);
            guicop.readOut(outFile);

            guicop.check("calculator");
     //       guicop.printList();
        } catch (Exception e) {
            e.printStackTrace();
        }
         */
    }
}
