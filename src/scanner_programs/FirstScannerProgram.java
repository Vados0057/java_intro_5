package scanner_programs;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {

        //1. Create a Scanner object

        //dataType VarName = value;

        String firstName, lastName;

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        firstName = inputReader.next(); // John
        System.out.println("Please enter your last name:");
        lastName = inputReader.next();

        /*
        next - one word, nextLine - many words(Whole line)  ( Both are used to read strings from the user)
        */

        System.out.println("Your full name is = " + firstName + " " + lastName);


    }
}