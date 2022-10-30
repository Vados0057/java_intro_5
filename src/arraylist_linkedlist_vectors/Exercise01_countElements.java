package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.List;

public class Exercise01_countElements {

    public static void main(String[] args) {

                       /*
                Create an ArrayList and store below colors
                Blue
                Brown
                Pink
                Yellow
                Red
                Purple

                Print the ArrayList
                Print the size
                Print each element separately

                EXPECTED:
                [Blue, Brown, Pink, Yellow, Red, Purple]
                6
                Blue
                Brown
                Pink
                Yellow
                Red
                Purple
                 */

        System.out.println("\n------TASK-1-------\n");

        ArrayList<String> colors = new ArrayList<>(); //Arrays.asList to add multiple elements to Array List
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");

        System.out.println(colors);
        System.out.println(colors.size());
        for (String s : colors) {
            System.out.println(s);
        }

            /*
            Count the elements that has length of 6

            EXPECTED:
            2
             */

        System.out.println("\n------TASK-2 - Elements that has length of 6-------\n");

        // FOR EACH LOOP
        int check = 0;
        for (String s : colors) {
            if (s.length() == 6){
                check++;
            }
        }
        System.out.println(check);

        // FOR I LOOP
        int count6 = 0;
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).length() == 6) count6++;
        }
        System.out.println(count6);

                    /*
            Count the elements has 'o'
            //Brown and Yellow

            EXPECTED:
            2
             */

        System.out.println("\n------TASK-3 - Elements that has 'o'-------\n");

        //FOR EACH
        int countO = 0;
        for (String s : colors) {
            if (s.contains("o")) countO++;
        }
        System.out.println(countO); //2

        //FOR I
        countO = 0;
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).contains("o")) countO++;
        }
        System.out.println(countO); //2

    }
}