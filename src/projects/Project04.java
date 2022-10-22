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
        StringBuilder newStr = new StringBuilder();
        if (str.length() < 8) System.out.println("This String does not have 8 characters");
        else {
            for (int i = str.length() /2; i >0; i--) {
            str.substring(1,1);
            }
            System.out.println(newStr);
        }





        //TASK3





    }
}
