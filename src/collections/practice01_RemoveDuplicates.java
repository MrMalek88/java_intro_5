package collections;

import java.util.LinkedHashSet;

public class practice01_RemoveDuplicates {

    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(-5);
        numbers.add(10);
        numbers.add(-5);
        numbers.add(10);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);

        System.out.println(numbers);
    }
}
