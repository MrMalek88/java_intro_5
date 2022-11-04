package string_methods;

public class _07_indexOf_lastIndexOf_Methods {
    public static void main(String[] args) {
        String company = "TechGlobal School";

        int firstIndexOfO = company.indexOf('o');
        int lastIndexOfO = company.lastIndexOf('o');

        System.out.println(firstIndexOfO);
        System.out.println(lastIndexOfO);

        int firstIndexOfL = company.indexOf('l');
        int lastIndexOfL = company.lastIndexOf('l');

        System.out.println(firstIndexOfL);
        System.out.println(lastIndexOfL);
    }
}
