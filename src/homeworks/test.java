package homeworks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test{

    public static void main(String [] args){

        String[] strings = new String[2];
        System.out.println(strings);

                    /*
                    Requirement:
            -Create an ArrayList and store below numbers
            10, 23, 67, 23, 78
            THEN:
            -Print element at index of 3
            -Print element at index of 0
            -Print element at index of 2
            -Print the entire list
            Expected Result:
            23
            10
            67
            [10, 23, 67, 23, 78]
                     */

        System.out.println("\n----------Homework 7, task 1--------------\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n----------Homework 7, task 2--------------\n");

                /*
                Requirement:
        -Create an ArrayList and store below colors
        Blue, Brown, Red, White, Black, Purple
        THEN:
        -Print element at index of 1
        -Print element at index of 3
        -Print element at index of 5
        -Print the entire list
        Expected Result:
        Brown
        White
        Purple
        [Blue, Brown, Red, White, Black, Purple
                 */
        ArrayList<String> obj = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        System.out.println(obj.get(5));
        System.out.println(obj);

        System.out.println("\n----------Homework 7, task 3--------------\n");

                /*
                Requirement:
        -Create an ArrayList and store below numbers
        23, -34, -56, 0, 89, 100
        THEN:
        -Print the entire list
        -Print the entire list sorted in ascending order
        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100]
                 */
        ArrayList<Integer> numsT2 = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));
        System.out.println(numsT2);
        Collections.sort(numsT2);
        System.out.println(numsT2);

        System.out.println("\n----------Homework 7, task 4--------------\n");
                /*
                Requirement:
            -Create an ArrayList and store below cities
            Istanbul, Berlin, Madrid, Paris
            THEN:
            -Print the entire list
            -Print the entire list sorted lexicographically
            Expected Result:
            [Istanbul, Berlin, Madrid, Paris]
            [Berlin, Istanbul, Madrid, Paris]
                 */
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Madrid", "Paris"));
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n----------Homework 7, task 5--------------\n");

                    /*
                    Requirement:
            -Create an ArrayList and store Marvel characters below
            Spider Man, Iron Man, Black Panter, Deadpool, Captain America
            THEN:
            -Print the entire list
            -Then, check if it contains Wolwerine
            if it contains Wolwerine, then print true
            if it does not contain Wolwerine, print false
            Expected Result:
            [Spider Man, Iron Man, Black Panter, Deadpool, Captain America]
            false
                     */

        ArrayList<String> superHeroes = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"));

        System.out.println(superHeroes);
        System.out.println(superHeroes.contains("Wolverine"));

        System.out.println("\n----------Homework 7, task 6--------------\n");

                /*
                Requirement:
        -Create an ArrayList and store Avengers characters
        below
        Hulk, Black Widow, Captain America, Iron Man
        THEN:
        -Print the entire list sorted lexicographically
        -Then, check if it contains Hulk and Iron Man
        if it contains both, then print true
        if it does not contain both, print false
        Expected Result:
        [Black Widow, Captain America, Hulk, Iron Man]
        true
                 */
        ArrayList<String> newSuperHeroes = new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));
        System.out.println(newSuperHeroes);
        boolean check = false;
        for (String heroe : newSuperHeroes){
            if (heroe.contains("Hulk") && heroe.contains("Iron Man"));
            check = true;
        }
        System.out.println(check);

        System.out.println("\n----------Homework 7, task 7--------------\n");
                /*
                Requirement:
                -Create an ArrayList and store characters below
                A, x, $, %, 9, *, +, F, G
                THEN:
                -Print the entire list
                -Print each element
                Expected Result:
                [A, x, $, %, 9, *, +, F, G]
                A
                x
                $
                %
                9
                *
                +
                F
                G
                 */
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));
        System.out.println(chars);
        for (Character aChar : chars) {
            System.out.println(aChar);
        }

        System.out.println("\n----------Homework 7, task 7--------------\n");
            /*
            Requirement:
            -Create an ArrayList and store below objects
            Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter
            THEN:
            -Print the entire list
            -Print the entire list sorted lexicographically
            -Count objects that starts with M or m
            -Count objects that does not have A or a or E or e
            Expected Result:
            [Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter]
            [Adapter, Desk, Laptop, Monitor, Mouse, Mouse-Pad]
            3
            1
             */
        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));

        int count1 = 0;
        int count2 = 0;
        System.out.println(objects);
        Collections.sort(objects);
        for (String object : objects) {
            if (object.toLowerCase().startsWith("m")) count1++;
            else if (!object.toLowerCase().contains("a") && !object.toLowerCase().contains("e")) count2++;
        }
        System.out.println(count1);
        System.out.println(count2);

        System.out.println("\n ---------Fiboncahi----------\n");

        int num1 = 0;
        int num2 = 1;
        int iteration = 10;
        String s = "";

        for (int i = 0; i < iteration; i++) {
            System.out.print(num1 + " , ");
            int fiboLogic = num1 + num2;
            num1 = num2;
            num2 = fiboLogic;
        }


    }
}
