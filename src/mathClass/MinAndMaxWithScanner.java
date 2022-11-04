package mathClass;

import java.util.Scanner;

public class MinAndMaxWithScanner {
    public static void main(String[] args) {

        /*
        Get 2 numbers from user and find their max and min nd then print
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Hey user give me a number ");
        int num1 = input.nextInt();

        System.out.println("Hey user give me another number ");
        int num2 = input.nextInt();

        System.out.println("Your first number is = "  + num1);
        System.out.println("Your second number is = "  + num2);

        System.out.println("Max of your numbers is " + Math.max(num1, num2));
        System.out.println("Min of your numbers is " + Math.min(num1, num2));

        System.out.println("Hey user give me a number ");
        int num3 = input.nextInt();

        System.out.println("Hey user give me a 2nd number ");
        int num4 = input.nextInt();

        System.out.println("Hey user give me a 3rd number ");
        int num5 = input.nextInt();

        System.out.println("Your first number is = "  + num3);
        System.out.println("Your second number is = "  + num4);
        System.out.println("Your third number is = "  + num5);

        Math.max(num3, num4);
        Math.min(num3, num4);

        System.out.println("Max of your numbers is " + Math.max(Math.max(num3, num4), num5));
        System.out.println("Min of your numbers is " + Math.min(Math.min(num3, num3), num5));
    }
}
