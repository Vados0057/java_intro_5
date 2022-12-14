package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Exercise04_CountElements {
    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>(Arrays.asList(10, 15, 20, 25, 30));

//        Vector<Integer> numbers1 = numbers;
//
//        numbers1.removeIf(x -> x % 2 == 1);
//        System.out.println(numbers1.size()); // 3
//        System.out.println(numbers1);


        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count()); // 3
        System.out.println(numbers.stream().filter(x -> x % 2 != 0).count());
        System.out.println(numbers.stream().filter(x -> x > 15).count());
        System.out.println(numbers.stream().filter(x -> x != 20).count());
        System.out.println(numbers);



    }
}
