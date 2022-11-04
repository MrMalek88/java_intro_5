package coditional_statements.if_else_statements;

import java.util.Scanner;

public class ShortIfElse {

    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);

                System.out.println("Please enter 2 diff. numbers:");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (num1 > num2){

                    System.out.println(num1 + " is the greatest.");
                }
                else{
                    System.out.println(num2 + " is the greatest.");

                }

    }
}
