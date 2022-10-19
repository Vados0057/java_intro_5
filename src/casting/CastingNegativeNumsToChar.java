package casting;

public class CastingNegativeNumsToChar {

    public static void main(String[] args) {

        int negative = -32;
        char myChar = (char) negative;
        System.out.println("\nNegative number char value is = " + myChar);

        char zero = 48;
        System.out.println("\nZero = " + zero);

        char Z = 90;
        char A = 65;
        System.out.println("\nUppercase A = " + A );
        System.out.println("Uppercase  Z = " + Z );


        char myCharO = 'U';
        int oAsciiValue =  myCharO;

        System.out.println("\nUppercase 0 = " + myCharO);
        System.out.println("O ASCII valur = " + oAsciiValue);

        if (oAsciiValue >= 65 && oAsciiValue <= 90) System.out.println("Your char is Uppercase");
        else System.out.println("your char is not uppercase");

    }
}
