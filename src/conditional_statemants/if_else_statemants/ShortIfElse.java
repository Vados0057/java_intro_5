package conditional_statemants.if_else_statemants;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShortIfElse {
    public static void main(String[] args) {
        /*
        Write a program to ask user  to enter 2 different numbers
        nd find the max number and print it with the message as bellow


         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers:");
        int number1 = input.nextInt(), number2 = input.nextInt();

        if (number1 < number2) System.out.println(number2 + " is the greatest");
        else System.out.println(number1 + " is the greatest");
        System.out.println("End of the program");
    }
}
