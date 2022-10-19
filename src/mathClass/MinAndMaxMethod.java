package mathClass;

public class MinAndMaxMethod {

    public static void main(String[] args) {

        /* max(5, 6) -> finding the max of two number (ONLY 2 NUMBERS)
        min(5, 6) - > finding the min of two numbers (ONLY 2 NUMBERS)
        Math class doesn't need an object for using their methods. Simply call the class name and the methods after it.
         */
        // -infinite, -60, - 40......, -10, - 9,.... -1, 0, 1,... 9, 10, 27, ..., 80....., infinite

       int maxNumber =  Math.max(80, 27); //80

        int maxNumber2 = Math.max(maxNumber, 125);

        int maxNumber3 = Math.max(maxNumber2, 625);

        System.out.println("\nmaxNumber = " + maxNumber); //80
        System.out.println("maxNumber2 = " + maxNumber2); //125
        System.out.println("maxNumber2 = " + maxNumber3); //625


        /**MINIMUM NUMBER
         */

        int minNumber = Math.min(80, 27);
        int minNumber2 = Math.min(minNumber, 2);

        int minOfTwoNeg = Math.min(-40, -60); //60

        System.out.println("\nminNumber = " + minNumber);
        System.out.println("minNumber2 = " + minNumber2);
        System.out.println("minOfTwoNumbers = " + minOfTwoNeg);

       double maxOfTwoDecimals = Math.max(1.7, 6.5);
       double maxOfTwoDecimalsNeg = Math.max(-5.4, -27.2);

        System.out.println("\nmaxOfTwoDecimals = " + maxOfTwoDecimals); //6.5
        System.out.println("maxOfTwoDecimalsNeg = " + maxOfTwoDecimalsNeg); //-5.4

        //MAX PRACTICE

        int maxNum1 = Math.max(6, 9);
        int maxNum2 = Math.max(17, 49);
        double maxNum3 = Math.max(34.2, 12.5);
        int maxNumber4 = Math.max(-14, -32);

        int maxNumber5 = Math.max(Math.max(17,49), 125 );

        System.out.println("\nMax is = " + maxNum1);
        System.out.println("Max is = " + maxNum2);
        System.out.println("Max is = " + maxNum3);
        System.out.println("Max is = " + maxNumber4);
        System.out.println("Max is = " + maxNumber5);

        //MIN PRACTICE

        int minNum1 = Math.min(6, 9);
        int minNum2 = Math.min(17, 49);                            // THIS IS OPTIONAL WE CAN USE ONLY NUMBERS
        double minNum3 = Math.min(34.2, 12.5);
        int minNumber4 = Math.min(-14, -32);
        int minNumber5 = Math.min(Math.min(17,49), 125 );
        int minNumber6 = Math.min(Math.min(45, 32), Math.min(56, 89));

        System.out.println("\nMin is = " + minNum1);
        System.out.println("Min is = " + minNum2);
        System.out.println("Min is = " + minNum3);
        System.out.println("Min is = " + minNumber4);
        System.out.println("Min is = " + minNumber5);
        System.out.println("Min is = " + minNumber6);


    }
}
