package mathClass;

import java.util.Scanner;

public class SquareRootMethod {

    public static void main(String[] args) {

        // THIS METHOD CALLED SQRT sqrt(36) -> 6 -> 6*6

        int number = 81;
        int number2 = 25;
        int number3 = 64;

        System.out.println("Root of number is " + Math.sqrt(number));
        System.out.println("Root of number 2 is " + Math.sqrt(number2));
        System.out.println("Root of number 3 is " + Math.sqrt(number3));

        Scanner inputTaker = new Scanner(System.in);

        System.out.println("\nHey use, give me a number");
        double userNumber = inputTaker.nextDouble();
        System.out.println("Your number root is: " + Math.sqrt(userNumber));
    }
}
