package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _01_lists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orage");
        fruits.add("");
        fruits.add("");
        fruits.add(null);
        fruits.add(null);

        System.out.println(fruits);

        fruits.clear();

        System.out.println(fruits);


        Set<String> nums = new HashSet<>();

        nums.add("joe");
        nums.add("xoe");
        nums.add("ve");

        nums.add("henr");

        nums.add("dele");

        System.out.println(nums);
    }
}

