package arrays;

import java.util.Arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {

        System.out.println("\n~~~~~~~~~~~~~~~~Solution 1 wir foreach ~~~~~~~~~~~~~~~~");
        String sentence = "I love arrays";
        int spaceCounter = 0;
        int wordCounter = 0;

        for (char c :sentence.toCharArray()) {
            if (c == ' ') spaceCounter++;
        }
        System.out.println(spaceCounter + 1);

        System.out.println("\n~~~~~~~~~~~~~~~~Solution 2 wir spilt() method ~~~~~~~~~~~~~~~~");
//        String[] arr =  sentence.split(" ");// [I, love, array]
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length); // 3
        System.out.println(sentence.split(" ").length);


    }
}
