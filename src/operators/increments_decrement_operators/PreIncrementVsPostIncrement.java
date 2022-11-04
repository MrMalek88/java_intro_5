package operators.increments_decrement_operators;

public class PreIncrementVsPostIncrement {
    public static void main(String[] args) {

        int num1 = 5;
        num1++;

        System.out.println(num1);

        int num2 = 5;

        ++num2;

        System.out.println(num2);

        byte b1 = 5, b2 = 5;
        System.out.println(b1++);
        System.out.println(++b2);
    }
}
