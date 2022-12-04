package projects;


import java.util.ArrayList;
import java.util.Arrays;

public class Project08 {
            //Task1
    /*
             findClosestDistance() method
            •Write a method that takes a int[] array as an argument and returns the
            closest difference between the numbers
            •This method will return an int which is the closest difference between 2
            elements in the array
            •NOTE: if array does not have at least 2 elements, then return -1.
            Test data1:
            [4]
            Expected output:
            -1
            -The reason the result is -1 for above example is because the array length is
            less than 2 and we return -1 in this case
            Test data2:
            [4, 8, 7, 15]
            Expected output:
            1
            -The reason the result is 1 for above example is because 8 and 7 are closest
            elements in the array and the difference between them is 1.
             */
    public static void findClosestDistance(int[] arr){
        if (arr.length < 2 ){
            System.out.println(-1);
        }
        int result = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(Math.abs(arr[i] - arr[i+1]) < result) result= Math.abs(arr[i] - arr[i+1]);


        }
        System.out.println(result > 0 ?"The closest difference in the "
                + Arrays.toString(arr) + " is: " + result : -1);
    }

            //Task2

    /*
                 findSingleNumber() method
            Write a method that takes a int[] array as an argument and returns the
            element occurs only once.
            You will be given a non-empty array in which all the elements appears
            twice except for one.
            Test data 1:
            [2]
            Expected output 1:
            2
            Test data 2:
            [5, 3, -1, 3, 5, 7, -1]
            Expected output 2:
            7
                 */
    public static void findSingleNumber(int[] arr){
        ArrayList<Integer> check = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) check.add(arr[i]);
            }
            if (!check.contains(arr[i])) result = arr[i];
        }
        System.out.println(result);
    }


             //Task3

    /*
                 findFirstUniqueCharacter() method
            Write a method that takes a non-empty String as an argument and
            returns the first unique character in the String.
            This method returns a char.
            If there is no unique character in the String, then return space by default.
            This task is case-sensitive.
            Test data 1:
            Hello
            Expected output 1:
            H
            Test data 2:
            abc abc d
            Expected output 2:
            d
                 */
    public static void findFirstUniqueCharacter(String str){
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length()-1; j++) {

            }
        }
    }

             //Task4
    /*
                 findMissingNumber() method
            Write a method that takes a int[] array as an argument and returns the
            missing element.
            You will be given an array length of 2 at least.
            Array elements will be representing a sequence of numbers that increases
            by 1.
            Test data 1:
            [2, 4]
            Expected output 1:
            3
            Test data 2:
            [2, 3, 1, 5]
            Expected output 2:
            4
                 */


    public static void main(String[] args) {

        System.out.println("\n\t\t*Task1*\n");

        int[] task1a = {4, 8, 7, 15};
        int[] task1b = {10, -5, 20, 50, 100};
        int[] task1c = {4};
        findClosestDistance(task1a);
        findClosestDistance(task1b);
        findClosestDistance(task1c);

        System.out.println("\n\t\t*Task2*\n");

        int[] task2a = {5, 3, -1, 3, 5, 7, -1};
        findSingleNumber(task2a);

        System.out.println("\n\t\t*Task3*\n");


        System.out.println("\n\t\t*Task4*\n");

    }
}
