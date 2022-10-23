package string_methods;

import java.util.Arrays;

public class _16_split_Method {
    public static void main(String[] args) {

        /*
            -return
            -return a String array
            -non-static
            -it takes regex as argument
         */

        String str = "Today is a Sunday and the weather is nice";
        String[] arr1 = str.split(" "); //[Today, is, a, Sunday, and, the, weather, is, nice]

        System.out.println(Arrays.toString(arr1));


        System.out.println(Arrays.toString(str.split("is"))); //[Today ,  a Sunday and the weather ,  nice]

    }
}
