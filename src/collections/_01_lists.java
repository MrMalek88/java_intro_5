package collections;

import java.util.ArrayList;

public class _01_lists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("");
        fruits.add("");
        fruits.add(null);
        fruits.add(null);

        System.out.println(fruits);

        fruits.clear();

        System.out.println(fruits);
    }
}

