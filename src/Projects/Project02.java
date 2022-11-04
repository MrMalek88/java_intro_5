package Projects;

import java.util.Scanner;

public class Project02 {

    public static void main(String[] args) {
        System.out.println("\nTASK 1\n");

        Scanner input = new Scanner(System.in);


        int num1, num2, num3, product;

        System.out.println("Please enter 3 numbers: ");

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        product = num1*num2*num3;

        System.out.println("The product of the 3 numbers entered is = " + product);


        System.out.println("\nTASK 2\n");

        input.nextLine();

        int currentYear= 2022;

        System.out.println("What is your first name?");
        String fName = input.nextLine();

        System.out.println("What is your last name?");
        String lName = input.nextLine();

        System.out.println("What year were you born?");
        int yOb = input.nextInt();
        input.nextLine();

        System.out.println(fName + " " + lName + "'s age is = " + (currentYear - yOb));

        System.out.println("\nTASK 3\n");


        System.out.println("What is your full name?");
        String fullName = input.nextLine();

        System.out.println("Enter weight in kg: ");
        double weight = input.nextDouble();
        input.nextLine();

        System.out.println(fullName + "'s weight is = " + weight*2.205 + " lbs.");

        System.out.println("\nTASK 4\n");

        int age1, age2, age3;
        String fullName1, fullName2, fullName3;

        System.out.println("What is your full name?");
        fullName1 = input.nextLine();

        System.out.println("What is your age?");
        age1 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        fullName2 = input.nextLine();

        System.out.println("What is your age?");
        age2 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        fullName3 = input.nextLine();

        System.out.println("What is your age?");
        age3 = input.nextInt();
        input.nextLine();

        System.out.println(fullName1 + "'s age is " + age1 + ".");
        System.out.println(fullName2 + "'s age is " + age2 + ".");
        System.out.println(fullName3 + "'s age is " + age3 + ".");


        System.out.println("The average age is " + (age1+age2+age3/3) + ".");
        System.out.println("The eldest age is " + Math.max(age1, Math.max(age2, age3)) + ".");
        System.out.println("The youngest age is " + Math.min(age1, Math.min(age2, age3)) + ".");



    }
}
