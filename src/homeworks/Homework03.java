package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //TASK1
        System.out.println("\t\n~~~~~~~Task 1~~~~~~~\n");
        System.out.println("Please enter 2 numbers:");
        int number1, number2;
        number1 = input.nextInt();
        number2 = input.nextInt();
        System.out.println("The difference between numbers is = " + Math.abs(number1 - number2));

        //TASK2
        System.out.println("\t\n~~~~~~~Task 2~~~~~~~\n");
        System.out.println("Please enter 5 numbers:");
        int num1, num2, num3, num4, num5;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();
        System.out.println("Max value = " + Math.max(Math.max(Math.max(num1, num2), (Math.max(num3, num4))), num5));
        System.out.println("Min value = " + Math.min(Math.min(Math.min(num1, num2), (Math.min(num3, num4))), num5));

        //TASK3
        System.out.println("\t\n~~~~~~~Task 3~~~~~~~\n");

        int myRandom1 = (int) (Math.random() * (100 - 50 + 1) + 50);
        int myRandom2 = (int) (Math.random() * (100 - 50 + 1) + 50);
        int myRandom3 = (int) (Math.random() * (100 - 50 + 1) + 50);
        System.out.println("Number 1 = " + myRandom1);
        System.out.println("Number 2 = " + myRandom2);
        System.out.println("Number 3 = " + myRandom3);
        System.out.println("The sum of the numbers is = " + (myRandom1 + myRandom2 + myRandom3));

        //TASK4
        System.out.println("\t\n~~~~~~~Task 4~~~~~~~\n");

        int alexMoney = 125;
        int mikeMoney = 220;
        double alexMoneyd = alexMoney;
        double mikeMoneyd = mikeMoney;
        double aToM = 25.5;
        System.out.println("Alex's money: $" + (alexMoneyd - aToM));
        System.out.println("Mike's money: $" + (mikeMoneyd + aToM));

        //TASK5
        System.out.println("\t\n~~~~~~~Task 5~~~~~~~\n");

        double bicyclePrice = 390;
        double savingPerDay = 15.60;
        System.out.println("The price of the bicycle is = $" + bicyclePrice);
        System.out.println("David can save $" + savingPerDay + " per day.");
        System.out.println("David can buy a bicycle in " + (int) (bicyclePrice / savingPerDay) + " days.");

        //TASK6
        System.out.println("\t\n~~~~~~~Task 6~~~~~~~\n");

        String s1 = "5", s2 = "10";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("Sum of " + i1 + " and " + i2 + " is = " + (i1 + i2));
        System.out.println("Product of " + i1 + " and " + i2 + " is = " + (i1 * i2));
        System.out.println("Division of " + i1 + " and " + i2 + " is = " + (i1 / i2));
        System.out.println("Subtraction of " + i1 + " and " + i2 + " is = " + (i1 - i2));
        System.out.println("Remainder of " + i1 + " and " + i2 + " is = " + (i1 % i2));

        //TASK7
        System.out.println("\t\n~~~~~~~Task 7~~~~~~~\n");

        String st1 = "200", st2 = "-50";
        int int1 = Integer.parseInt(st1);
        int int2 = Integer.parseInt(st2);

        System.out.println("The greatest value is = " + Math.max(int1, int2));
        System.out.println("The smallest value is = " + Math.min(int1, int2));
        System.out.println("The average is = " + ((int1 + int2) / 2));
        System.out.println("The absolute difference is = " + Math.abs(int1 - int2));

        //TASK8
        System.out.println("\t\n~~~~~~~Task 8~~~~~~~\n");

        double quarters = (0.25 * 3);
        double dime = (0.10);
        double nickels = (0.05 * 2);
        double penny = (0.01);
        double savingPerDay2 = (quarters + dime + nickels + penny);

        double res1 = 24 / savingPerDay2;
        double res2 = 168 / savingPerDay2;
        double res3 = (savingPerDay2 * 30) * 5;
        int result1 = (int) res1;
        int result2 = (int) res2;
        System.out.println("You can save 24$ in " + result1 + " days.");
        System.out.println("You can save 168$ in " + result2 + " days.");
        System.out.println("In a 5 month's you can save $" + res3);

        //TASK9
        System.out.println("\t\n~~~~~~~Task 9~~~~~~~\n");

        double newComputer = 1250;
        double savingsJessie = 62.5;
        int dayNeeds = (int) newComputer / (int) savingsJessie;
        System.out.println("It will take " + dayNeeds + " days for Jessie to buy the computer.");

        //TASK10
        System.out.println("\t\n~~~~~~~Task 10~~~~~~~\n");

        double newCarCost = 14265;
        double option1Payments = 475.50;
        double option2Payments = 951;
        int option1Month = (int) newCarCost / (int) option1Payments;
        int option2Month = (int) newCarCost / (int) option2Payments;
        System.out.println("Option 1 will take " + option1Month + " months");
        System.out.println("Option 2 will take " + option2Month + " months");

        //TASK11
        System.out.println("\t\n~~~~~~~Task 11~~~~~~~\n");

        System.out.println("Please enter 2 numbers:");
        int userNumber1 = input.nextInt(), userNumber2 = input.nextInt();
        double result = (double) userNumber1 / (double) userNumber2;
        System.out.println("The result is: " + result);

        //TASK12
        System.out.println("\t\n~~~~~~~Task 12~~~~~~~\n");

        int randomNumber1 = (int) (Math.random() * (-100 + 1) + 100);
        int randomNumber2 = (int) (Math.random() * (-100 + 1) + 100);
        int randomNumber3 = (int) (Math.random() * (-100 + 1) + 100);

        System.out.println(randomNumber1 > 25 && randomNumber2 > 25 && randomNumber3 > 25);

        //TASK13
        System.out.println("\t\n~~~~~~~Task 13~~~~~~~\n");

        System.out.println("Please enter number between 1 and 7 :");
        int userNum = input.nextInt();
        if (userNum == 1) {
            System.out.println("The number entered returns MONDAY");
        } else if (userNum == 2) {
            System.out.println("The number entered returns TUESDAY");
        } else if (userNum == 3) {
            System.out.println("The number entered returns WEDNESDAY");
        } else if (userNum == 4) {
            System.out.println("The number entered returns THURSDAY");
        } else if (userNum == 5) {
            System.out.println("The number entered returns FRIDAY");
        } else if (userNum == 6) {
            System.out.println("The number entered returns SATURDAY");
        } else if (userNum == 7) {
            System.out.println("The number entered returns SUNDAY");
        }
        System.out.println("End of the program");

        //TASK14
        System.out.println("\t\n~~~~~~~Task 14~~~~~~~\n");

        System.out.println("Please enter your exam results:");
        int test1 = input.nextInt();
        int test2 = input.nextInt();
        int test3 = input.nextInt();
        if ((test1 + test2 + test3) / 3 >= 70) {
            System.out.println("YOU PASSED!");
        } else {
            System.out.println("YOU FAILED!");
        }
        System.out.println("End of the program");

        //TASK15
        System.out.println("\t\n~~~~~~~Task 15~~~~~~~\n");

        int usNum1 = input.nextInt();
        int usNum2 = input.nextInt();
        int usNum3 = input.nextInt();

        if (usNum1 == usNum2 && usNum1 == usNum3) {
            System.out.println("TRIPLE MATCH");
        } else if (usNum1 == usNum2 || usNum1 == usNum3 || usNum2 == usNum3) {
            System.out.println("DOUBLE MATCH");
        } else {
            System.out.println("NO MATCH");
        }
        System.out.println("End of the program");

    }
}