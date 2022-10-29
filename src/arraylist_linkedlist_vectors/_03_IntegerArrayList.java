package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        System.out.println(numbers.size());


        //HOW TO REMOVE NOT ONE ELEMENT, BUT ALL SAME ELEMENTS.
//        while(numbers.contains(10)){
//            numbers.remove((Integer)10);
//        }


        System.out.println("\n=========CONTAINS() METHOD==========\n");
        System.out.println(numbers.contains(10));//true
        System.out.println(numbers.contains(12));//false
        System.out.println(numbers.contains(20));//true
        System.out.println(numbers.contains(22));//false


        System.out.println(numbers.get(0).equals(numbers.get(3)));


        System.out.println("\n=========IndexOf() METHOD==========\n");

        System.out.println(numbers.indexOf(15));
        System.out.println(numbers.indexOf(25));
        System.out.println(numbers.indexOf(20));

        System.out.println("\n=========IndexOf() METHOD==========\n");

        System.out.println(numbers.lastIndexOf(30));
        System.out.println(numbers.lastIndexOf(35));
        System.out.println(numbers.lastIndexOf(10));

        System.out.println("\n =======Retrieving each element with for i loop =========\n");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\n =======Retrieving each element with for each loop =========\n");
        for(Integer number : numbers) {
            System.out.println(number);
        }
    }
}
