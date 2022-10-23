package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {


        String[][] students = {
                {"Ali", "Mehmet", "Alex"},
                {"Alex", "Regina"},
                {"Abdallah", "Newer"}
        };

        System.out.println(students[0][1]); // Mehmet
        System.out.println(students[1][1]); //Regina

        System.out.println(students.length); //3
        System.out.println("\n----------PRINTING INNER ARRAYS WITH LOOP -----------------\n");
        for (String[] student : students) {
            System.out.println(Arrays.toString(student));
        }
        System.out.println(Arrays.deepToString(students)); // [[Ali, Mehmet, Alex], [Alex, Regina], [Abdallah, Newer]]

        for (String[] group : students){
            for (String student : group) {
                System.out.println(student);
            }

            }
    }
}