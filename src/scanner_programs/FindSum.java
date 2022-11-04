package scanner_programs;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {

        int num1,num2,num3;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number 1: ");
        num1 = input.nextInt();

        System.out.println("Please enter first number 2: ");
        num2 = input.nextInt();

        System.out.println("Please enter first number 3: ");
        num3 = input.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("The sum of the numbers you entered is = " + sum);

        System.out.println("TASK 10");

        System.out.println("Whats your favorite book ");
        String favBook = input.nextLine();

        System.out.println("Whats your favorite color ");
        String favColor = input.nextLine();

        System.out.println("Whats your favorite number ");
        String favNumber= input.nextLine();

        System.out.println("User's favorite book is: " + favBook);

        System.out.println("User's favorite color is: " + favColor);

        System.out.println("User's favorite number is: " + favNumber);

        System.out.println("-----TASK11-----");

        System.out.println("Whats your first name ");
        String firstName = input.nextLine();

        System.out.println("Whats your last name ");
        String lastName = input.nextLine();

        System.out.println("Whats your age ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Whats your email address ");
        String emailAddress = input.nextLine();

        System.out.println("Whats your phone number ");
        String phoneNumber = input.nextLine();

        System.out.println("Whats your address ");
        String address = input.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " "+lastName +". " + firstName + "'s age is \n"
                + age + ". " + firstName + "'s " + "email address is " + emailAddress +", phone number\n" +
                "is " + phoneNumber +", and address is " + address + ".");
    }
}
