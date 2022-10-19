package casting;

public class PrimitivesToString {
    public static void main(String[] args) {

        int num1 = 5, num2 = 10;

        System.out.println(num1 + num2); //15 - primitive - number
        System.out.println("" + num1 + num2); //510 - String - text
        System.out.println("" + (num1 + num2)); // 15 - String - text

        System.out.println(String.valueOf(num1) + String.valueOf(num2)); //510 - String - text
        // "5" + "10"  ->510

        System.out.println(String.valueOf(23) + 5);

    }
}
