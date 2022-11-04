package casting;

public class ExplicitCasting {
    public static void main(String[] args) {
        //Explicit casting - narrowing - down-casting

        int age = 25;

        byte b = (byte) age;

        int num1 = 128;
        byte num2 = (byte) num1;

        System.out.println(num2);
    }
}
