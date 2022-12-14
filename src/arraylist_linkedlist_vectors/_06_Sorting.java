package arraylist_linkedlist_vectors;

import java.util.*;

public class _06_Sorting {
    public static void main(String[] args) {

/*
Create below LinkedList to store data

1 -> 10, -3, 5, 15
2 -> Remote, Phone, Laptop

Print the LinkedLists
Sort the LinkedLists and print them again

EXPECTED:
[10, -3, 5, 15]
[Remote, Phone, Laptop]
[-3, 5, 10, 15]
[Laptop, Phone, Remote]
 */

        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        List<String> str = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));


        System.out.println("\n ------ Before sort  -------\n");
        System.out.println(numbers);
        System.out.println(str);


        Collections.sort(numbers);
        Collections.sort(str);

        System.out.println("\n---------- After Sort ----------\n");
        System.out.println(numbers);
        System.out.println(str);


        System.out.println(Collections.max(numbers));


    }
}
