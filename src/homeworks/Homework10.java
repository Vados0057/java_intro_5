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

        System.out.println("\n------------Task6------------\n");

        System.out.println("\n------------Task7------------\n");

        System.out.println("\n------------Task8------------\n");


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

    public static void countWords(String s){
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
    public static void countA(String str){
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.toLowerCase().charAt(i) == 'a') count++;
        }
        System.out.println(count > 0 ? "This String contains " + count + " a's": "There is no a's");
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
    public static void countPos(ArrayList<Integer> list){

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

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> list){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (Integer n : list) {
            if (!newArray.contains(n))
                newArray.add(n);
        }
        return newArray;
    }


    //    TASK5

    //    TASK6

    //    TASK7

    //    TASK8

}
