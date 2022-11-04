package operators.logical_operators;

public class LogicalOperators {

    public static void main(String[] args) {
        boolean b1 = 3 < 5; //t
        boolean b2 = 5 != 5; //f
        boolean b3 = 2 == 5; //t

        boolean b5 = b1 && b2 && b3; //false

        System.out.println(b1); //t

    }
}