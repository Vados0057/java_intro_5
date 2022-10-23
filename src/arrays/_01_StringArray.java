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

        // 4. !!!!!!!!!!!!!!!!!!!  PRINTING AN ARRAY !!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println(Arrays.toString(countries)); //[null, Spain, null]

        /*
        Assign Belgium to the index of 2 and print the array again
        */

        countries[2] = "Belgium";
        System.out.println(Arrays.toString(countries)); //[null, Spain, Belgium]

        // 5. Update existed element
        countries[1] = "France"; // we update "Spain" to "France".
        System.out.println(Arrays.toString(countries)); // [null, France, Belgium]

        // 6. Getting the length of an array - how many elements -3
        int i = countries.length; // Same with next one
        System.out.println(i);
        System.out.println(countries.length); //3

        // ARRAYS CAN'T BE MODIFIED

        // countries[3] = "German"; // ArrayIndexOutOfBoundsException
        // System.out.println(Arrays.toString(countries));

        // 7. Printing each element's separately

        for (int j = 0; j < countries.length; j++) {
            System.out.println("Country at index of " + i + " is = " + countries[j]);
        }
//        System.out.println(countries[0]);
//        System.out.println(countries[1]);
//        System.out.println(countries[2]);

    }
}
