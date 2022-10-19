package operators.increment_decrement_operators;

public class PreIncrementVsPostIncrement {
    public static void main(String[] args) {
        //Post-Increment
        int num1 = 5;
        num1++; // increased by 1 but assign it later. | num1 =6
        System.out.println(num1); //6

        //Pre-Increment
        int num2 = 5;
        ++num2;  // increased it by 1 an assign it now | num2 = 6
        System.out.println(num2); // 6


        //Understanding difference
        byte b1 = 5, b2 = 5;
        System.out.println("Post increment -> " + b1++);
        System.out.println("Pre increment -> " + ++b2);
    }
}
