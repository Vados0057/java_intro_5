package homeworks;

import java.util.Arrays;

public class Homework11 {

            //      Task1
/*
        Requirement:
        -Create a method called noSpace()
        -This method will take one String argument and it will
        return a new String with all spaces removed from the
        original String
        Test Data 1: “”
        Expected Result 1: “”
        Test Data 2: “Java”
        Expected Result 2: “Java”
        Test Data 3: “    Hello    ”
        Expected Result 3: “Hello”
         */
    public static String noSpace(String str){
        return str.replaceAll(" ", "");
    }

            //      Task2
    /*
            Requirement:
        -Create a method called replaceFirstLast()
        -This method will take one String argument and it will return a new
        String with first and last characters replaced
        NOTE: if the length is less than 2, then return empty String
        NOTE: Ignore all before and after spaces (get actual String only)
        Test Data 1: “”
        Expected Result 1: “”
        Test Data 2: “A”
        Expected Result 2: “”
             */
    public static String replaceFirstLast(String str){
        String result = "";
        String check = "";
        str.trim();
        if (str.length() > 2) {
            check += str.charAt(0);
           return result += str.charAt(str.length()-1) + str.substring(1,str.length() - 1) + check;
        }
        return "";
    }

            //      Task3
    /*
            Requirement:
        -Create a method called hasVowel()
        -This method will take one String argument and it will return a
        boolean checking if String has any vowel or not
        NOTE: Vowels are = a, e, o, u, I
        NOTE: Ignore cases
        Test Data 1: “”
        Expected Result 1: false
        Test Data 2: “Java”
        Expected Result 2: true
             */
    public static boolean hasVowel(String str){
        return (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("o")
                || str.toLowerCase().contains("u") ||str.toLowerCase().contains("i"));
    }

            //      Task4
    /*
            Requirement:
        -Create a method called checkAge()
        -This method will take an int yearOfBirth as  argument and it will print
        message below based on the entry
        If the age is less than 16, then print “AGE IS NOT ALLOWED”
        If the age is 16 or more, then print “AGE IS ALLOWED”
        If the age is more than 100 or a future year entered, print “AGE IS NOT
        VALID”
        NOTE: Calculate the age taking base year as current year in a dynamic
        way. You can use Date class.
        Test Data 1: 2010
        Expected Result 1: AGE IS NOT ALLOWED
        Test Data 2: 2006
        Expected Result 2: AGE IS ALLOWED
             */
    public static void checkAge(int n){
        int currentYear = 2022;
        if (n > currentYear || currentYear - n >= 100) System.out.println("AGE IS NOT VALID");
        else if (currentYear - n < 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");
    }

            //      Task5
    /*
            Requirement:
        -Create a method called averageOfEdges()
        -This method will take three int arguments and it will return
        average of min and max numbers
        Test Data 1: 0, 0 ,0
        Expected Result 1: 0
        Test Data 2: 0, 0, 6
        Expected Result 2: 3
             */
        public static int averageOfEdges(int a, int b, int c){
            int min = Math.min(Math.min(a,b),c);
            int max = Math.max(Math.max(a,b),c);
            return (max + min) / 2;
        }

            //      Task6
    /*
            Requirement:
        -Create a method called noA()
        -This method will take a String array argument and it
        will return a new array with all elements starting with A
        or a replaced with “###”
        NOTE: Assume length will always be more than zero
        NOTE: Ignore cases
        Test Data 1: [“java”, “hello”, “123”, “xyz”]
        Expected Result 1: [“java”, “hello”, “123”, “xyz”]
        Test Data 2: [“appium”, “123”, “ABC”, “java”]
        Expected Result 2: [“###”, “123”, “###”, “java”]
             */
    public static String[] noA(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().startsWith("a")) arr[i] = "###";
        }
        return arr;
    }

            //      Task7
    /*
            Requirement:
        -Create a method called no3or5()
        -This method will take an int array argument and it will
        return a new array with some elements replaced as below
        If element can be divided by 5, replace it with 99
        If element can be divided by 3, replace it with 100
        If element can be divided by both 3 and 5, replace it with
        101
        NOTE: Assume length will always be more than zero
        Test Data 1: [7, 4, 11, 23, 17]
        Expected Result 1: [7, 4, 11, 23, 17]
        Test Data 2: [3, 4, 5, 6]
        Expected Result 2: [100, 4, 99, 100]
             */
    public static int[] no3or5(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 3 == 0 ) arr[i] = 101;
            else if (arr[i] % 5 == 0) arr[i] = 99;
            else if (arr[i] % 3 == 0 ) arr[i] = 100;
        }
        return arr;
    }

            //      Task8
    /*
            Requirement:
        -Create a method called countPrimes()
        -This method will take an int array argument and it will return
        how many elements in the array are prime numbers
        NOTE: Prime number is a number that can be divided only by 1
        and itself
        NOTE: Negative numbers cannot be prime
        Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
        NOTE: Smallest prime number is 2
        Test Data 1: [-10, -3, 0, 1]
        Expected Result 1: 0
        Test Data 2: [7, 4, 11, 23, 17]
        Expected Result 2: 4
        Test Data 3: [41, 53, 19, 47, 67]
             */
   public static int countPrimes(int[] numbers){
       int count = 0;
       for (int number : numbers){
           if (number == 2 || number == 3) count++;
           else if (number > 3) {
               boolean isPrime = true;
               for (int i = 2; i < number; i++) {
                   if (number % i == 0) {
                       isPrime = false;
                   }
               }
               if(isPrime) count++;
           }
       }
       return count;
   }

    public static void main(String[] args) {
        System.out.println("\n\t\t*Task1*\n");
        String task1a = "";
        String task1b = "Java";
        String task1c = " Hello World  ";
        String task1d = "    Hello    ";
        System.out.println(noSpace(task1a));
        System.out.println(noSpace(task1b));
        System.out.println(noSpace(task1c));
        System.out.println(noSpace(task1d));

        System.out.println("\n\t\t*Task2*\n");
        String task2a = "";
        String task2b = "Hello";
        String task2c = "Tech Global";
        System.out.println(replaceFirstLast(task2a));
        System.out.println(replaceFirstLast(task2b));
        System.out.println(replaceFirstLast(task2c));

        System.out.println("\n\t\t*Task3*\n");
        String task3a = "Java";
        String task3b = "";
        String task3c = "123";
        String task3d = "ABC";
        System.out.println(hasVowel(task3a));
        System.out.println(hasVowel(task3b));
        System.out.println(hasVowel(task3c));
        System.out.println(hasVowel(task3d));

        System.out.println("\n\t\t*Task4*\n");
        int task4a = 2010;
        int task4b = 2006;
        int task4c = 2050;
        int task4d = 1920;
        checkAge(task4a);
        checkAge(task4b);
        checkAge(task4c);
        checkAge(task4d);

        System.out.println("\n\t\t*Task5*\n");
        int a = 0, b = 0, c = 0;
        int a1 =0, b1 = 0, c1 = 6;
        int a2 =10, b2 = 13, c2 = 20;
        System.out.println(averageOfEdges(a,b,c));
        System.out.println(averageOfEdges(a1,b1,c1));
        System.out.println(averageOfEdges(a2,b2,c2));

        System.out.println("\n\t\t*Task6*\n");
        String[] task6a = {"java", "hello", "123", "xyz"};
        String[] task6b = {"appium", "123", "ABC", "java"};
        String[] task6c = {"apple", "appium", "ABC", "Alex", "A"};
        System.out.println((Arrays.toString(noA(task6a))));
        System.out.println((Arrays.toString(noA(task6b))));
        System.out.println((Arrays.toString(noA(task6c))));

        System.out.println("\n\t\t*Task7*\n");
        int[] arr = new int[]{7, 4, 11, 23, 17};
        int[] arr2 = new int[]{3, 4, 5, 6};
        int[] arr3 = new int[]{10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(arr)));
        System.out.println(Arrays.toString(no3or5(arr2)));
        System.out.println(Arrays.toString(no3or5(arr3)));

        System.out.println("\n\t\t*Task8*\n");
        int[] task8a = new int[]{-10, -3, 0, 1};
        int[] task8b = new int[]{7, 4, 11, 23, 17};
        int[] task8c = new int[]{41, 53, 19, 47, 67};
        System.out.println(countPrimes(task8a));
        System.out.println(countPrimes(task8b));
        System.out.println(countPrimes(task8c));
    }
}
