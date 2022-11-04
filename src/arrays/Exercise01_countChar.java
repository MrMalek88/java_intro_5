package arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {

        String word = "Java";
        int countA = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'a') countA++;

        }

        System.out.println(countA);
    }
}
