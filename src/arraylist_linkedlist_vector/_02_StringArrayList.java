package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add(0,"Chicago");
        cities.add(1,"Berlin");
        cities.add(2,"Miami");

        System.out.println(cities);
        System.out.println("The size of the Array list is = " + cities.size());

        cities.set(2, "Evanston");
        System.out.println(cities);

        cities.remove(1);
        cities.set(1, "Evanston");
        System.out.println(cities);

        System.out.println("The size of the Array list is = " + cities.size());

        cities.remove(0);
        cities.add("New York");
        cities.add("Rome");
        cities.add("Gent");

        System.out.println(cities);
        System.out.println(cities.size());
        cities.clear();
        System.out.println(cities);


        }

    }

