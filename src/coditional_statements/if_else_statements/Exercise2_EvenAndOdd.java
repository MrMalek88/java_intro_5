package coditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise2_EvenAndOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number you entered is even!");

        }

        else {
            System.out.println("The number you entered is odd!");


        }
    }
}