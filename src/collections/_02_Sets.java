package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashset = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(0);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet);

        linkedHashset.add(5);
        linkedHashset.add(5);
        linkedHashset.add(10);
        linkedHashset.add(0);
        linkedHashset.add(null);
        linkedHashset.add(null);

        System.out.println(linkedHashset);

        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(0);
        //treeSet.add(null);


        System.out.println(treeSet);
    }
}
