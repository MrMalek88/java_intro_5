package homeworks;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework12 {

    public static void main(String[] args) {

        System.out.println("\n------TASK ONE------\n");
        String str = "123Tech456Global149";
        System.out.println(noDigit(str));

        System.out.println("\n------TASK TWO------\n");
        String str2 = "JAVA";
        System.out.println(noVowel(str2));

        System.out.println("\n------TASK THREE------\n");
       String str3 = "John's age is 29";
       System.out.println(sumOfDigits(str3));

        System.out.println("\n------TASK FOUR------\n");
        String str4 = "JOHN";
        System.out.println(hasUpperCase(str4));

        System.out.println("\n------TASK FIVE------\n");
        int num1 = 1, num2 = 78, num3 = 5;
        System.out.println(middleInt(num1,num2,num3));

        System.out.println("\n------TASK SIX------\n");
        int[] array = {13, 13, 13};
        System.out.println(Arrays.toString(no13(array)));

        System.out.println("\n------TASK SEVEN------\n");
        int[] array7 = {1,2,3,4};
        System.out.println(Arrays.toString(arrFactorial(array7)));


        System.out.println("\n-------------Task 8-------------\n");
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));

    }

    public static String noDigit(String str){
        return str.replaceAll("[1-9]", "");
    }

    public static String noVowel(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }
    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(str.charAt(i) + "");
        }
        return sum;
    }

    public static boolean hasUpperCase(String str){
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static int middleInt(int num1, int num2, int num3){
        if(num1 > num2 && num1 < num3) return num1;
        else if(num2 > num3 && num2 < num1) return num2;
        return num3;
    }

    public static int[] no13(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == 13) array[i] = 0;
        }
        return array;
    }

    public static int[] arrFactorial(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0 || array[i] == 1) array[i] = 1;
            else{
                array[i] *= array[i] - 1;
            }
        }
        return array;
    }
    public static String[] categorizeCharacters(String str) {

        String[] categorized = {"", "", ""};
        for (char character : str.toCharArray()) {
            if (Character.isLetter(character)) categorized[0] += character + "";
            else if (Character.isDigit(character)) categorized[1] += character + "";
            else categorized[2] += character + "";
        }
        return categorized;

    }
}