package arrays;

import java.util.Arrays;

public class _02_intArray {
    public static void main(String[] args) {

        // 1. Create an int array and store 0, -5, 2, 10, 5, 2, -1, 0
        int [] numbers = {0, -5, 2, 10, 5, 2, -1, 0}; //WE USE THIS ONE IF WE KNOW EXACTLY WHAT VALUE WE GOING TO USE

        // 2. PRINT THE ARRAY
        System.out.println(Arrays.toString(numbers));

        // 3. Iterate the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // For each loop - enhanced for loop
        System.out.println("\nFOR EACH LOOP\n");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}