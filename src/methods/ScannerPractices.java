package methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class ScannerPractices {
    public static void main(String[] args) {

        /*
        Write a program that asks usr to enter their name and age
        Print the info in bellow format

        {name}'s age is {age}.

        Scanner input = new Scanner(System.in);
        System.out.println("Hey, enter your name: ");
        String name = input.next();

        System.out.println("Hey, enter your age: ");
        int age = input.nextInt();

        System.out.println(name + "'s age is " + age + ".");

        BEFORE IT WAS LIKE THAT, NOW ITS EASIER
         */

        String name1 = ScannerHelper.getAName();
        int age = ScannerHelper.getAnAge();
        System.out.println(name1 + "'s age is " + age + ".");

        //OR

        System.out.println(ScannerHelper.getAName() + "'s age is " + ScannerHelper.getAnAge() + "." +
                             "\nAddress is: " + ScannerHelper.getAnAddress());

    }
}
