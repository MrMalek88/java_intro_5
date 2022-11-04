package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _05_containsAll_Method {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Sweden");

        System.out.println(countries.contains(("Spain")));
        System.out.println(countries.contains("Sweden") && (countries.contains("Denmark")));

        ArrayList<String> europeCountries = new ArrayList<>();
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Sweden");

        System.out.println(countries.contains(europeCountries));
    }
}
