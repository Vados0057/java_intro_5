package operators.shorthad_assignment_operators;

public class UnderstandingShorthandAssignmentOperators {
    public static void main(String[] args) {
        int age = 10;
        System.out.println(age); //10

        // What will be the age 5 years later

        age += 5; //age = age +5;
        System.out.println(age); //15


        // double balance = 100.0;
        // balance -=4; // balance = 96;
        //lunch  // balance -= 10.0; // balance = 86.0;
        //weekly payment from job
        //balance += 100.0; // balance = 186.0; (become)

        /* Task 2

         */
        int num1 = 50;
        System.out.println(num1 %= 12);

        int num2 = 5;
        num2 *=3;
        System.out.println(num2);

    }
}
