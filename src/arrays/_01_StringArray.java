package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {


        // 1. Declare a String array called as countries and assign size of 3
        String[] countries = new String[3];

        // 2. Assigning values to specific indexes
        countries[1] = "Spain";

        // 3. Print a specific index from an array
        System.out.println(countries[0]); //null
        System.out.println(countries[1]); //spain

        // 4. Printing an array.
        System.out.println(Arrays.toString(countries)); //[null, Spain, null]

        /*
        Assign Belgium to the index of 2 and print the array agian
        */

        countries[2] = "Belgium";
        System.out.println(Arrays.toString(countries)); //[null, Spain, Belgium]
    }
}
