package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework12 {

                //TASK 1
                 /*
                Requirement:
            -Create a method called noDigit()
            -This method will take one String argument and it will
            return a new String with all digits removed from the
            original String
            Test Data 1: “”
            Expected Result 1: “”
            Test Data 2: “Java”
            Expected Result 2: “Java”
            Test Data 3: “123Hello”
            Expected Result 3: “Hello”
            Test Data 4: “123Hello World149”
            Expected Result 4: “Hello World”
            Test Data 5: “123Tech456Global149”
            Expected Result 5: “TechGlobal”
                 */

    public static String noDigits(String str){

      return str.replaceAll("[0-9]","");
    }

                //TASK 2
                /*
                Requirement:
            -Create a method called noVowel()
            -This method will take one String argument and it will
            return a new String with all vowels removed from the
            original String
            Test Data 1: “”
            Expected Result 1: “”
            Test Data 2: “xyz”
            Expected Result 2: “xyz”
            Test Data 3: “JAVA”
            Expected Result 3: “JV”
            Test Data 4: “125$”
            Expected Result 4: “125$”
            Test Data 5: “TechGlobal”
            Expected Result 5: “TchGlbl”
                 */
    public static String noVowel(String str){
        return str.replaceAll("[aeoiuAEOUI]", "");

    }

                //TASK 3
            /*
            Requirement:
            -Create a method called sumOfDigits()
            -This method will take one String argument and it will return an int sum
            of all digits from the original String.
            NOTE: Return zero if there is no digits in the String
            Test Data 1: “”
            Expected Result 1: 0
            Test Data 2: “Java”
            Expected Result 2: 0
            Test Data 3: “John’s age is 29”
            Expected Result 3: 11
            Test Data 4: “$125.0”
            Expected Result 4: 8
             */
    public static int sumOfDigits(String str){
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
          //  if (Character.isDigit(str.charAt(i))) result += Integer.parseInt(str.substring(i, i+1));
             if (Character.isDigit(str.charAt(i))) result += Character.getNumericValue(str.charAt(i));
        }
        return result;
    }

                //TASK 4

                /*
                Requirement:
            -Create a method called hasUpperCase()
            -This method will take one String argument and it will return boolean
            true if there is an uppercase letter and false otherwise.
            Test Data 1: “”
            Expected Result 1: false
            Test Data 2: “java”
            Expected Result 2: false
            Test Data 3: “John’s age is 29”
            Expected Result 3: true
            Test Data 4: “$125.0”
            Expected Result 4: false
                 */
    public static boolean hasUpperCase(String str){

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) return true;
        }

        return false;
    }

                //TASK 5

                /*
                Requirement:
            -Create a method called middleInt()
            -This method will take three int arguments and it will return the middle
            int.
            Test Data 1: 1, 1, 1
            Expected Result 1: 1
            Test Data 2: 1, 2, 2
            Expected Result 2: 2
            Test Data 3: 5, 5, 8
            Expected Result 3: 5
            Test Data 4: 5, 3, 5
            Expected Result 4: 5
            Test Data 4: -1, 25, 10
            Expected Result 4: 10
                 */
    public static int middleInt(int a, int b, int c){
        int[] result = {a,b,c};
        Arrays.sort(result);
        return result[1];

    }

                //TASK 6
                    /*
                    Requirement:
            -Create a method called no13()
            -This method will take an int array as argument and it will return a new
            array with all 13 replaced with 0.
            NOTE: Assume length will always be more than zero.
            Test Data 1: [1, 2, 3 ,4]
            Expected Result 1: [1, 2, 3 ,4]
            Test Data 2: [13, 2, 3 ]
            Expected Result 2: [0, 2, 3 ]
            Test Data 3:[13, 13, 13 , 13, 13]
            Expected Result 3: [0, 0, 0, 0, 0]
                     */

    public static int[] no13(int[] arr){
//        int[] result = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 13) result[i] = arr[i];
//            else result[i] = 0;
//        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

                //TASK 7
                /*
                Requirement:
            -Create a method called arrFactorial()
            -This method will take an int array as argument and it will return the
            array with every number replaced with their factorials.
            NOTE: If given array is empty, then return it back empty.
            NOTE: 0! equals to 1
            Test Data 1: [1, 2, 3, 4]
            Expected Result 1: [1, 2, 6, 24]
            Test Data 2: [0, 5]
            Expected Result 2: [1, 120]
            Test Data 3:[5 , 0, 6]
            Expected Result 3: [120, 1, 720]
            Test Data 4:[]
            Expected Result 4: []
                 */
    public static int[] arrFactorial(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int first = 1;
            for (int j = 1; j <= arr[i]; j++)
                first *= j;
            result[i] = first;
        }
        return result;
    }

                //TASK 8
            /*
            Requirement:
            -Create a method called categorizeCharacters()
            -This method will take String as an argument and return a String array as
            letters at index of 0, digits at index of 1 and specials at index of 2.
            NOTE: IGNORE SPACES
            NOTE: Assume length will always be more than zero.
            Test Data 1: “     ”
            Expected Result 3: [ , , ]
            Test Data 2: “abc123$#%”
            Expected Result 2: [abc, 123, $#%]
            Test Data 3: “12ab$%3c%”
            Expected Result 3: [abc, 123, $%%]
             */

    public static String[] categorizeCharacters(String str){
        String[] result = {"","",""};

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) result[0] += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) result[1] += str.charAt(i);
            else if (!Character.isWhitespace(str.charAt(i))) result[2] += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("---------------------Task1---------------------");
        String task1a = "";
        String task1b = "Java";
        String task1c = "123Hello";
        String task1d = "123Hello World149";
        String task1e = "123Tech456Global149";

        System.out.println(noDigits(task1a));
        System.out.println(noDigits(task1b));
        System.out.println(noDigits(task1c));
        System.out.println(noDigits(task1d));
        System.out.println(noDigits(task1e));

        System.out.println("\n---------------------Task2---------------------");
        String task2a = "";
        String task2b = "xyz";
        String task2c = "JAVA";
        String task2d = "125$";
        String task2e = "TechGlobal";

        System.out.println(noVowel(task2a));
        System.out.println(noVowel(task2b));
        System.out.println(noVowel(task2c));
        System.out.println(noVowel(task2d));
        System.out.println(noVowel(task2e));

        System.out.println("\n---------------------Task3---------------------");
        String task3a = "";
        String task3b = "java";
        String task3c = "John’s age is 29";
        String task3d = "$125.0";

        System.out.println(sumOfDigits(task3a));
        System.out.println(sumOfDigits(task3b));
        System.out.println(sumOfDigits(task3c));
        System.out.println(sumOfDigits(task3d));

        System.out.println("\n---------------------Task4---------------------");
        String task4a = "";
        String task4b = "java";
        String task4c = "John’s age is 29";
        String task4d = "$125.0";

        System.out.println(hasUpperCase(task4a));
        System.out.println(hasUpperCase(task4b));
        System.out.println(hasUpperCase(task4c));
        System.out.println(hasUpperCase(task4d));

        System.out.println("\n---------------------Task5---------------------");
        System.out.println(middleInt(1,1,1));
        System.out.println(middleInt(1,2,2));
        System.out.println(middleInt(5,5,8));
        System.out.println(middleInt(5,3,5));
        System.out.println(middleInt(-1,25,10));

        System.out.println("\n---------------------Task6---------------------");
        int[] task6a = {1, 2, 3 ,4};
        int[] task6b = {13,2,3};
        int[] task6c = {13, 13, 13 , 13, 13};

        System.out.println(Arrays.toString(no13(task6a)));
        System.out.println(Arrays.toString(no13(task6b)));
        System.out.println(Arrays.toString(no13(task6c)));

        System.out.println("\n---------------------Task7---------------------");
        int[] task7a = {1, 2, 3, 4};
        int[] task7b = {0, 5};
        int[] task7c = {5, 0, 6};
        int[] task7d = {};

        System.out.println(Arrays.toString(arrFactorial(task7a)));
        System.out.println(Arrays.toString(arrFactorial(task7b)));
        System.out.println(Arrays.toString(arrFactorial(task7c)));
        System.out.println(Arrays.toString(arrFactorial(task7d)));


        System.out.println("\n---------------------Task8---------------------");
        String task8a = "     ";
        String task8b = "abc123$#%";
        String task8c = "12ab$%3c%";

        System.out.println(Arrays.toString(categorizeCharacters(task8a)));
        System.out.println(Arrays.toString(categorizeCharacters(task8b)));
        System.out.println(Arrays.toString(categorizeCharacters(task8c)));


    }
}