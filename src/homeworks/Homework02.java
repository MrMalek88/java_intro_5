package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        System.out.println("TASK 1");
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("The number 1 entered by user is = ");
        num1 = input.nextInt();

        System.out.println("The number 2 entered by user is = ");
        num2 = input.nextInt();

        System.out.println("The sum of number 1 and number 2 entered by user is = " + (num1 + num2));


        System.out.println("TASK 2");

        int num3, num4;

        System.out.println("Enter the first number:");

        num3 = input.nextInt();

        System.out.println("Enter the second number:");
        num4 = input.nextInt();

        System.out.println("The product of the given 2 numbers is:" + (num3* num4));

        System.out.println("TASK 3");
        double value1, value2;

        System.out.println("Enter the first number: ");
        value1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        value2 = input.nextDouble();

        System.out.println("The sum of the given numbers is = " + (value1 + value2));
        System.out.println("The product of the given numbers is = " + (value1 * value2));
        System.out.println("The subtraction of the given numbers is = " + (value1 - value2));
        System.out.println("The division of the given numbers is = " + (value1 / value2));
        System.out.println("The remainder of the given numbers is = " + (value1 % value2));

        System.out.println("TASK 4");
        System.out.println("Test Data: ");
        System.out.println((-10 + 7 * 5));
        System.out.println((72+24)% 24);
        System.out.println(10+-3*9/9);
        System.out.println(5 + 18 / 3 * 3 -(6%3));

        System.out.println("TASK 5");
        int firstNumber, secondNumber;
        System.out.println("Please enter 2 numbers: ");
        firstNumber = input.nextInt();
        secondNumber = input.nextInt();

        System.out.println("The average of the given numbers is: " + (firstNumber + secondNumber)/2);

        System.out.println("TASK 6");
        int num5, num6, num7, num8, num9;

        System.out.println("Please enter 5 numbers: ");

        num5 = input.nextInt();
        num6 = input.nextInt();
        num7 = input.nextInt();
        num8 = input.nextInt();
        num9 = input.nextInt();

        System.out.println("The average of the given numbers is: " + (num5 + num6 + num7 + num8 + num9)/5);


        System.out.println("TASK 7");

        int num10, num11, num12;

        System.out.println("Please enter 3 numbers: ");

        num10 = input.nextInt();
        num11 = input.nextInt();
        num12 = input.nextInt();

        System.out.println("The first number entered squared = : " + num10*num10);
        System.out.println("The second number entered squared = : " + num11*num11);
        System.out.println("The third number entered squared = : " + num12*num12);


        System.out.println("TASK 8");

        int num13;
        System.out.println("Please enter the measurement of 1 side of the square: ");

        num13 = input.nextInt();
        System.out.println("The perimeter of the square = " + (4* num13));
        System.out.println("The area of the square = " + (num13* num13));


        System.out.println("TASK 9");
        double yearlySalary = 90_000;
        System.out.println("A Software Engineer in Test can earn $" + yearlySalary*3 + " in 3 years.");


        System.out.println("Whats your favorite book ");
        input.nextLine();


        System.out.println("-----TASK10-----");

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
