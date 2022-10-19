package homeworks;

import utilities.ScannerHelper;
import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

    //TASK-1
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~TASK 1~~~~~~~~~~~~~~~~~~~~\n");

        String result = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) result += i + " - ";
        }
        System.out.println(result.substring(0,result.length()-3));

    //TASK-2
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~TASK 2~~~~~~~~~~~~~~~~~~~~\n");

        String result2 = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) result2 += i + " - ";
        }
        System.out.println(result2.substring(0,result2.length()-3));

    //TASK-3
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~TASK 3~~~~~~~~~~~~~~~~~~~~\n");

        String result3 = "";
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) result3 += i + " - ";
        }
        System.out.println(result3.substring(0,result3.length()-3));

    //TASK-4
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~TASK 4~~~~~~~~~~~~~~~~~~~~\n");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i * i);
        }

    //TASK-5
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~TASK 5~~~~~~~~~~~~~~~~~~~~\n");

        int container = 0;
        for (int i = 1; i <= 10; i++) {
            container += i;
        }
        System.out.println(container);

    //TASK-6
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~TASK 6~~~~~~~~~~~~~~~~~~~~\n");

    int userNumber = ScannerHelper.getANumber();
    int j = 1, fact = 1;

        while (j <= userNumber){
            fact *= j;
            j++;
        }
        System.out.println(fact);

    //TASK-7
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~TASK 7~~~~~~~~~~~~~~~~~~~~\n");

        String fullName = ScannerHelper.getAFullName();
        int vowels = 0;
        for (int i = 0; i < fullName.toLowerCase().length(); i++) {
            char vow = fullName.toLowerCase().charAt(i);
            if (vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u' ){
                vowels++;
            }
        }
        System.out.println("There are " + vowels + " vowel letters in this full name");

    //TASK-8
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~TASK 8~~~~~~~~~~~~~~~~~~~~\n");

        int number = ScannerHelper.getANumber();
        if (number >= 100) System.out.println("This number is already more than 100");
        else {
            int sumOfTheGivenNumber = number;
            do {
                int number1 = ScannerHelper.getANumber();
                sumOfTheGivenNumber += number1;
            }
            while (sumOfTheGivenNumber < 100);
            System.out.println("Sum of the entered numbers is at least 100");
        }

        //TASK-9
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~TASK 9~~~~~~~~~~~~~~~~~~~~\n");

        int userNumber1 = ScannerHelper.getANumber();
        int fiboNum1 = 0;
        int fiboNum2 = 1;

        for (int i = 0; i < userNumber1; i++) {
            System.out.print(fiboNum1 + " - ");
            int fiboLogic = fiboNum1 + fiboNum2;
            fiboNum1 = fiboNum2;
            fiboNum2 = fiboLogic;
        }

        //TASK-10
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~TASK 10~~~~~~~~~~~~~~~~~~~~\n");
        Scanner input = new Scanner(System.in);
        String userGivenName;
        int counter = 1;
        do {
            System.out.println("Please enter the name");
            userGivenName = input.nextLine();
            if (userGivenName.toLowerCase().charAt(0) != 'j');
        }while (userGivenName.toLowerCase().charAt(0) != 'j');
            System.out.println("End of the program");

    }
}
