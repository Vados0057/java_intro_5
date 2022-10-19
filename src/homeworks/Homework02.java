package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        //TASK - 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t=========Task 1=========\n");

        System.out.println("Please, enter 2 numbers:");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 + num2));

        //TASK - 2
        System.out.println("\n\t=========Task 2=========\n");

        System.out.println("Please, enter 2 numbers:");
        int number1 = scanner.nextInt(), number2 = scanner.nextInt();

        System.out.println("The product of the given 2 numbers is: " + (number1 * number2));

        //TASK - 3
        System.out.println("\n\t=========Task 3=========\n");

        System.out.println("Please, enter 2 numbers:");
        double floatNum1 = scanner.nextDouble(), floatNum2 = scanner.nextDouble();

        System.out.println("The sum of the given numbers is = " + (floatNum1 + floatNum2));
        System.out.println("The product of the given numbers is = " + (floatNum1 * floatNum2));
        System.out.println("The subtraction of the given numbers is = " + (floatNum1 - floatNum2));
        System.out.println("The division of the given numbers is = " + (floatNum1 / floatNum2));
        System.out.println("The remainder of the given numbers is =" + (floatNum1 % floatNum2));

        //TASK - 4
        System.out.println("\n\t=========Task 4=========\n");

        System.out.println(-10 + (7 * 5));
        System.out.println((72 + 24) % 24);
        System.out.println(10 + (-3 * 9) / 9);
        System.out.println(5 + 18 / 3 * 3 - (6 % 3));

        //TASK - 5
        System.out.println("\n\t=========Task 5=========\n");

        System.out.println("Please, enter 2 numbers:");
        int number_1 = scanner.nextInt(), number_2 = scanner.nextInt();
        System.out.println("The average of the given numbers is: " + ((number_1 + number_2) / 2));

        //TASK - 6
        System.out.println("\n\t=========Task 6=========\n");

        System.out.println("Please, enter 5 numbers:");
        int num_1 = scanner.nextInt(), num_2 = scanner.nextInt(), num_3 = scanner.nextInt(),
                num_4 = scanner.nextInt(), num_5 = scanner.nextInt();
        System.out.println("The average of the given numbers is: " + (num_1 + num_2 + num_3 + num_4 + num_5) / 5);

        //TASK - 7
        System.out.println("\n\t=========Task 7=========\n");

        System.out.println("Please, enter 3 numbers:");
        int i1 = scanner.nextInt(), i2 = scanner.nextInt(), i3 = scanner.nextInt();
        System.out.println("The " + i1 + " multiplied with " + i1 +  " is = " + (i1 * i1) );
        System.out.println("The " + i2 + " multiplied with " + i2 +  " is = " + (i2 * i2) );
        System.out.println("The " + i3 + " multiplied with " + i3 +  " is = " + (i3 * i3) );

        //TASK - 8
        System.out.println("\n\t=========Task 8=========\n");

        System.out.println("Please, enter the side of a square");
        int side = scanner.nextInt();

        System.out.println("Perimeter of the square = " + (4 * side));
        System.out.println("Area of the square = " + (side * side));

        //TASK - 9
        System.out.println("\n\t=========Task 9=========\n");

        double yearlySalary = 90_000;
        System.out.println("A Software Engineer in Test can earn " + (yearlySalary * 3) + " in 3 years");

        //TASK - 10
        System.out.println("\n\t=========Task 10=========\n");

        String favBook, favColor;
        int favNumber;
        scanner.nextLine();
        System.out.println("Please enter your favorite book: ");
        favBook = scanner.nextLine();
        System.out.println("Please enter your favorite color: ");
        favColor = scanner.nextLine();
        System.out.println("Please enter your favorite number");
        favNumber = scanner.nextInt();

        System.out.println("User's favorite book is: " + favBook);
        System.out.println("User's favorite color is: " + favColor);
        System.out.println("User's favorite number is: " + favNumber);

        //TASK - 11
        System.out.println("\n\t=========Task 11=========\n");

        String firstName, lastName, emailAddress, phoneNumber, address;
        int age;
        scanner.nextLine();
        System.out.println("Please enter your name: ");

        firstName = scanner.nextLine();
        System.out.println("Please enter last name: ");
        lastName = scanner.nextLine();
        System.out.println("Please enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your email: ");
        emailAddress = scanner.nextLine();
        System.out.println("Please enter your phone number: ");
        phoneNumber = scanner.nextLine();
        System.out.println("Please enter your address: ");
        address = scanner.nextLine();
        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + ". John’s  age is\n" + age + "." + " John’s email " +
                "address is " + emailAddress + ",phone number\nis " + phoneNumber + ", and address is " + address + "." );

    }
}
