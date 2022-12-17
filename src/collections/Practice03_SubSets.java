package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Practice03_SubSets {
    public static void main(String[] args) {

                    /*
            Create a collection to store below numbers

            3, 2, 7, 10, 15, 20, 7, 5

            Find all the elements more than 7 -> [10, 15, 20]
            Find all the elements less than or equal to 5 -> [2, 3, 5]
            Find all the elements between 5 and 15 both inclusive -> [5, 7, 10, 15]
             */
        TreeSet<Integer> n = new TreeSet<>(Arrays.asList(3, 2, 7, 10, 15, 20, 7, 5));
        System.out.println(n.tailSet(7,true));
        System.out.println(n.headSet(5,true));



    }

    public static void findMoreElements(TreeSet<Integer> n, int num, int num2){
        System.out.println("Elements more than " + num + " is = " + (TreeSet<Integer>) n.tailSet(num, false));
        System.out.println("Elements less than " + num2 + " is = " + (TreeSet<Integer>) n.headSet(num, false));

    }
}
