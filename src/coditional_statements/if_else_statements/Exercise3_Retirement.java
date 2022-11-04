package coditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise3_Retirement {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter your age: ");
            int retiredAge = 55;
            int givenAge = input.nextInt();

            if (givenAge >= 55) {
                System.out.println("It's your time to be retired!");

            }

            else {
                System.out.println("Sorry, you have " + (retiredAge - givenAge) + " years to be retired. ");


            }
        }
    }

