package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        String[] countries = new String [3];

        countries[1] = "Spain";
        countries[2] = "Belgium";

        System.out.println(countries[1]);

        //Print arrays

        countries[1] = "France";
        System.out.println(Arrays.toString(countries));

        System.out.println(countries.length);

        System.out.println(countries[0]);
        System.out.println(countries[1]);
        System.out.println(countries[2]);

        //combining a loop with ARRAY
        for (int i = 0; i < 3; i++) {

            System.out.println(countries[i]);

        }
    }
}
