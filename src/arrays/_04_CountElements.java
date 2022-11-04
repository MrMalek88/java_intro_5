package arrays;

import java.util.Arrays;

public class _04_CountElements {
    public static void main(String[] args) {
        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        int negatives = 0;
        int positives = 0;
        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number < 0) negatives++;
        }

        System.out.println("There are " + negatives + " negative numbers in this array");
        for (int number : numbers) {
            if (number > 0) positives++;
        }

        System.out.println("There are " + positives + " positive numbers in this array");
        for (int number : numbers) {
            if (number % 2 == 0) even++;
        }

        System.out.println("There are " + even + " even numbers in this array");
        for (int number : numbers) {
            if (number % 2 == 1) odd++;
        }

        System.out.println("There are " + odd + " odd numbers in this array");
        for(int number: numbers) {
        }
    }

}

