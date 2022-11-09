package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsApple {
    public static void main(String[] args) {

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("pineapple", "banana", "orange", "grapes"));
        ArrayList<String> objects2 = new ArrayList<>(Arrays.asList("banana", "orange", "Apple"));
        ArrayList<String> objects3 = new ArrayList<>(Arrays.asList("banana", "orange", "apple"));
        System.out.println(containsApple(objects));
        System.out.println(containsApple(objects2));
        System.out.println(containsApple(objects3));
        System.out.println("\n\nFOR I LOOP");
        System.out.println(containsAppleForI(objects));
        System.out.println(containsAppleForI(objects2));
        System.out.println(containsAppleForI(objects3));

    }

        /*
        create a public static method which will take an arraylist then it will check it is
        containing "apple".

        NOTE: IGNORE CASES

        Example:
            ArrayList -> {"banana", "orange", "Apple"} ==> true
            ArrayList -> {"banana", "orange", "apple"} ==> true
            ArrayList -> {"pineapple", "banana", "orange", "grapes} ==> false
         */

    public static boolean containsApple(ArrayList<String> objects) {
        return objects.contains("apple") || objects.contains("Apple");
    }

    public static boolean containsAppleForI(ArrayList<String> objects) {

        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i).equalsIgnoreCase("apple")) return true;
        }
        return false;
    }
}