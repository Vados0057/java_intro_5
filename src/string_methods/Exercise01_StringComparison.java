package string_methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise01_StringComparison {
    public static void main(String[] args) {
        /*
            Write a Java program that asks user to enter 2 strings
            And store answers of user in different String variables
            Finally, check if given 2 Strings are equal or not and print messages given below

            Test data 1:
            Java is fun
            Hello World

            Expected output 1:
            These strings are not equal

            Test data 2:
            Hello
            Hello

            Expected output 2:
            These strings are equal
             */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first message");
        String s1 =input.next();
        System.out.println("Enter second message");
        String s2 =input.next();

        if (s1.equals(s2)){
            System.out.println("These strings are equal\n");
        }else {
            System.out.println("These strings are not equal");
        }


        String str1 = ScannerHelper.getAString();
        String str2 = ScannerHelper.getAString();

       if (str1.equals(str2)) System.out.println("These strings are equal");
       else System.out.println("These strings are not equal");

       // System.out.println(ScannerHelper.getAString().equals(ScannerHelper.getAString()) ? "These strings are equal" : "These strings are not equal");
    }

}
