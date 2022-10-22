package projects;

import utilities.ScannerHelper;

public class Project04 {
    public static void main(String[] args) {


        //TASK 1
        System.out.println("\n~~~~~~~~~~~~~~~TASK 1~~~~~~~~~~~~~~~");

        /*
        String: " TechGlobal"
        Swap to: "obalGlTech
        TechGlobal - Tech Gl obal
         */

        String str = ScannerHelper.getAString();
        String newStr = "";
        if (str.length() < 8) System.out.println("This String does not have 8 characters");
        else {
           newStr = str.substring(str.length()/2+1) + str.substring(str.length()/2-1, str.length()/2+1) +
                   str.substring(0,str.length()/2-1);
            System.out.println(newStr);
        }

        //TASK 2
        System.out.println("\n~~~~~~~~~~~~~~~TASK 2~~~~~~~~~~~~~~~");












    }
}
