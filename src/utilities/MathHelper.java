package utilities;

public class MathHelper {

    /*
    Write a method that returns the max number of 3 int numbers
    Math.max(Math.max(num1, num2), num3)
     */

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    /*
    SAME BUT MIN
     */

    public static int minOfThree(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    /*
    Write a method that returns the middle number of 3 int numbers
    Assume numbers can never be equal to each other
     */

    public static int middleOfThree(int num1, int num2, int num3) {
        int max = maxOfThree(num1, num2, num3);
        int min = minOfThree(num1, num2, num3);

        return num1 + num2 + num3 - min - max;
    }

       /*
       Create a method that takes int as a argument and return true if its even,
       return false if it is odd

       return - >
       return type - boolean ->
       static
       public
       takes an int as arg
       method name = isEven
        */

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

            /*
        Create a method that takes int as a argument and return true if its even,
        return false if it is odd

        return - >
        return type - boolean ->
        static
        public
        takes an int as arg
        method name = isOdd

        */
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    /*
    Create a method that take 2 int arguments and returns their sum
    Method name = sum

    public static
    return type ->
    return int
    it takes 2 int
     */

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static int findDifference(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    public static double findDifference(double num1, double num2) {
        return Math.abs(num1 - num2);
    }

    //OVERLOADING A METHOD

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
    public static double sum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
    public static long sum(long num1, long num2) {
        return num1 + num2;
    }
}
