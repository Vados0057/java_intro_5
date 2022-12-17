package collections;

import java.util.LinkedList;

public class _01_Lists {
    public static void main(String[] args) {

        /*
        -They keep insertion order
        -Allow duplicates
        -Allow null elements

        -Performance
        -Memory
        -Initial Capacity
        -Load
        The way they are store the data
         */

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.offer("Orange");
        fruits.offerFirst("Pineapple");

        System.out.println(fruits.element()); //Pineapple
        System.out.println(fruits.getFirst()); //Pineapple
        System.out.println(fruits.peekFirst()); //Pineapple


        System.out.println(fruits); //


    }
}
