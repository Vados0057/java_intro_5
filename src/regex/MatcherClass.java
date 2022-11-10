package regex;

import utilities.ScannerHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {

//        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");
//        Matcher matcher = pattern.matcher("hello");
//
//        System.out.println(matcher.matches());
//
//        System.out.println("Starting index : " + matcher.start());
//        System.out.println("Ending index : " + matcher.start());



                            /*
                                            Ask the user to enter a sentence and count how many words are in the sentence.
                The regex pattern for a single word is [A-Za-z]{2,}

                print out how many words are in the sentence.
                Scenario 1:
                Program: Please enter a sentence
                User: Hello, my name is John.
                Program:
                Hello
                my
                name
                is
                john
                doe
                This sentence contains 6 words
                Scenario 2:
                Program: Please enter a username
                User:
                Program: This sentence contains 0 words
                             */

       String string =  ScannerHelper.getAString();
       Pattern pattern1 = Pattern.compile("[A-Za-z]{2,}");
       Matcher matcher1 = pattern1.matcher(string);

        int counter = 0;

        while (matcher1.find()){
            System.out.println(matcher1.group());
            counter++;
        }
        System.out.println("This sentence contain " + counter + " words.");

                    /*
                                Write a regex pattern with the conditions below:
            • Must be more than 8 characters.
            • Must be no more than 15 characters.
            • Could include letters(Upper and Lower), numbers,
            _, and -
                     */

        Pattern p2 = Pattern.compile("[a-zA-z0-9_-]{9,15}");

    }
}