package operators.shorthand_assignment_operators;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        double balance, firstTransaction, secondTransaction, thirdTransanction;

        System.out.println("Hey user, ur balance:");
        balance = inputReader.nextDouble();

        System.out.println("Now tell me your first transaction: ");
        firstTransaction = inputReader.nextDouble();

        balance -= firstTransaction;

        System.out.println("Balance after 2nd transaction = $" + balance);

        System.out.println("Now tell me your second transaction: ");
        secondTransaction = inputReader.nextDouble();

        balance -= secondTransaction;

        System.out.println("Balance after 2nd transaction = $" + balance);

        System.out.println("Balance after 3rd transaction = $" + balance);

        System.out.println("Now tell me your third transaction: ");
        double thirdTransaction = inputReader.nextDouble();

        balance -= thirdTransaction;

        System.out.println("Balance after 3rd transaction = $" + balance);
    }
}
