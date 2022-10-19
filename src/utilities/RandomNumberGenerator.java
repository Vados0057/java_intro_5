package utilities;

public class RandomNumberGenerator {

    /*
    Create a method that generate a random number between 2 numbers(both numbers are included)
     */

    public static int getARandomNumber(int i1, int i2){

        /*
        int randomNumber = (int) (Math.random() * (Math.abs(i1 - i2) + 1)) + 1;
        return randomNumber;
         */
        return (int) (Math.random() * (Math.abs(i1 - i2) + 1)) + Math.min(i1, i2);
    }
}
