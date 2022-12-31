package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework09 {
    public static void main(String[] args) {


        System.out.println("\n---------Task 1--------------\n");
                /*
                Write a program to find the first duplicated number in an int array
        It should print “There is no duplicates” if there are no duplicate
        elements.
        NOTE: Make your code dynamic that works for any given int array.
        Test data 1:
        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

        Expected output 1:
        0
         */

        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};

        boolean isFound = false;

        ArrayList<Integer> r = new ArrayList<>();

        for (int number : numbers) {
            if (r.contains(number)){
                System.out.println(number);
                break;
            }
            else r.add(number);
        }


        System.out.println("\n---------Task 2--------------\n");
            /*
            Requirement:
            Write a program to find the first duplicated String in a String array, ignore
            cases. It should print “There is no duplicates” if there are no duplicate
            elements.
            NOTE: Make your code dynamic that works for any given String array.
            Test data 1:
            String[] words = {“Z”, “abc”, “z”, “123”, “#” };

            Expected output 1:
            Z
             */

        String[] words = {"b", "ama","B","s","Ama"};

        isFound = false;
        String task2 = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].toLowerCase().equals(words[j].toLowerCase()) && !isFound) {
                    task2 = words[i];
                    isFound = true;
                    break;
                }
            }
        }
        System.out.println(isFound ? "First duplicated String: " +  task2 : "There is no duplicates");

        System.out.println("\n---------Task 3--------------\n");

            /*
            Write a program to find the all duplicates in an int array. It
            should print “There is no duplicates” if there are no
            duplicate elements.
            NOTE: Make your code dynamic that works for any given
            int array.
            Test data 1:
            int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};

            Expected output 1:
            0
            -7
             */
        int[] numbersTask3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < numbersTask3.length -1; i++) {
            for (int j = i + 1; j < numbersTask3.length; j++) {
                if (numbersTask3[i] == numbersTask3[j] && !nums.contains(numbersTask3[i]))
                    nums.add(numbersTask3[i]);
            }
        }
        if (nums.isEmpty()) System.out.println("There is no duplicates");
        else nums.forEach(System.out::println);

        System.out.println("\n---------Task 4--------------\n");

            /*
            Write a program to find the all duplicates in a String array,
            ignore cases. It should print “There is no duplicates” if
            there are no duplicate elements.
            NOTE: Make your code dynamic that works for any given
            String array.
            Test data 1:
            String[] words = {“A”, “foo”, “12” , “Foo”, “bar”, “a”, “a”, “java”};

            Expected output 1:
            A
            foo
             */

        String[] task4 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < task4.length - 1; i++) {
            for (int j = i + 1; j < task4.length; j++)
                if (task4[i].equalsIgnoreCase(task4[j]) && !result.contains(task4[i].toUpperCase()))
                    result.add(task4[i]);
        }
        if (result.isEmpty()) System.out.println("There is no duplicates");
        else result.forEach(System.out::println);

        System.out.println("\n---------Task 5--------------\n");
        /*
        Requirement:
        Write a program to reverse elements in an array, then
        print array.
        NOTE: Make your code dynamic that works for any
        given array.
        Test data 1:
        String[] words1 = {“abc”, “foo”, “bar”};

        Expected output 1:
        [bar, foo, abc]
         */
        String[] words1 = {"abc", "foo", "bar"};
        String[] words2 = {"java", "python", "ruby"};
//        reverseString(words1);
//        reverseString(words2);

        Collections.reverse(Arrays.asList(words1));
        System.out.println(Arrays.toString(words1));




        System.out.println("\n---------Task 6--------------\n");

                /*
                Requirement:
        Write a program to reverse each word in a given String
        NOTE: Make your code dynamic that works for any
        given String.
        Test data 1:
        String str = “Java is fun”;

        Expected output 1:
        avaJ si nuf
         */

        String str = "Java is fun";
        String str2 = "Today is a fun day";
        reverseString2(str);
        reverseString2(str2);


    }

    //---------------------TASK 5---------------------------
    public static void reverseString(String[] str){
        ArrayList<String> reversedWords = new ArrayList<>();

        for (int i = str.length-1; i >= 0 ; i--) {
            reversedWords.add(str[i]);
        }
        System.out.println("Original String[] = " + Arrays.toString(str) + "\n Reverse version " +
                "= " + Arrays.toString(reversedWords.toArray()));
    }

    //----------------------TASK 6---------------------------
    public static void reverseString2(String str){
        ArrayList<String> str1 = new ArrayList<>(Arrays.asList(str.split(" ")));
        String task6 = "";
        for (String s : str1) {

            task6 += new StringBuilder(s).reverse() + " ";
        }
        System.out.println("Original String = " + str + "\n Reverse version = " + task6.trim());
    }

}