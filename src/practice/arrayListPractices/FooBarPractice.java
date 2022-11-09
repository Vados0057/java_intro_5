package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FooBarPractice {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList());

        System.out.println("\n========Lucky========\n");
        printLucky();
        System.out.println("\n========FOOBAR========\n");
        fooBar();

    }
    public static void printLucky(){

        for (int i = 1; i <=10 ; i++) {
            if (i % 3 == 0) System.out.println("Lucky");
            else System.out.println(i);
        }
    }

                    /*
                Create a public static method which will print numbers from 1 to 10, and it
                will print "Foo" if it is dividable by "2",
                will print "Bar" if it is dividable by "5"
                will print "FooBar" if it is dividable by "2" and "5"

                Example:
                1
                Foo
                3
                Foo
                Bar
                Foo
                7
                Foo
                9
                FooBar
                 */

    public static void fooBar (){

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0 && i % 5 == 0)
                System.out.println("FooBar");
           else if (i % 2 == 0)
                System.out.println("Foo");

           else if (i % 5 == 0)
                System.out.println("Bar");
           else System.out.println(i);
        }
    }
}