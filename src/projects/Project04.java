package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {


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
           newStr = str.substring(str.length()/2+1) + str.substring(str.length()/2-1, str.length()/2+1) +
                   str.substring(0,str.length()/2-1);
            System.out.println(newStr);
        }

        //TASK 2
        System.out.println("\n~~~~~~~~~~~~~~~TASK 2~~~~~~~~~~~~~~~");

       Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        str = input.nextLine();
        str = str.trim();
        if (str.contains(" ")){

            String firstPart = str.substring(0, str.indexOf(" "));
            String middlePart = str.substring(str.indexOf(' '), str.lastIndexOf(' ')+1);
            String lastPart = str.substring(str.lastIndexOf(' ')+ 1);

            System.out.println(lastPart + middlePart + firstPart);
        }
        else System.out.println("This sentence does not have 2 or more words to swap");


        //TASK 3
        System.out.println("\n~~~~~~~~~~~~~~~TASK 3~~~~~~~~~~~~~~~");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = " had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println(str1.replace("stupid", "nice").replace("idiot", "nice"));
        System.out.println(str2.replace("stupid", "nice").replace("idiot", "nice"));
        System.out.println(str3.replace("stupid", "nice").replace("idiot", "nice"));


        //Task4
        System.out.println("\n~~~~~~~~~~~~~~~TASK 4~~~~~~~~~~~~~~~\n");
        String name = ScannerHelper.getAName();
        if (name.length() > 2){
            if (name.length() % 2 == 0) System.out.println(name.substring(name.length()/2 -1, name.length() /2 +1));
            else System.out.println(name.substring(name.charAt(name.length()/2)));
        }else System.out.println("Invalid Input!!!");

        //Task5
        System.out.println("\n~~~~~~~~~~~~~~~TASK 5~~~~~~~~~~~~~~~\n");

        System.out.println("Please enter a country");
        String country = input.nextLine();
        if (country.length() > 5)
            System.out.println(country.substring(2,country.length()-2));
        else System.out.println("Invalid input!!!");

        //Task6
        System.out.println("\n~~~~~~~~~~~~~~~TASK 6~~~~~~~~~~~~~~~\n");

        String address = ScannerHelper.getAnAddress();

        address = address.replace('a', '*').replace('A','*').
                replace('e','#').replace('E', '#').
                replace('i','+').replace('I','+').
                replace('u','$').replace('U','$').
                replace('o','@').replace('O', '@');
        System.out.println(address);


        //Task7
        System.out.println("\n~~~~~~~~~~~~~~~TASK 7~~~~~~~~~~~~~~~\n");

        int random1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int random2 = RandomNumberGenerator.getARandomNumber(0, 25);
        System.out.println(random1);
        System.out.println(random2);
        String sequence = "";
        for (int i = Math.min(random1,random2); i <= Math.max(random1, random2); i++){
            if (i % 5 != 0) sequence += i + " - ";
        }
        System.out.println(sequence.substring(0,sequence.length() - 3));

        //Task8
        System.out.println("\n~~~~~~~~~~~~~~~TASK 8~~~~~~~~~~~~~~~\n");

        System.out.println("Please enter sentence");
    String sentence1 = input.nextLine();
    int count = 0;
    for (int i = 0; i < sentence1.length(); i++){
        if (sentence1.charAt(i) == ' ') count++;
    } if (count > 0) System.out.println("This sentence has " + count + " words.");
    else System.out.println("This sentence does not have multiple words");


    //Task 10
        System.out.println("task 10");

        String rev = "";
        String strin = "";
        ScannerHelper.getAString();

        for (int i = strin.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }if (str.equals(rev)) System.out.println(strin + " is palindrome");
        else System.out.println(strin + " is not palindrome");


        //Task 11
        
    }
    }

