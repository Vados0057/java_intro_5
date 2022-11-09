package practice.arrayListPractices;

import utilities.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Contains2Or3 {
    public static void main(String[] args) {

        System.out.println(contains2Or3());
        System.out.println(contains7Or13());

    }

            /*
        create a public static method which generate 5 numbers between 1-10 (both included)
        then store all of them inside of an arrayList and return true if it is containing
        "2" or "3".

        Examples:
        [0, -4, -7, 0, 5, 10, 45] -> false
        [0, 2, -7, 0, 5, 10, 45] -> true
        [0, -4, -7, 0, 3, 10, 45] -> true
        [0, 2, -7, 0, 3, 10, 45] -> true
         */

    public static boolean contains2Or3() {
       ArrayList<Integer> randoms = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            randoms.add(RandomNumberGenerator.getARandomNumber(1,10));
        }
        System.out.println(randoms);
        return randoms.contains(2) || randoms.contains(3);
    }
    public static boolean contains7Or13(){
        ArrayList<Integer> naumbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            naumbers.add(RandomNumberGenerator.getARandomNumber(-20, 20));
        }
        System.out.println(naumbers);
        return naumbers.contains(7) || naumbers.contains(13);
    }

    }



