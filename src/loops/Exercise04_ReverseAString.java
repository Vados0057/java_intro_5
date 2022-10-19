package loops;

import utilities.ScannerHelper;

public class Exercise04_ReverseAString {
    public static void main(String[] args) {


                                                /*
                        Write a program that reads a name from user
                        Reverse the name and print it back

                        Test data:
                        James

                        Expected Output:
                        semaJ

                        Test data:
                        John

                        Expected Output:
                        nhoJ
                          */


        String name = ScannerHelper.getAName();
        String newName = "";

        for (int i = name.length()-1; i >=0; i--) {
        newName += name.charAt(i);
        }
        System.out.println("The reversed name is = " + newName);
    }
}