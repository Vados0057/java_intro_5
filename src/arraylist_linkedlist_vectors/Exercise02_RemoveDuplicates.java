package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise02_RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "JavaScript",
                "Ruby", "Go", "Java", "Ruby", "Java"));
        ArrayList<String> uniques = new ArrayList<>();

        for (String s : languages) {
            if (!uniques.contains(s)) uniques.add(s);
        }
        System.out.println(uniques);

        }

//        int container = 0;
//        for (String l : languages) {
//            if (languages.)
//        }
//
    }

