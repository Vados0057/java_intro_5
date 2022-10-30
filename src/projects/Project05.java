package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("\n==============Task 1==============\n");
        int[] numTask1 = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSort(numTask1);

        System.out.println("\n==============Task 2==============\n");
        int[] numTask2 = {10, 7, 7, 10 - 3, 10, -3};
        findGreatestAndSmallest(numTask2);

        System.out.println("\n==============Task 3==============\n");
        int[] numTask3 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(numTask3);

        System.out.println("\n==============Task 4==============\n");
        int[] numTask4 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallest(numTask4);

        System.out.println("\n==============Task 5==============\n");
        String[] task5 = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(task5);

        System.out.println("\n==============Task 6==============\n");
        String[] task6 = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(task6);
    }
    //Task 1
        /*
            Write a method that takes an int array that has at least one element. Find
        the greatest and smallest elements from the array and print them.
        Complete task using sort() method.
         */

    public static void findGreatestAndSmallestWithSort(int[] numbers) {

        Arrays.sort(numbers);
        System.out.println("The greatest number is = " + numbers[numbers.length - 1]);
        System.out.println("The smallest number is = " + numbers[0]);
    }

    //Task 2
    /*
            Write a method that takes an int array that has at least one element. Find
        the greatest and smallest elements from the array and print them. DO NOT
        sort the array and complete task without sorting.
         */

    public static void findGreatestAndSmallest(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : numbers) {
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }
        System.out.println("The greatest number = " + max);
        System.out.println("The smallest number = " + min);
    }

    //Task 3
         /*
             Write a method that takes an int array that has at least one element. Find
        the second greatest and second-smallest elements from the array and print
        them. Complete task using sort() method.
        */
    public static void findSecondGreatestAndSmallestWithSort(int[] numbers) {

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMax = 0;
        int secondMin = 0;

        for (int n : numbers) {
            if (secondMax > n && n !=max){
                secondMax = n;
            }if (secondMin < n && n != min){
                secondMin = n;
            }
        }
        System.out.println("Second Greatest number = " + secondMax);
        System.out.println("Second Smallest number = " + secondMin);
    }

    //Task 4
         /*
            Write a method that takes an int array that has at least one element. Find
      the second greatest and second-smallest elements from the array and print
       them. DO NOT sort the array and complete task without sorting.
       */

    public static void findSecondGreatestAndSmallest(int[] numbers) {

        //1. We need to find first Greatest number.
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (max < n) {
                max = n;
            }
        }
        //2.We need to find first Smallest number.
        int min = Integer.MAX_VALUE;
        for (int n : numbers) {
            if (min > n) {
                min = n;
            }
        }
        //3.Now, we can find second Greatest and second Smallest.
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (n > secondMax && n != max) {
                secondMax = n;
            }
            if (n < secondMin && n != min) {
                secondMin = n;
            }
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest  = " + secondMax);
    }


    //Task 5

         /*
            Write a method that takes a String array. Find all duplicated elements and
        print them.
       */

    public static void findDuplicatedElementsInAnArray(String[] str) {
        String counter = ""; // Here we will put all the duplicates

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (counter.contains(str[i] + "")) {
                    break;
                }
                if (str[i] == str[j]) {
                    counter += str[j] + "\n";
                }
            }
        }
        System.out.println(counter);
    }

    //Task 6
            /*
             Write a method that takes a String array. Find the most repeated element
        and print it.
         */
    public static void findMostRepeatedElementInAnArray(String[] str) {

        String check = "";
        int count1 = 0;

        for (int s = 0; s < str.length; s++) {

            for (int i = 0; i < str.length; i++) {

            }

        }
    }
}
