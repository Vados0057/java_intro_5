package homeworks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {


        System.out.println("\n==========Task1==========\n");

        String str = "hello";
        System.out.println(countConsonants(str));
        System.out.println("\n==========Task2==========\n");

        String task1 = "hello";
        String task2 = "Hello, nice to meet you!!";
        System.out.println(Arrays.toString(wordArray(task1)));
        System.out.println(Arrays.toString(wordArray(task2)));

        System.out.println("\n==========Task3==========\n");

        String task3 = "Hello,    nice to   meet     you!!";
        System.out.println(removeExtraSpaces(task3));

        System.out.println("\n==========Task4==========\n");
//        String str1 = "";
        count3OrLess();

        System.out.println("\n==========Task5==========\n");
        String dob = "01/21/1999";
        String dob2 = "1/20/1991";
        isDateFormatValid(dob);
        isDateFormatValid(dob2);

        System.out.println("\n==========Task6==========\n");

        String email = "abc@gmail.com";
        String email2 = "a@gmail.com";
        isEmailFormatValid(email);
        isEmailFormatValid(email2);
    }

                    // ==============TASK1=============
                    /*
                    Requirement:
                Write a method named countConsonants() that takes a
                String as an argument a returns how many consonants
                are in the String.
                NOTE: You must use regex
                     */

    public static int countConsonants(String str){
        return str.toLowerCase().replaceAll("[aeoiu]","").trim().length();
    }

                    // ===============TASK2============
                    /*
                    Requirement:
                    Write a method named wordArray() that takes a String
                    as an argument a returns a String array with all the
                    words in the String
                     */

    public static String[] wordArray(String str){
        str = str.replaceAll("\\s+"," ").trim();
        String[] arr = str.replaceAll("[^A-Za-z\\s]","").split(" ");
        return arr;
    }

                    // ===============TASK3============
                    /*
                    Requirement:
                Write a method named removeExtraSpaces() that takes
                a String as an argument a returns the String back with
                all extra spaces removed.
                NOTE: Make sure you use regex
                     */
    public static String removeExtraSpaces(String str){
        str = str.replaceAll("\\s+"," ").trim();
        return str;
    }

                //===============TASK4===============

            /*
            Requirement:
        Write a method named count3OrLess() that asks the
        user to enter a sentence. Return a count of how many
        words are 3 characters long or less.
        NOTE: You must use regex
             */

    public static void count3OrLess(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str = scanner.nextLine();
        String[] arr = str.split("[A-Za-z]{4,}");
        Pattern pattern = Pattern.compile("[A-Za-z]{1,3}");
        Matcher matcher = pattern.matcher(Arrays.toString(arr));
        int counter = 0;
        while(matcher.find()){
            counter++;
        }
        System.out.println(counter);
    }

                    //===============TASK5===============

                    /*
                    Requirement:
                Write a method named isDateFormatValid() that takes a
                String dateOfBirth as an argument and checks if the given
                date matches the given DOB requirements.
                This method would return a true or false boolean
                Format: nn/nn/nnnn
                     */

    public static void isDateFormatValid(String dob){
        System.out.println(Pattern.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}", dob));
    }


                    //===============TASK6===============
                              /*  Write a method named isEmailFormatValid() that takes a String
                email as an argument and checks if the given email matches
                the given email requirements.
                This method would return a true or false boolean.
                               */

    public static void isEmailFormatValid(String email){
        System.out.println(Pattern.matches("[\\w]{2,}@[\\w]{2,}\\.[\\w]{2,}", email));
    }
}
