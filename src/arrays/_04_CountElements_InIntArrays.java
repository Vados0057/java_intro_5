package arrays;

public class _04_CountElements_InIntArrays {
    public static void main(String[] args) {



        /*
        negatives: 2
        positive: 5
        neutral or zeroes: 3

        even: 6
        odd: 4

        max: 10
        min: -7

        sum of the numbers: 28
        average of the numbers: 2
        how many of these numbers are represented in Fibonaci sequences: 6
        how many unique numbers: 7
        prime numbers: 2
        how many numbers can be divided by 5: 6
        absolute difference bt min and max of those numbers: 17
        closest numbers to 9(Take the smallest): 8
         */

        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0 , 10, 0};

        int negatives = 0;
        int postives = 0, neutral = 0, countEven = 0, countOdd = 0, maxNum = 0, minNum = 0,sumOfNum = 0,
                averageNum = 0;

        for (int number : numbers) {
            if (number<0) negatives++;
            {
            if (number > 0) postives++;
            }
            //else if (number == 0) neutral++;
             if (number % 2 == 0) countEven++;
             if (number % 2 != 0) countOdd++;

        }
        System.out.println("Negative count is = " + negatives);
        System.out.println("Positive count is = " + postives);
        //System.out.println("Neutral count is = " + neutral);
        System.out.println("Even numbers count is = " + countEven);
        System.out.println("Odd numbers count is = " + countOdd);



    }
        }



