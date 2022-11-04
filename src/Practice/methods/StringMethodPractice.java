package Practice.methods;

public class StringMethodPractice {

    public static void main(String[] args) {
        StringMethodPractice StringMethodPractices;
        System.out.println(StringMethodPractice.isCharExisting("John", 'o', 1));
        System.out.println(StringMethodPractice.isCharExisting("John", 'o', 2));
        System.out.println(StringMethodPractice.isCharExisting("Peter", 'o', 1));
        System.out.println(StringMethodPractice.isCharExisting("Peter", 'r', 4));
    }

    /*
    Create a public static method named as "isCharExisting" which will take a String, a char, and an index,
    it will return true if that char is existing in that String at the given index

    Example:
    "John", "o", 1 --> true
    "John", "o", 2 --> false
    "Peter, "o", 1 --> false
    "Peter, "r", 4 --> true
     */

    public static boolean isCharExisting (String str1, char c,int index){
        return str1.charAt(index) == c;
    }
}