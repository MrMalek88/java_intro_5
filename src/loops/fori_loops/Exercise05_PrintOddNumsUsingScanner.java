package loops.fori_loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise05_PrintOddNumsUsingScanner {

    public static void main(String[] args) {
        int number = ScannerHelper.getANumber();

        for (int i = 0; i <= number ; i++) {
            if(i % 2 == 0) System.out.println(i);
            
        }
    }
}
