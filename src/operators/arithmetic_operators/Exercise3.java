package operators.arithmetic_operators;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        /*
        TASK - Calculate monthly payment

        Ask user to calculate their yearly salary
        Then, calculate how much they make monthly

        Program: Hey user, how much you make yearly?
        User: 120000

        Program: your monthly payment is $10000.0 then!
         */

        Scanner inputReader = new Scanner(System.in);
        double yearlySalary;

        System.out.println("Hey user,how much do you make yearly?");
        yearlySalary = inputReader.nextDouble();

        System.out.println("Your monthly payment is $" + yearlySalary / 12 + " then!" );

    }
}
