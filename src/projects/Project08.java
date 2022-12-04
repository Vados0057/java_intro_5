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
    public static int findClosestDistance(int[] arr){
        if (arr.length < 2 ){
            return -1;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(Math.abs(arr[i] - arr[j]) < result) result= Math.abs(arr[i] - arr[j]);
            }
        }
        return result;
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

        // add existed array to the array list, loop, if char at i == arr at[i] + 1remove
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
    public static char findFirstUniqueCharacter(String str){

        for (int i = 0; i < str.length(); i++) {
            boolean check = true;
            for (int j = 0; j < str.length(); j++) {
            if (i != j && str.charAt(i) == str.charAt(j)) {
                check = false;
                break;
            }
            }
            if (check) return str.charAt(i);
        }
        return ' ';
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
    public static void findMissingNumber(int[] arr){
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] - arr[i+1] != -1) result += arr[i] + 1;
        }
        System.out.println(result);
    }


    public static void main(String[] args) {

        System.out.println("\n\t\t*Task1*\n");
        int[] task1a = {4, 8, 7, 15};
        int[] task1b = {10, -5, 20, 50, 100};
        int[] task1c = {4};
        System.out.println(findClosestDistance(task1a));
        System.out.println(findClosestDistance(task1b));
        System.out.println(findClosestDistance(task1c));

        System.out.println("\n\t\t*Task2*\n");
        int[] task2a = {5, 3, -1, 3, 5, 7, -1};
        int[] task2b = {2};
        findSingleNumber(task2a);
        findSingleNumber(task2b);

        System.out.println("\n\t\t*Task3*\n");
        String task3a = "abc abc d";
        String task3b = "abab";
        String task3c = "Hello";
        System.out.println(findFirstUniqueCharacter(task3a));
        System.out.println(findFirstUniqueCharacter(task3b));
        System.out.println(findFirstUniqueCharacter(task3c));

        System.out.println("\n\t\t*Task4*\n");
        int[] task4a = {2, 3, 1, 5};
        int[] task4b = {2, 4};
        findMissingNumber(task4a);
    }
}
