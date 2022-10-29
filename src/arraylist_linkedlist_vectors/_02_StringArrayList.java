package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {
                /*
                Create an ArrayList and store below cities in it
                Chicago
                Berlin
                Miami

                Print the size of the ArrayList
                Print the ArrayList

                EXPECTED:
                3
                [Chicago, Berlin, Miami]
                 */

        System.out.println("\n=======TaSk 1 ========\n");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");

        System.out.println("The size of ArrayList = " + cities.size());
        System.out.println(cities);

        System.out.println("\n=========Task 2==========\n");
        cities.set(2,"Evanston");
        System.out.println(cities);

        System.out.println("\n========Task 3============\n");
        cities.remove("Berlin");
        //cities.remove(1); same thing. you CAN DO IT WITH BOTH WAYS!!!!!!!!!!!!!!!!!!!
        System.out.println(cities); //[Chicago, Evanston]
        System.out.println(cities.size());

        System.out.println(cities.remove(0));
        System.out.println(cities.remove("evanston"));
        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println("\n========Task 4============\n");

                            /*
                    TASK
                    Add below cities to ArrayList
                    New York
                    Rome
                    Ghent

                    Print the ArrayList
                    Print the size

                    EXPECTED:
                    [Evanston, New York, Rome, Ghent]
                    4
                     */

        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");
        System.out.println(cities);
        System.out.println(cities.size());


        System.out.println("\n========Task 5============\n");

        //HOW TO REMOVE ALL ELEMENTS IN OUR ARRAYLIST?
        //cities.removeAll(cities);
        cities.clear();
        System.out.println(cities);
        System.out.println(cities.size());


    }
}
