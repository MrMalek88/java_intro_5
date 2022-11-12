package homeworks;
import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Homework08 {
    public static void main(String[] args) {

        System.out.println("----- TASK 1 -----");
        System.out.println(countConsonants("hello"));

        System.out.println("----- TASK 2 -----");
        System.out.println(wordArray("I    love     Java AND                coding"));

        System.out.println("----- TASK 3 -----");
        System.out.println(removeExtraSpaces("I    love      the bears"));

        System.out.println("----- TASK 4 -----");
        System.out.println(count30OrLess());


        System.out.println("----- TASK 5 -----");
        System.out.println(isDateFormatValid("1/44/3434"));

        System.out.println("----- TASK 6 -----");
        System.out.println(isEmailFormatValid("ilovethis@gmail.com"));


    }

    public static int countConsonants(String str) {
        str = str.replaceAll("[^A-Za-z]", "");
        str = str.replaceAll("[AEIOUaeiou]", "");
        return str.length();
    }

    public static String wordArray(String str) {
        str = removeExtraSpaces(str);
        str = str.replaceAll("[^A-Za-z ]", "");
        return Arrays.toString(str.split(" "));
    }

    public static String removeExtraSpaces(String str) {
        str = str.replaceAll("[\\s]{1,}", " ");
        return str;
    }

    public static int count30OrLess() {
        String str = ScannerHelper.getAString();
        int count = 0;
        str = str.replaceAll("[^A-Za-z ]", "");
        String[] Array = str.split(" ");

        for (String s : Array) {
            if (s.length() <= 3)
                count++;
        }
        return count;
    }

    public static boolean isDateFormatValid(String str) {
        Pattern pattern = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();

    }

    public static boolean isEmailFormatValid(String str) {
        Pattern pattern = Pattern.compile("[\\w.]{2,}@[\\w.[^_]]{2,}\\.[\\w.[^_]]{2,}");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}

