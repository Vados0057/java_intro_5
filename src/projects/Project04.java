package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //TASK 1
        System.out.println("\n~~~~~~~~~~~~~~~TASK 1~~~~~~~~~~~~~~~");

        /*
        String: " TechGlobal"
        Swap to: "obalGlTech
        TechGlobal - Tech Gl obal
         */

        String str = ScannerHelper.getAString();
        String newStr = "";
        if (str.length() < 8) System.out.println("This String does not have 8 characters");
        else {
            newStr = str.substring(str.length() / 2 + 1) + str.substring(str.length() / 2 - 1, str.length() / 2 + 1) +
                    str.substring(0, str.length() / 2 - 1);
            System.out.println(newStr);
        }

        //TASK 2
        System.out.println("\n~~~~~~~~~~~~~~~TASK 2~~~~~~~~~~~~~~~");

        System.out.println("Please enter a sentence");
        str = input.nextLine().trim();
        if (str.contains(" ")) {

            String firstPart = str.substring(0, str.indexOf(" "));
            String middlePart = str.substring(str.indexOf(' '), str.lastIndexOf(' ') + 1);
            String lastPart = str.substring(str.lastIndexOf(' ') + 1);

            System.out.println(lastPart + middlePart + firstPart);
        } else System.out.println("This sentence does not have 2 or more words to swap");

        //TASK 3
        System.out.println("\n~~~~~~~~~~~~~~~TASK 3~~~~~~~~~~~~~~~");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println(str1.replace("stupid", "nice").replace("idiot", "nice"));
        System.out.println(str2.replace("stupid", "nice").replace("idiot", "nice"));
        System.out.println(str3.replace("stupid", "nice").replace("idiot", "nice"));

        //Task4
        System.out.println("\n~~~~~~~~~~~~~~~TASK 4~~~~~~~~~~~~~~~\n");

        String name = ScannerHelper.getAName();
        if (name.length() > 2) {
            if (name.length() % 2 == 0)
                System.out.println(name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
            else System.out.println(name.substring(name.charAt(name.length() / 2)));
        } else System.out.println("Invalid Input!!!");

        //Task5
        System.out.println("\n~~~~~~~~~~~~~~~TASK 5~~~~~~~~~~~~~~~\n");

        System.out.println("Please enter a country");
        String country = input.nextLine();
        if (country.length() > 5)
            System.out.println(country.substring(2, country.length() - 2));
        else System.out.println("Invalid input!!!");

        //Task6
        System.out.println("\n~~~~~~~~~~~~~~~TASK 6~~~~~~~~~~~~~~~\n");

        /*
                Write a program that asks user to enter their full address.
        Replace all letter ‘a’ or ‘A’ with ‘*’
        Replace all letter ‘e’ or ‘E’ with ‘#’
        Replace all letter ‘i’ or ‘I’ with ‘+’
        Replace all letter ‘u’ or ‘U’ with ‘$’
        Replace all letter ‘o’ or ‘O’ with ‘@’
        Then, print result after replacements
         */

        String address = ScannerHelper.getAnAddress();

        address = address.replace('a', '*').replace('A', '*').
                replace('e', '#').replace('E', '#').
                replace('i', '+').replace('I', '+').
                replace('u', '$').replace('U', '$').
                replace('o', '@').replace('O', '@');
        System.out.println(address);

        //Task7
        System.out.println("\n~~~~~~~~~~~~~~~TASK 7~~~~~~~~~~~~~~~\n");

        /*
            Write a program that generates 2 random numbers between 0 and 25 (0 and
        25 are included), Then print all numbers between 2 random numbers that
        cannot be divided by 5 in ascending order.
         */

        int random1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int random2 = RandomNumberGenerator.getARandomNumber(0, 25);
        System.out.println(random1);
        System.out.println(random2);
        String sequence = "";
        for (int i = Math.min(random1, random2); i <= Math.max(random1, random2); i++) {
            if (i % 5 != 0) sequence += i + " - ";
        }
        System.out.println(sequence.substring(0, sequence.length() - 3));

        /**
         *********  OTHER SOLUTION  *********
         */

        int num7A = RandomNumberGenerator.getARandomNumber(0,25);
        int num7B = RandomNumberGenerator.getARandomNumber(0,25);

        String ans7 = "";

        for (int i = Math.min(num7A,num7B); i <= Math.max(num7A,num7B); i++) {
            if (i %5 != 0) {
                ans7 += i;
                if(i + 1 == Math.max(num7A,num7B) && i % 5 != 0) break;
                else {

                }
            }
        }
        System.out.println("Random number 1 = " + num7A);
        System.out.println("Random number 2 = " + num7B);
        System.out.println(ans7);


        //Task8
        System.out.println("\n~~~~~~~~~~~~~~~TASK 8~~~~~~~~~~~~~~~\n");

        /*
            Write a program that asks user to enter a sentence as a String, and count
        how many words that sentence has, and print it with given below message.
        NOTE: Write a program that handles any String
        NOTE: First check if the given sentence has 2 words at least. If not, then just
        print “This sentence does not have multiple words”
         */

        System.out.println("Please enter a sentence");
        String newSentence = input.nextLine();
        int count = 0;
        for (int i = 0; i < newSentence.length(); i++) {
            if (newSentence.charAt(i) == ' ')
                count++;
        }
        if (count > 0)
            System.out.println("This sentence has " + (count + 1) + " words.");
        else
            System.out.println("This sentence does not have multiple words");

        /**
         *********  OTHER SOLUTION  *********
         */
        System.out.println("please enter a String: ");
        String other8 = input.nextLine().trim(); // I love animals [I], [love], [animals]
        input.nextLine();
        if (other8.contains(" ")) {
            String[] array8 = other8.split(" ");
            System.out.println("This sentence has " + array8.length + " words.");
        }else {
            System.out.println("this sentence does not have multiple words");
        }

        //Task9
        System.out.println("\n~~~~~~~~~~~~~~~TASK 9~~~~~~~~~~~~~~~\n");

        /*
                Write a program that asks user to enter a positive number.
        Print all the number starting from 1 to given number. But, print “Foo” for the
        numbers divided by 2, “Bar” for the numbers divided by 3 and “FooBar” for
        the numbers divided by both 2 and 3.
         */

        int num = ScannerHelper.getANumber();
        System.out.println(" Positive number is " + num);
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }


        //Task 10
        System.out.println("\n~~~~~~~~~~~~~~~TASK 10~~~~~~~~~~~~~~~\n");

        /*
            Write a program that asks user to enter a word, and check if it is palindrome or not.
        Palindrome: It is a word that is read the same backward as forward
        •EXAMPLE: kayak, civic, madam
         */

        String strin = ScannerHelper.getAString();
        String rev = "";

            for (int i1 = strin.length()-1; i1 >= 0; i1--) {
                rev += strin.charAt(i1);
            }
        if (strin.equals(rev)){
            System.out.println(strin + " is palindrome");
        }
        else{
            System.out.println(strin + " is not palindrome");
        }

        /**
         *********  OTHER SOLUTION  *********
         */

        System.out.println("Please enter a string: ");
        String other10 = input.nextLine();
        boolean isPalindrome = true;
        if (other10.length() < 1) System.out.println("This word does not have 1 or more characters");
        else {
            for( int i = 0, j = other10.length() - 1; i < other10.length() / 2; i++, j--){
                if (other10.charAt(i) == other10.charAt(j)){
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) System.out.println("This word is a palindrome.");
            else System.out.println("This word is a palindrome.");
        }

        //Task 11
        System.out.println("\n~~~~~~~~~~~~~~~TASK 11~~~~~~~~~~~~~~~\n");

        /*
            Write a program that asks user to enter a sentence as a String and count
        how many a or A letters that sentence has and print it with given below
        message.
         */

        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();
        sentence = sentence.toLowerCase();
        int counter = 0;
        if (sentence.length() > 0){
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == 'a') counter++;
            }
            System.out.println("This sentence has " + counter + " a or A letters");
        }

        else System.out.println("This sentence does not have any characters");

        /**
             *********  OTHER SOLUTION  *********
         */

        System.out.println("Please enter a string");
        String other = input.nextLine();
        int counterOfA = 0;
        if (other.length() == 0) System.out.println("This sentence does not have any characters.");
        else {
            for (int i = 0; i < other.length(); i++) {
                if (other.charAt(i) == 'a' || other.charAt(i) == 'A') counterOfA++;
            }
        }
        System.out.println("This sentence ha " + counterOfA + " a or A letters.");
    }
}