package Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Project06 {

    public static void main(String[] args) {
        System.out.println("---TASK 1---");
        String[] words = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(words));

        System.out.println("-----------TASK 2-----------");
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(2,-5,6,7,-10,-78, 0, 15));
        removeNegatives(nums1);

        System.out.println("\n-----------TASK 3-----------\n");
        validatePassword("Malek@123");

        System.out.println("\n-----------TASK 4-----------\n");
        System.out.println(emailIsValid("JavaIsGr8et@school.com"));
    }
    public static int countMultipleWords(String[] array){
    int count = 0;
    for (String words : array) {
        for (int i = 1; i < words.length() -1 ; i++) {
            if (words.charAt(i) == ' ' && Character.isLetter(words.charAt(i - 1)) && Character.isLetter(words.charAt(i + 1))){
                count++;
                break;
            }
        }
    }
    return count;
}
    //TASK 2
    public static void removeNegatives(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 0) {
                nums.remove(nums.get(i));
                i--;
            }

        }
        System.out.println(nums);
    }
    public static void validatePassword(String str){

        if (str.length() >= 8 && str.length() <= 16){
            int countDigit = 0, countUpper = 0, countLower = 0, countSpecial = 0;
            for (int i = 0; i < str.length(); i++){
                if (Character.isUpperCase(str.charAt(i))){
                    countUpper++;
                } else if (Character.isLowerCase(str.charAt(i))) {
                    countLower++;
                } else if (Character.isDigit(str.charAt(i))) {
                    countDigit++;
                } else if (str.charAt(i) != ' '){
                    countSpecial++;
                }
            }if (countLower > 0 && countUpper > 0 && countDigit > 0 && countSpecial > 0){
                System.out.println(true);
            }else System.out.println(false);
        }
    }
    //TASK 4

    public static boolean emailIsValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

}
