package practice.methods;

import java.util.Scanner;

public class ReturnMethodPractices {
    public static void main(String[] args) {
        System.out.println(ReturnMethodPractices.findDifference(6, 9));
        System.out.println(ReturnMethodPractices.findDifference(4, 1));
        System.out.println(ReturnMethodPractices.findDifference(99, 23));

        System.out.println(ReturnMethodPractices.isIncluded("John","John Doe"));
        System.out.println(ReturnMethodPractices.isIncluded("John Doe","John"));
        System.out.println(ReturnMethodPractices.isIncluded("green, blue, red","blue"));
        System.out.println(ReturnMethodPractices.isIncluded("John","blue"));
    }

    Scanner input = new Scanner(System.in);


    public static int findDifference(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    public static double findDifference(double num1, double num2) {
        return Math.abs(num1 - num2);
    }

    /*

     */

    public static boolean isIncluded (String str1, String str2){
        //IF IS STR1 CONTAINING STR2 OR STR2 CONTAINING STR1
        return str1.contains(str2) || str2.contains(str1);
//        if (str1.length() > str2.length()) return str1.contains(str2);
//        return str2.contains(str1);
    }

    }
