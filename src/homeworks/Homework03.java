package homeworks;

import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args) {

        System.out.println("\nTASK 1\n");

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Please enter 2 numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));

        System.out.println("\nTASK 2\n");
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;

        System.out.println("Please enter 5 numbers: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();

        System.out.println("Max value = " + (Math.max(n1, Math.max(Math.max (n2, n3), Math.max (n4, n5) ))));
        System.out.println("Min value = " + (Math.min(n1, Math.min(Math.min (n2, n3), Math.min (n4, n5) ))));


        System.out.println("\nTASK 3\n");

        int randomNumber50To100 = (int) (Math.random() * (100 - 50 + 1) + 50);

        int random1 = 55, random2 = 67, random3 = 90;

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("The sum of numbers is = " + (random1 + random2 + random3));


        System.out.println("\nTASK 4\n");
        double Alex = 125;
        double Mike = 220;
        double loan = 25.5;

        System.out.println("Alex's money: $" + (Alex - loan));
        System.out.println("Mike's money: $" + (Mike + loan));

        System.out.println("\nTASK 5\n");

        int costOfBike = 390;
        double dailySavings = 15.60;
        int days = (int) ((int) costOfBike / dailySavings);

        System.out.println(days);

        System.out.println("\nTASK 6\n");

        String s1 = "5", s2 = "10";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("Sum of 5 and 10 is = " + (i1 + i2));
        System.out.println("Product of 5 and 10 is = " + (i1 * i2));
        System.out.println("Division of 5 and 10 is = " + (i1 / i2));
        System.out.println("Subtraction of 5 and 10 is = " + (i1 - i2));
        System.out.println("Remainder of 5 and 10 is = " + (i1 % i2));


        System.out.println("\nTASK 7\n");

        String v1 = "200", v2 = "-50";
        int f1 = Integer.parseInt(v1);
        int f2 = Integer.parseInt(v2);

        System.out.println("The greatest value is = " + Math.max(f1, f2));
        System.out.println("The smallest value is = " + Math.min(f1, f2));
        System.out.println("The average value is = " + (f1 + f2)/2);
        System.out.println("The absolute value is = " + Math.abs(f1 - f2)/2);


        System.out.println("\nTASK 8\n");

        double savingsDaily = .96;
        int daysToSave = (int) ((int)24/savingsDaily);
        int daysToSave1 = (int) ((int)168/savingsDaily);

        System.out.println(daysToSave + " days");
        System.out.println(daysToSave1 + " days");
        System.out.println("$" + 150 * savingsDaily);


        System.out.println("\nTASK 9\n");

        int computerPrice = 1250;
        double dailySave = 62.65;
        int numDays = (int) ((int) computerPrice / dailySave);

        System.out.println(numDays);

        System.out.println("\nTASK 10\n");

        int DanSave = 14265;
        double option1 = 475.50;
        double option2 = 951;

        int monthsToSaveOption1 = (int) (DanSave/option1);
        int monthsToSaveOption2 = (int) (DanSave/option2);
        System.out.println("Option 1 will take " + monthsToSaveOption1 + " months ");
        System.out.println("Option 2 will take " + monthsToSaveOption2 + " months ");


        System.out.println("\nTASK 11\n");

        int inputA, inputB;

        System.out.println("Hey User, please enter your first number: ");
        inputA = input.nextInt();
        input.nextLine();

        System.out.println("Hey User, please enter your second number: ");
        inputB = input.nextInt();
        input.nextLine();

        double inputAa = inputA, inputBb = inputB;

        System.out.println(inputAa / inputBb);


        System.out.println("\nTASK 12\n");

        int randomNumber0To100 = (int) (Math.random() * (100 + 1));
        int randomNumber0To1001 = (int) (Math.random() * (100 + 1));
        int randomNumber0To1002= (int) (Math.random() * (100 + 1));

        boolean ifNumberBiggerThan25 = randomNumber0To100 > 25 && randomNumber0To1001 > 25 && randomNumber0To1002 > 25;

        System.out.println(ifNumberBiggerThan25);


        System.out.println("\nTASK 13\n");

        System.out.println("Hey User, please enter a number between 1 and 7: ");
        int userInput1 = input.nextInt();

        if(userInput1 == 1){
            System.out.println("MONDAY");
        } else if (userInput1 == 2) {
            System.out.println("TUESDAY");
        } else if (userInput1 == 3) {
            System.out.println("WEDNESDAY");
        } else if (userInput1 == 4) {
            System.out.println("THURSDAY");
        } else if (userInput1 == 5) {
            System.out.println("FRIDAY");
        } else if (userInput1 == 6) {
            System.out.println("SATURDAY");
        } else if (userInput1 == 7) {
            System.out.println("SUNDAY");
        } else{
            System.out.println("Number entered not within scope");
        }

        System.out.println("\nTASK 14\n");
        int exam1, exam2, exam3;

        System.out.println("Tell me your exam results?");
        exam1 = input.nextInt();
        exam2 = input.nextInt();
        exam3 = input.nextInt();
        input.nextLine();

        int average = (exam1 + exam2 + exam3) / 3;

        if(average >= 70){
            System.out.println("YOU PASSED!");
        }
        else{
            System.out.println("YOU FAILED!");
        }


        System.out.println("\nTASK 15\n");

        int number1, number2, number3;

        System.out.println("Enter 3 numbers");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        input.nextLine();

        if(number1 == number2 && (number2 == number3)){
            System.out.println("TRIPLE MATCH");
        } else if (number1 == number2 || number2 == number3 || number1 == number3) {
            System.out.println("DOUBLE MATCH");
        } else{
            System.out.println("NO MATCH");
        }
    }
}
