package arraylist_linkedlist_vectors;

import java.util.*;


public class _08_ConvertingAnArrayToAnArrayList {

    public static void main(String[] args) {


        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Tokyo", "Berlin", "Moscow", "Denver"));
        System.out.println(cities);

        System.out.println("\n------WAT - 2 WITH LOOPS  - MANUAL WAY --------\n");
        char[] arr2 = {'A', '#', '5', '+'};
        LinkedList<Character> characters = new LinkedList<>(); //[A, #, 5, +]

        for (char c: arr2) {
            characters.add(c);
        }

        System.out.println(characters);// [A, #, 5, +]

        System.out.println("\n----_--Way 3 with collections.addAll() method\n");

        Integer[] arr3 = {1, 2, 2 ,7 ,10};

        Vector<Integer> numbers = new Vector<>(); // [1, 2, 2, 7, 10]

        Collections.addAll(numbers, arr3);
        System.out.println(numbers); // [1, 2, 2, 7, 10]

    }
}
