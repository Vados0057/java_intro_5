package operators.relational_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int a = 5, b = 10;
        System.out.println(a < b); // true
        System.out.println(a <= b);  // true
        System.out.println(a != b); // true
        System.out.println(a + a == b); // true
        System.out.println(4 * a == 2 * b); //true

        System.out.println(true == true);  // true
        System.out.println(true == false); // false`
        System.out.println(true != false); //true

        System.out.println((3 < 5) == (10 > 2)); //true
        System.out.println((1 + 5 + 10) == (2 * 8)); //true
        System.out.println();

        int num1 = 10;
        int num2 = 3;
        boolean b1 = num1 < num2;
        System.out.println("The last result is = " + b1);


        int age1 = 20, age2 = 30;

        // age1 < age2 -> true
        //age1 > age2 - > false

        //age1 == age2 -> false
        //age1!= age2 -> true



    }
}
