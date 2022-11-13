package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("\n--------------TASK 1--------------\n");
                /*
                ASK-1 - countMultipleWords() method
        •Write a method that takes a String[] array as an argument and counts
        how many strings in the array has multiple words
        •This method will return an int which is the count of multiple words
        •NOTE: be careful about these as they are not multiple words ->“”,    “   “,
        “    abc”,  “abc   “
                 */

        String[] str = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultiple(str));

        System.out.println("\n--------------TASK 2--------------\n");
            /*
            TASK-2 - removeNegatives() method
            •Write a method that takes an “ArrayList<Integer> numbers” as an
            argument and removes all negative numbers from the given list if there
            are any
            •This method will return an ArrayList with removed negatives
             */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(numbers));

        System.out.println("\n--------------TASK 3--------------\n");
            /*
            TASK-3 - validatePassword() method
            •Write a method that takes a “String password” as an argument and
            checks if the given password is valid or not
            •This method will return true if given password is valid, or false if given
            password is not valid
            •A VALID PASSWORD:
            -should have length of 8 to 16 (length of 7 or 17 should return false)
            -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special
            char
            -should NOT have any space
             */

        String password = "Abcd123!";
        String password2 = "Abcd1234";
        System.out.println(validatePassword(password));
        System.out.println(validatePassword(password2));

        System.out.println("\n--------------TASK 4--------------\n");

                    /*
                    TASK-4 - validateEmailAddress() method
            •Write a method that takes a “String email” as an argument and checks if
            the given email is valid or not
            •This method will return true if given email is true, or false if given email is
            not valid
            •A VALID EMAIL:
            -should NOT have any space
            -should not have more than one “@” character
            -should be in the given format <2+chars>@<2+chars>.<2+chars>
                     */
        String email = "abcd@@gmail.com";
        String email2 = "abcd@gmail.com";

        System.out.println(isEmailFormatValid(email));
        System.out.println(isEmailFormatValid(email2));

    }

                             // ==========TASK 1==========

        public static int countMultiple(String[] words){

            int counter = 0;
            for (String word : words) {
                 word = word.trim();
                 if(Pattern.matches("[\\w]+ [\\w ]+",word )) counter++;
            }
            return counter;
        }

                             // ============TASK 2=========

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){

        Iterator<Integer> negativeIterator = numbers.iterator();
        while (negativeIterator.hasNext()){
            Integer n = negativeIterator.next();
            if (n<0) negativeIterator.remove();
        }
        return numbers;
    }

                            // =========TASK 3============

    public static boolean validatePassword(String password){
        return (Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[@#$%*&!?+_])[\\S]{8,16}" ,password));
    }

                             //========TASK 4========

    public static boolean isEmailFormatValid(String email){
        return Pattern.matches("[\\w]{2,}@[\\w]{2,}\\.[\\w]{2,}", email);
    }
}