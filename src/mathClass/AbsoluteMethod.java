package mathClass;

import java.util.Scanner;

public class AbsoluteMethod {

    public static void main(String[] args) {

        // ONLY POSITIVE NUMBER
        System.out.println("Difference between your numbers is = " + Math.abs(10 - 14));
        System.out.println("Difference between your numbers is = " + Math.abs(14 - 10));
        System.out.println("Difference between your numbers is = " + (10 - 14));

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHey user, please enter an age:");
        int userAge1 = scanner.nextInt();
        System.out.println("Hey user, please enter another age:");
        int userAge2 = scanner.nextInt();
        System.out.println("Difference between your ages is = " + Math.abs(userAge1 - userAge2));

        //EXTRA
        System.out.println("Min age is: " + Math.min(userAge1, userAge2));
        System.out.println("Max age is: " + Math.max(userAge1, userAge2));
    }
}
