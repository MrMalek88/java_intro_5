package loops.do_while_loops;

import java.util.Scanner;

public class Exercise01_get10FromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int count =1;

        do {
            if(count ==1) System.out.println("Plz enter a #:");
            else System.out.println("Enter another #:");
            number = input.nextInt();

            if (number<10) System.out.println("That aint 10 biyaaach");
        } while (number < 10);

        System.out.println("Now you good bruh");
    }

    private static void While(boolean b) {
    }

}


