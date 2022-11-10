package regex;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
//      Class   nameOfThe object
        Pattern pattern  = Pattern.compile("[a-z0-9]{5,10}"); // This is the object

//      Pattern is Case sensitive, and return true.

        System.out.println(pattern); // If you need to see the pattern, you can just print it!
        System.out.println(pattern.pattern()); // return the pattern as a string
        System.out.println(pattern.toString()); // return the pattern as a string

        System.out.println(Pattern.matches(pattern.pattern(),"Apple")); // false because of the UpperCase
        System.out.println(Pattern.matches(pattern.pattern(),"hello world")); // false because of the space( ) and th length is too long.

        //SPLIT METHOD IN THE REGEX

        String str = "I go to school at TechGlobal and i love it";

        String[] arr = str.split(" [a-z0-9]{5,10}"); // space before the [ gave us the full condition for the word.

        System.out.println(Arrays.toString(arr)); // [I go to,  at TechGlobal and i love it]

        String name = ScannerHelper.getAName();
        Pattern check = Pattern.compile( "[a-zA-Z0-9]{5,10}");
        if (Pattern.matches(check.pattern(),name)) System.out.println("Valid Username");
        else System.out.println("Error! Username must be 5 to 10 characters long and can \n" +
                "only contain letters and numbers");

    }
}