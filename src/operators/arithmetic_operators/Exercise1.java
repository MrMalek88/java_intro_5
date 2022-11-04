package operators.arithmetic_operators;

public class Exercise1 {
    public static void main(String[] args) {
        /*

        Area = shortside * longside
        Perimeter = 2 * (shortside + longside)
        Expected output:
        Area = 28
        Perimeter = 22
         */

        int shortSide = 4;
        int longSide = 7;

        System.out.println("The area = " + shortSide * longSide);
        System.out.println("The perimeter = " + 2 * (shortSide * longSide));

    }
}
