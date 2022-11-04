package mathClass;

public class MinAndMaxMethods {
    public static void main(String[] args) {

        int maxNumber = Math.max(80, 27); //80
        int maxNumber2 = Math.max(maxNumber, 125); //80

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("maxNumber = " + maxNumber2);

        int minNumber = Math.min(-40, -60);

        System.out.println("\nminNumber = " + minNumber);

        double maxOfTwoDecimals = Math.max(6.6, 1.2);

        System.out.println("maxOfTwoDecimals" + maxOfTwoDecimals);

        int maximumNumber = Math.max(6,9);
        System.out.println("maximum Number = " + maximumNumber);
        int maximumNumbers = Math.max(17,49);
        System.out.println("maximum Numbers = " + maximumNumbers);
        double maximumNumberDecimal = Math.max(34.2,12.5);
        System.out.println("maximum Number of 2 decimals = " + maximumNumberDecimal);
        int maximumNegNumber = Math.max(-14,-32);
        System.out.println("maximum Negative Number = " + maximumNegNumber);

        int minimumNumber = Math.min (6,9);
        System.out.println("The minimum number = " + minimumNumber);

        Math.min(45, 32);
            Math.min(56, 89);
        System.out.println("min is " + Math.min(Math.min(45, 32) , Math.min(56, 89) ) );


    }
}
