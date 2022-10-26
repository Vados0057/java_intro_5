package arrays;

import java.util.Arrays;

public class _08_Find_First_Even_Odd {
    public static void main(String[] args) {

//        int[] numbers = {0, 5, 3, 2, 4, 7, 10};
//        firstEvenOddNumber(numbers);

        String[] words = {"123", "!@#"};
        firstAInArray(words);

                    /*
            Create a public static method which will take an int array then it will
            print out the first even and first odd number.

            Example:
            - array =  {0, 5, 3, 2, 4, 7, 10};

            Output:
                First even = 0
                First odd = 5

            Example2:
            - array =  {0, 2, 2, 5, 3, 2, 4, 7, 10};

            Output2:
                First even = 0
                First odd = 5

            Example3:
            - array =  {0, 2, 2, 10};

            Output3:
                First even = 0
                There is no odd number in this array
             */

    }

    public static void firstEvenOddNumber(int[] numbers) {
        /*
        PSEUDOCODE
         */
        int fEven = 0, fOdd = 0;
        boolean isEvenFound = false, isOddFound = false;

        for (int n : numbers) {
            if (!isEvenFound && n % 2 == 0) { //if first eeven not found and the number is even
                fEven = n;
                isEvenFound = true; // marking flag as true, so next time you will know even has found
            } else if (!isOddFound && n % 2 == 1) { //if first odd not found and the number is odd
                fOdd = n;
                isOddFound = true;
            }
//        }if (isEvenFound){
//            System.out.println("First even : " + fEven);
//        }else {
//            System.out.println("There is no Even numbers in this array");
//        }
            //
            System.out.println((isEvenFound) ? "First odd : " + fOdd : "There is no Odd numbers in this array");
//        if (isOddFound) {
//            System.out.println("First odd : " + fOdd);
//        }else {
//            System.out.println("There is no Odd numbers in this array");
//        }
            System.out.println((isOddFound)?"First odd : " + fOdd : "There is no Odd numbers in this array");
        }
    }

    public static void firstAInArray(String[] str){

        String aChecker = "";
        boolean isAFound = false;
        for (String s : str) {
            if (!isAFound && s.startsWith("a") || s.startsWith("A")){
                aChecker = s;
                isAFound = true;
            }
        }
        System.out.println((isAFound) ? "First string with \"a\" = " + aChecker : "No String starting with \"a\"");
    }



}