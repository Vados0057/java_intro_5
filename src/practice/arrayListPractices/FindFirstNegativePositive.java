package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstNegativePositive {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, -4, -7, 0, 5, 10, 45));
        findFirstNegAndPos(numbers);
    }

    public static void findFirstNegAndPos(ArrayList<Integer> num){
        int firstPos = 0;
        int firstNeg = 0;

        for (Integer n : num) {
            if (n > 0 && firstPos == 0) firstPos = n;
            if (n < 0 && firstNeg == 0) firstNeg = n;
        }
        System.out.println("First positive is = " + firstPos);
        System.out.println("First negative is = " + firstNeg);
        }
    }