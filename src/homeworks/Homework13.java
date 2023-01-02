package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework13 {

    public static void main(String[] args) {
        System.out.println("\n------TASK 1------\n");
        String str = "JDSGNDKRGUJJJ";
        System.out.println(hasLowerCase(str));

        System.out.println("\n------TASK 2 ------\n");
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList (0, 1, 5, 10, 0));
        System.out.println(noZero(arrayList));

//        System.out.println("\n------TASK 3 ------\n");
//        String str = "";
//        System.out.println();

        System.out.println("\n------TASK 4 ------\n");
        String[] arr4 = {"abc", "foo", "java"};
        String str4 = "hello";
        System.out.println(containsValue(arr4,str4));

//        System.out.println("\n------TASK 5 ------\n");
//        String str = "";
//        System.out.println();
//
//        System.out.println("\n------TASK 6 ------\n");
//        String str = "";
//        System.out.println();
//
//        System.out.println("\n------TASK 7 ------\n");
//        String str = "";
//        System.out.println();
//
//        System.out.println("\n------TASK 8 ------\n");
//        String str = "";
//        System.out.println();
//
//        System.out.println("\n------TASK 9 ------\n");
//        String str = "";
//        System.out.println();




    }
    //        System.out.println("\n------TASK 1 ------\n");
    public static Boolean hasLowerCase(String str) {
            Pattern p = Pattern.compile("[a-z]");
            Matcher m = p.matcher(str);
            return m.find();
        //str = "...";
        //return str.replaceAll(["^a-z"],"");

        }
    //        System.out.println("\n------TASK 2 ------\n");
        public static ArrayList noZero(ArrayList<Integer> nums) {
            for (int i = 0; i < nums.size(); i++) {
                if(nums.get(i) == 0) nums.remove(i);
            }
            //nums.removeIf(i -> i == 0); ANOTHER WAY SHORTER
            return nums;

        }
    //        System.out.println("\n------TASK 3 ------\n");
        public static int [][] numberAndSquare(int[] numbers){

        int[][]newArr = new int[numbers.length][2];
            for (int i = 0; i < numbers.length; i++) {
                newArr[i][0] = numbers[i];
                newArr[i][1] = numbers[i] * numbers[i];}
            return newArr;
            }

    //        System.out.println("
    //        \n------TASK 4 ------\n");
        public static boolean containsValue(String[] arr4, String str4){
            return new ArrayList<String>(Arrays.asList(arr4)).contains(str4);

        }
    //        System.out.println("\n------TASK 5 ------\n");
        public static String reverseSentence(String str){

            String[] split = str.split(" ");
            if(split.length < 2) return  "There is not enough words!";
            split[split.length-1] = split[split.length-1].substring(0,1).toUpperCase()+ split[split.length - 1].substring(1);
            split[0] = split[0].toLowerCase();
            String str5 = "";
            for (int i = split.length - 1; i >= 0; i--){
                str += " " + split[i];
            }
            return str.substring(1);
        }
    //Task 6
    public static String removeStringSpecialDigits(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' | Character.isLetterOrDigit(s.charAt(i))) str += s.charAt(i);
        } return str;
    }
    //Task 7

    public static String[] removeArraySpecialDigits(String[] strings){
        String[] removed = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            removed[i] = "";
            for (int j = 0; j < strings[i].length(); j++) {
                if(strings[i].charAt(j) == ' ' | Character.isLetterOrDigit(strings[i].charAt(j))) removed[i] += strings[i].charAt(j);
            }
        } return removed;
    }
    //Task 8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> s1, ArrayList<String> s2){
        s1.retainAll(s2);
        return s1;
    }
    //Task 9
    public static ArrayList<String> noXinVariables(ArrayList<String> strings){
        ArrayList<String> modifiedStrings = new ArrayList<>();
        for (String string : strings) {
            StringBuilder s = new StringBuilder(string);
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'x' | s.charAt(i) == 'X') {
                    s.deleteCharAt(i);
                    i--;
                }
            }
            modifiedStrings.add(s.toString());
        } modifiedStrings.removeIf(String::isEmpty);
        return modifiedStrings;
    }

}