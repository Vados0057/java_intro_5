package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("\n------------Task1------------\n");
        String task1a = "     Java is fun       ";
        countWords(task1a);

        System.out.println("\n------------Task2------------\n");
        String task2a = "TechGlobal is a QA bootcamp";
        String task2b = "QA stands for Quality Assurance";
        countA(task2a);
        countA(task2b);

        System.out.println("\n------------Task3------------\n");
        ArrayList<Integer> task3a = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        ArrayList<Integer> task3b = new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123));
        countPos(task3a);
        countPos(task3b);

        System.out.println("\n------------Task4------------\n");
        ArrayList<Integer> task4a = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        ArrayList<Integer> task4b = new ArrayList<>(Arrays.asList(1, 2, 5, 2, 3));
        System.out.println(removeDuplicateNumbers(task4a));
        System.out.println(removeDuplicateNumbers(task4b));

        System.out.println("\n------------Task5------------\n");

        ArrayList<String> task5 = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        ArrayList<String> task5b = new ArrayList<>(Arrays.asList("abc", "xyz", "123", "ab", "abc", "ABC"));
        System.out.println(removeDuplicateElements(task5));
        System.out.println(removeDuplicateElements(task5b));

        System.out.println("\n------------Task6------------\n");
        String task6 = "   I   am      learning     Java      ";
        System.out.println(removeExtraSpaces(task6));

        System.out.println("\n------------Task7------------\n");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));

        System.out.println("\n------------Task8------------\n");
        int[] task8a = {10, -13, 5, 70, 15, 57};
        int[] task8b = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(task8a));
        System.out.println(findClosestTo10(task8b));
    }

    //    TASK1
            /*
            Requirement:
        Write a method countWords() that takes a String as an
        argument, and returns how many words there are in the
        the given String
        Test data 1:
        String str = “      Java is fun       ”;
        Expected output 1:
        3
        Test data 2:
        String str = “Selenium is the most common UI
        automation tool.   ”;
             */

    public static void countWords(String s) {
        String[] words = s.trim().split(" ");
        System.out.println(words.length > 0 ? "This String contains " + words.length + " words" : "This string is empty");
    }

    //    TASK2
        /*
        equirement:
        Write a method countA() that takes a String as an argument,
        and returns how many A or a there are in the the given String
        Test data 1:
        String str = “TechGlobal is a QA bootcamp”;
        Expected output 1:
        4
 */
    public static void countA(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.toLowerCase().charAt(i) == 'a') count++;
        }
        System.out.println(count > 0 ? "This String contains " + count + " a's" : "There is no a's");
    }


    //    TASK3
            /*
            Requirement:
        Write a method countPos() that takes an ArrayList of
        Integer as an argument, and returns how many elements
        are positive
        Test data 1:
        [-45, 0, 0, 34, 5, 67]
        Expected output 1:
        3
             */
    public static void countPos(ArrayList<Integer> list) {

        int count = 0;
        for (Integer n : list) {
            if (n > 0) count++;
        }
        System.out.println(count > 0 ? "In this ArrayList " + count + " positive elements" :
                "There is no positive elements");
    }

    //    TASK4
            /*
            Requirement:
        Write a method removeDuplicateNumbers() that takes an
        ArrayList of Integer as an argument, and returns it back
        with removed duplicates
        Test data 1:
        [10, 20, 35, 20, 35, 60, 70, 60]
        Expected output 1:
        [10, 20, 35, 60, 70]
             */

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (Integer n : list) {
            if (!newArray.contains(n))
                newArray.add(n);
        }
        return newArray;
    }

    //    TASK5
    /*
            Requirement:
        Write a method removeDuplicateElements() that takes an
        ArrayList of String as an argument, and returns it back with
        removed duplicates
        Test data 1:
        [“java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++”]
        Expected output 1:
        [“java”, “C#”, “ruby”, “JAVA”,  “C++”]
             */
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str) {

        ArrayList<String> result = new ArrayList<>();
        for (String s : str) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

    //    TASK6
                /*
                Requirement:
            Write a method removeExtraSpaces() that takes a String as an
            argument, and returns a String with removed extra spaces
            Test data 1:
            String str = “   I   am      learning     Java      ”;
            Expected output 1:
            I am learning Java
            Test data 2:
            String str = “Java  is fun    ”;
            Expected output 2:
            Java is fun
                 */
    public static String removeExtraSpaces(String str) {
        String newStr = str.replaceAll(" +", " ");
        return newStr;
    }

    //    TASK7
            /*
            Requirement:
        Write a method add() that takes 2 int[] arrays as arguments and
        returns a new array with sum of given arrays elements.
        Test data 1:
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        Expected output 1:
        [9, 3, 2, 7, 5, 10]
             */
    public static int[] add(int[] a, int[] b) {
        int[] result = new int[Math.max(a.length, b.length)];
        for (int i = 0; i < result.length; i++) {
            if (a.length > i) result[i] += a[i];
            if (b.length > i) result[i] += b[i];
        }
        return result;
    }

    //    TASK8
            /*
            Write a method findClosestTo10() that takes an int[] array as an
        argument, and returns the closest element to 10 from given array
        Test data 1:
        int[] numbers = {10, -13, 5, 70, 15, 57};
        Expected output 1:
        5
             */

    public static int findClosestTo10(int[] numbers) {
        int closestTo10 = numbers[0];

        for (int number : numbers) {
            if (number == 0) continue;
            if (10 % number < closestTo10) closestTo10 = number;
        }
        return closestTo10;
    }
}