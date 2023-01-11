package string_methods;

import java.util.Scanner;

public class Exercise01_StringComparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter Str;");
//
//        String st = input.nextLine();
//
//        System.out.println("Enter Str;");
//
//        String str2 = input.nextLine();

        String str = "kelaM";
        int count = str.length();
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev + str.charAt(i);

            System.out.println(rev);

        }

    }
}
