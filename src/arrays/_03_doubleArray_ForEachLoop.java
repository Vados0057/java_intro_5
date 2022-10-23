package arrays;

import java.util.Arrays;

public class _03_doubleArray_ForEachLoop {
    public static void main(String[] args) {

        //1. Create an array to store  -> 5.5, 6, 10.3, 25
        double[] numbers = {5.5, 6, 10.3, 25};

        //2.print the array
        System.out.println(Arrays.toString(numbers));

        System.out.println("Size of the array is : " + numbers.length);


        System.out.println("\n-----------FOREACH LOOP-----------\n");
        for (double number : numbers){
            System.out.println(number);
        }
    }
}
