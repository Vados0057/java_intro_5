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

        System.out.println("-----------");
        System.out.println(fruits);

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
            System.out.println("---------");
            System.out.println(fruits.getFirst());
            System.out.println("--------------");
            System.out.println(fruits.getLast());
        }
        System.out.println("------------");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits); //


    }
}
