package conditional_statemants.if_elseif_else_leadder_statements;

import java.util.Scanner;

public class Exercise1_PositiveOrNegativeOrZero {
    public static void main(String[] args) {

                /*
        Write a program that asks user to enter a number
        if number is more than zero, print "POSITIVE"
        if number is less than zero, print "NEGATIVE"
        Otherwise, print "ZERO"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number > 0 ){
            System.out.println("POSITIVE");
        }
        else if (number < 0) {
            System.out.println("NEGATIVE");
        }
        else {
            System.out.println("ZERO");
        }
        System.out.println("End of the program");

        //
        }
    }
