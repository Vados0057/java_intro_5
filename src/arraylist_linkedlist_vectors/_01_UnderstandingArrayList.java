package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {


        //1.Declaring Array vs an ArrayList
        String[] names1 = new String[3];

        //ARRAYLIST SINTEX;
        ArrayList<String> names2 = new ArrayList<>(); // capacity = 10 by default

        //2. Getting size of the array vs ArrayList
        System.out.println("\n -------Size of Array vs ArrayList-------\n");
        System.out.println("The size of the array = " + names1.length); //  3
        System.out.println("The size of the ArrayList = " + names2.size()); // 0


        //3. Printing an Array vs ArrayList
        System.out.println("\n -------Printing of Array vs ArrayList-------\n");

        System.out.println("The Array = " + Arrays.toString(names1)); // [null, null, null]
        System.out.println("The ArrayList = " + names2); // []


        // 4. Adding elements to specific indexes
        System.out.println("\n -------Adding elements of Array vs ArrayList-------\n");
        names1[0] = "Alex";
        names2.add(0,"John"); // names2.add("John");

        System.out.println("The array = "  + Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);

        names1[1] = "Ali";
        names1[2] = "Andrii";

        names2.add(1, "Joe");
        names2.add("Jane");//BOTH WAYS WORK'S

        System.out.println("The array = "  + Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);

        names2.add("Abdallah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Suzanne");
        names2.add("Hazal");
        names2.add("Yildiz");
        names2.add("Samir");
        System.out.println("The ArrayList = " + names2);
        System.out.println("The size of the ArrayList = " + names2.size());


        //5. Updating an existing element in Array vs ArrayList
        System.out.println("\n--------UPDATING THE ELEMENT --------\n");
        names1[1] = "Mike";
        names2.set(1,"Olena");
        System.out.println("The array = "  + Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);

        //6.


    }
}
