package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class _03_TreeSet {
    public static void main(String[] args) {
        //Create a TreeSet Object
        TreeSet<String> cities = new TreeSet<>(Arrays.asList("Chicago", "Miami", "New York", "San Francisco", "LA"));

        //printing the TreeSet
        System.out.println(cities); // [Chicago, LA, Miami, New York, San Francisco]

        System.out.println(cities.headSet("Miami")); // [Chicago, LA]
        System.out.println(cities.headSet("Miami", true)); // [Chicago, LA, Miami]

        System.out.println(cities.tailSet("New York")); // [New York, San Francisco]
        System.out.println(cities.tailSet("New York", false)); // [San Francisco]

        System.out.println(cities.last()); // San Francisco
        System.out.println(cities.first()); // Chicago

        System.out.println("\n------------------------");
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(10);
        System.out.println(numbers + "\n");

        System.out.println(numbers.first()); // first just show us
        System.out.println(numbers + "\n");

        System.out.println(numbers.pollFirst()); // pollFirst will show us the first element and after that it will remove this number from List
        System.out.println(numbers);

        numbers.clear();
        //System.out.println(numbers.last()); -------------> NoSuchElementException
        //System.out.println(numbers.first()); ------------> NoSuchElementException

        System.out.println(numbers.pollFirst()); // null
        System.out.println(numbers.pollFirst()); // null


    }
}
