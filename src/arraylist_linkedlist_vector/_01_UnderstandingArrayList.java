package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {

        //1. Declaring an Array
        String[] names1 = new String[3];

        //1. Declaring an Array
        ArrayList<String> names2 = new ArrayList<>(); //capacity is automatically 10

        //2. HOW TO PRINT the length of AN ARRAY VS PRINTING ARRAY LIST SIZE

        System.out.println("The size of the array = " + names1.length);
        System.out.println("The size of the array LIST = " + names2.size());

        //3. HOW TO PRINT AN ARRAY VS PRINTING ARRAY LIST

        System.out.println(Arrays.toString(names1));
        System.out.println(names2);

        //4. HOW TO add elements to specific indexes

        names1[0] = "Alex";
        names2.add(0, "John");


        System.out.println(Arrays.toString(names1));
        System.out.println(names2);

        //TASK ADD ALI ANDRII TO ARRAY

        //ADD JOE JANE TO ARRAY LIST

        names1[1] = "Ali";
        names1[2] = "Andrii";

        names2.add(1,"Joe");
        names2.add(2,"Jane");
        names2.add(3,"Abdallah");
        names2.add(4,"Vlad");
        names2.add(5,"Saeed");
        names2.add(6,"Suzanne");
        names2.add(7,"Hazal");
        names2.add(8,"Yildiz");
        // experiment names2.add(9,"Yildiz");
        names2.add(9,"Samir");


        System.out.println(Arrays.toString(names1));
        System.out.println(names2);

        System.out.println("The size of the array LIST = " + names2.size());

        //5. updating existing element in array list
        //5. WHEN U CALL IT WITH CLASS NAME NON STATIC, WHEN U CALL IT WITH OBJECTS = STATIC

        names1[1] = "Mike";
        names2.set(1, "Olena");

        System.out.println(Arrays.toString(names1));
        System.out.println(names2);

    }
}
