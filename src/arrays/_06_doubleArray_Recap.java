package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {
        double[] doubles = {1.5, 2.3, -1.3, -3.7};
        char[] chars = {'a', 'b', 'c', 'd'};

        System.out.println(Arrays.toString(doubles));
        System.out.println("The length of arrays is = " + doubles.length);
        //{1.5, 2.3, -1.3, -3.7}

        Arrays.sort(doubles);
        System.out.println("Array after sorting = " + Arrays.toString(doubles));

        System.out.println("\nFORI LOOP\n");
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }

        //WHEN WE DON'T NEED INDEXES OR AN INCREMENT TO USE,GO WITH FOR EACH LOOP
        System.out.println("\nFOR EACH LOOP \n");

        for (double d : doubles) {
            System.out.println(d);
        }
        //WHEN YOU NEED INDEXES OR INCREMENT USE FORI LOOP

        System.out.println("\nFor I loop print two arrays bellow\n");
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i] + " - " + chars[i]);
        }
    }
}