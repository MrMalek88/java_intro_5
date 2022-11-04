package string_methods;

public class _16_split_Method {
    public static void main(String[] args) {
        String a = "Oats";
        String b = "is huff";
        if(a.length() == 0)
            a = "@";
        if(b.length() == 0)
            b = "@";


        System.out.println(a.substring(0,1) + b.substring(b.length()-1,b.length()));
    }
}
