package casting;

public class ExplicitCasting {

    public static void main(String[] args) {


        //EXPLICIT casting - NARROWING - DOWN CASTING           (OTHER NAMES OF EXPLICIT)

        int age = 25;

        byte b = (byte) age;

        System.out.println(b);

        //But we will lose data if bigger primitive holds a data that cannot be stored in the small one

        int num1 = 128;
        byte num2 = (byte) num1; // it seems ok to the compiler

        System.out.println(num2);

    }
}
