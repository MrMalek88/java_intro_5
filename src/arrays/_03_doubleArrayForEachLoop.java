package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _03_doubleArrayForEachLoop {
    public static void main(String[] args) {
        double[] numbers = {8.5, 6, 10.3, 5};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers.length);
        for(double number: numbers){
            System.out.println(number);
        }
    }
}
