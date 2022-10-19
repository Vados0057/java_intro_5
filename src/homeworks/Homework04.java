package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

       //Task1
       System.out.println("\n===========TASK 1===========");

       String name = ScannerHelper.getAName();

       System.out.println("Given name - " + name);
       System.out.println("The length of the name is = " + name.length());
       System.out.println("The first character in the name is = " + name.charAt(0));
       System.out.println("The last character in the name is = " + name.substring(name.length()-1));
       System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
       System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));
       if (name.startsWith("A")){
           System.out.println("You are in the club!");
       } else if (name.startsWith("a")) {
           System.out.println("You are in the club");
       }
       else {
           System.out.println("Sorry, you are not in the club");
       }

       //Task2
       System.out.println("\n===========TASK 2===========");

       String address = ScannerHelper.getAnAddress();

       if (address.toLowerCase().contains("chicago")){
           System.out.println("You are in the club");
       } else if (address.toLowerCase().contains("des plaines")) {
           System.out.println("You are welcome to join to the club");
       }else {
           System.out.println("Sorry, you will never be in the club");
       }
        //Task3
        System.out.println("\n===========TASK 3===========");

        String favColors = ScannerHelper.getAColors();
        if (favColors.toLowerCase().contains("green") && favColors.toLowerCase().contains("red")){
            System.out.println("Green and Red are in the list");
        } else if (favColors.toLowerCase().contains("green")) {
            System.out.println("Green is in the list");
        } else if (favColors.toLowerCase().contains("red")) {
            System.out.println("Red is in the list");
        }else {
            System.out.println("Green and Red are not in the list");
      }

        //Task4
        System.out.println("\n===========TASK 4===========");

        String str1 = "  Java is FUN   ";
        String str2 = str1.toLowerCase().trim();
        System.out.println("The first word in the str is = " + str2.substring(0,4));
        System.out.println("The second word in the str is = " + str2.substring(5,7));
        System.out.println("The third word in the str is = " + str2.substring(8,11));

    }
}
