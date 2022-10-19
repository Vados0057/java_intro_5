package projects;

import java.util.Scanner;

public class Project02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //TASK - 1
        System.out.println("\t\n ~~~~~~~~~~TASK 1~~~~~~~~~~\n" );

        System.out.println("Please enter 3 numbers:");
        int num1, num2, num3;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        System.out.println("The product of the numbers entered is = " + (num1 * num2 * num3) + ".");

        //TASK - 2
        System.out.println("\t\n ~~~~~~~~~~TASK 2~~~~~~~~~~\n" );
        input.nextLine();
        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.println("What is your year of birth?");
        int yearOfBirth = input.nextInt(), currentYear = 2022;
        input.nextLine();
        System.out.println(firstName + " " + lastName + "'s" + " age is = " + (currentYear - yearOfBirth) + ".");

        //TASK - 3
        System.out.println("\t\n ~~~~~~~~~~TASK 3~~~~~~~~~~\n" );
        System.out.println("What is your full name?");
        String fullName = input.nextLine();
        System.out.println("What is your weight?");
        int weight = input.nextInt();
        double kgToLbs = 2.205;
        System.out.println(fullName + "'s weight is = " + (weight * kgToLbs) + " lbs.");

        //TASK - 4
        System.out.println("\t\n ~~~~~~~~~~TASK 4~~~~~~~~~~\n" );
        input.nextLine();
        System.out.println("What is your full name?");
        String student1fName = input.nextLine();
        System.out.println("What is your age?");
        int student1age = input.nextInt();
        input.nextLine();
        System.out.println("What is your full name?");
        String student2fName = input.nextLine();
        System.out.println("What is your age?");
        int student2age = input.nextInt();
        input.nextLine();
        System.out.println("What is your full name?");
        String student3fName = input.nextLine();
        System.out.println("What is your age?");
        int student3age = input.nextInt();
        input.nextLine();
        System.out.println(student1fName + "'s age is " + student1age + "." );
        System.out.println(student2fName + "'s age is " + student2age + "." );
        System.out.println(student3fName + "'s age is " + student3age + "." );
        System.out.println("\nThe average age is " + ((student1age + student2age + student3age) / 3 + "."));
        System.out.println("The eldest age is " + Math.max(Math.max(student1age,student2age), student3age));
        System.out.println("The youngest age is " + Math.min(Math.min(student1age,student2age), student3age));




    }
}
