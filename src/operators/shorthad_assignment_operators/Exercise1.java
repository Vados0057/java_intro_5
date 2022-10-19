package operators.shorthad_assignment_operators;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        /*
    Balance = $100.00
    1st transaction = $25.75
    2nd transaction =  $12.50
    3rd transaction = $7.25

    Expected output:
    Balance after 1st transaction = $74.25
    Balance after 2nd transaction = $61.75
    Balance after 3rd transaction = $54.5
        */
        double balance, firstTransaction, secondTransaction, thirdTransaction;
        System.out.println("Hey user, please enter your balance: ");
        balance = inputReader.nextDouble();

        System.out.println("Now, please tell me your first transaction: ");
        firstTransaction = inputReader.nextDouble();
        balance -= firstTransaction;
        System.out.println("Balance after first transaction = $" + balance);

        System.out.println("Now, please tell me your second transaction: ");
        secondTransaction = inputReader.nextDouble();
        balance -= secondTransaction;
        System.out.println("Balance after second transaction = $" + balance  );

        System.out.println("Now, please tell me your third transaction: ");
        thirdTransaction = inputReader.nextDouble();
        balance -= thirdTransaction;
        System.out.println("Balance after third transaction = $" + balance  );
    }
}
