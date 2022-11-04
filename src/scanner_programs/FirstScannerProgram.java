package scanner_programs;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {
        //1. Create a scanner object

        //dataType variableName = value;

        String fName, lName;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter your name:");
        fName = inputReader.next();

        System.out.println("Please enter your last name:");
        lName = inputReader.next();

        System.out.println("Your full name is = " + fName + " " + lName);

        System.out.println("TASK 9");
        double yearlySalary = 90_000;
        System.out.println("A Software Engineer in Test can earn $" + yearlySalary*3 + " in 3 years.");



    }
}
