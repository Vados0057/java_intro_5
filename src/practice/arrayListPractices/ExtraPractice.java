package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtraPractice {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(20, 30, 50, 23, 77, 80, 90));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(20, 30, 23, 50, 77, 100, 200));
        returnCommonElements(num, num2);
        System.out.println("\n\n");
        commonANdDivided(num, num2);

        String s = "Radar";
        isPalindrome(s);
        String s2 = "Civic";
        checkIfPalindrome(s2);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-1, 20, 30, 50, 23, 77, 80, 90));
        firstMaxAndMin(numbers);
        System.out.println("\n\n");
        secondMaxAndMin(numbers);


        System.out.println("\n----------Fibonacci numbers-------------\n");

        int number1 = 0;
        int number2 = 1;

        int itteration = 7;
        String result = "";
        for (int i = 0; i < itteration; i++) {

            result += number1 + " - ";
            int sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
        System.out.println(result.substring(0,result.length()-3));

        System.out.println("\n======Second Max Second Min=====\n");

        ArrayList<Integer> numbersTask = new ArrayList<>(Arrays.asList(10,5,9,23,89));

        int max = Integer.MIN_VALUE;
        int min =  Integer.MAX_VALUE;

        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (Integer number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        for (Integer integer : numbersTask) {
            if (integer > secondMax && integer != max) secondMax = integer;
            if (integer < secondMin && integer != min) secondMin = integer;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(secondMax);
        System.out.println(secondMin);
    }

    /*
    Create a public static method which will take two arraylists, and it will find the common
    elements between them then print it
    Test data 1:
        numbers1 = {10, 20, 30, 50, 70};
        numbers2 = {20, 50, 70, 100, 300};
    Expected output 1:
        20
        50
        70
    Test data 2:
       numbers1 = {30, 50, 70};
       numbers2 = {20, 100, 300};
    Expected output 2:
        There is no matching elements
     */


    public static void returnCommonElements(ArrayList<Integer> num1, ArrayList<Integer> num2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < num1.size(); i++) {
            for (int j = 0; j < num2.size(); j++) {
//                System.out.println(num1.get(i) + "|||" + num2.get(j));
//                System.out.println();
                if (num1.get(i).equals(num2.get(j))) result.add(num1.get(i));
            }
        }

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    /*
    Create a public static method which will take two arraylists, and it will find the common
    elements between them then print it
    Test data 1:
        numbers1 = {10, 20, 30, 50, 70};
        numbers2 = {20, 50, 70, 100, 300};
        and print all the numbers that divided by 2;
    Expected output 1:
        20
        50
        70
    Test data 2:
       numbers1 = {30, 50, 70};
       numbers2 = {20, 100, 300};
    Expected output 2:
        There is no matching elements
     */

    public static void commonANdDivided(ArrayList<Integer> nums, ArrayList<Integer> nums2) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums.get(i).equals(nums2.get(j))) result.add(nums.get(i));
            }
        }
    }

    public static void isPalindrome(String str) {
        String resolution = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            resolution = resolution + str.charAt(i);
        }
        if (str.toLowerCase().equals(resolution.toLowerCase())) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(resolution + "this is not a palindrome");
        }
    }

    public static void checkIfPalindrome(String s) {
        String palindrome = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            palindrome = palindrome + s.charAt(i);
        }
        if (palindrome.toLowerCase().equals(s.toLowerCase())) System.out.println(s + " is a palindrome String");
        else System.out.println(s + " is not a palindrome String");
    }

    public static void firstMaxAndMin(ArrayList<Integer> num1) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : num1) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        System.out.println(min);
        System.out.println(max);

    }

    public static void secondMaxAndMin(ArrayList<Integer> num1) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : num1) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int n : num1) {
            if (n < secondMin && n != min) secondMin = n;
            if (n > secondMax && n != max) secondMax = n;
        }
        System.out.println(secondMax);
        System.out.println(secondMin);

    }
}
