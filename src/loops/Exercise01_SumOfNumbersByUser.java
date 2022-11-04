package loops;

import utilities.ScannerHelper;

public class Exercise01_SumOfNumbersByUser {

    public static void main(String[] args) {
        int num1 = ScannerHelper.getANumber();
        int num2 = ScannerHelper.getANumber();
        int num3 = ScannerHelper.getANumber();
        int sum = num1 + num2 + num3;


        System.out.println(sum);
}
}
