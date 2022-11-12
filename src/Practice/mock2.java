package Practice;

public class mock2 {
    public static void main(String[] args) {
        System.out.println(palindrome("Civic"));
    }
    public static boolean palindrome (String str){

        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        return str.equals(reverse);


        // Regular reverse
        //String str = "Othman";
        //String reverse = "";

        //for (int i = str.length()-1; i >= 0; i--){
            //System.out.println(str.charAt(i));
            //reverse+=str.charAt(i);

            
        }
        //System.out.println(reverse);

    }


