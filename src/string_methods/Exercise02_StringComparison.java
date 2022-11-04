package string_methods;

public class Exercise02_StringComparison {
    public static void main(String[] args) {

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.equals(s2.toUpperCase()));
    }
}
