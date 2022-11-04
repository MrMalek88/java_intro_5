package coditional_statements.if_elseif_ladder_statements;

import java.util.Scanner;

public class Exercise1_PositiveOrNegativeOrZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("The number you entered is positive! ");
        }
        else if (num==0) {
            System.out.println("ZERO");

        }

        else {
            System.out.println("The number you entered is negative! ");
        }
    }
}
