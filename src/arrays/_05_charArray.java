package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {

        System.out.println("TASK 1");

        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters));

        System.out.println("TASK 2");
        System.out.println("# of chars are " + characters.length);

        System.out.println("TASK 3");
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);

        }

        System.out.println("TASK 4");
        for (char character : characters) {
            System.out.println(character);

            System.out.println("TASK 5");

            char letters = 0;
            for (char element : characters) {
                if(Character.isLetter(element)) System.out.println(element);

                //System.out.println("\n----------TASK-5 - fori loop-----------\n");
                //for (int i = 0; i < characters.length; i++) {
                    //if(Character.isLetter(characters[i])) System.out.println(characters[i]);
                //}

                System.out.println("TASK 6");
                for (int i = 0; i < characters.length; i++) {
                    if(Character.isUpperCase(characters[i])) System.out.println(characters[i]);

                }

            }
        }
    }
}
