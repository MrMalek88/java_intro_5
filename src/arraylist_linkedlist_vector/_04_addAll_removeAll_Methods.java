package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _04_addAll_removeAll_Methods {
    public static void main(String[] args) {
        ArrayList<String> group1Students = new ArrayList<>();
        group1Students.add("Alex");
        group1Students.add("Mike");


        ArrayList<String> group2Students = new ArrayList<>();
        group2Students.add("Oats");
        group2Students.add("AJ");
        group2Students.add("Hamza");

        ArrayList<String> group3Students = new ArrayList<>();
        group2Students.add("Jake");
        group2Students.add("Jim");
        group2Students.add("Jalal");

        ArrayList<String> allStudents = new ArrayList<>();
        allStudents.addAll(group1Students);
    }
}
