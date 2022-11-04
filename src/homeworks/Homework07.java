package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(23);
        nums.add(67);
        nums.add(23);
        nums.add(78);

        System.out.println(nums.get(3));
        System.out.println(nums.get(0));
        System.out.println(nums.get(2));
        System.out.println(nums);

        System.out.println("-----TASK 2-----");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println("-----TASK 3-----");

        ArrayList<Integer> newNums = new ArrayList<>();
        newNums.add(23);
        newNums.add(-34);
        newNums.add(-56);
        newNums.add(0);
        newNums.add(89);
        newNums.add(100);

        System.out.println(newNums);

        Collections.sort(newNums);

        System.out.println(newNums);

        System.out.println("-----TASK 4-----");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);

        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("-----TASK 5-----");
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Spider Man");
        heroes.add("Iron Man");
        heroes.add("Black Panther");
        heroes.add("Deadpool");
        heroes.add("Captain America");

        System.out.println(heroes);

        System.out.println(heroes.contains("Wolverine"));

        System.out.println("-----TASK 6-----");

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");

        Collections.sort(avengers);
        System.out.println(avengers);

        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println("-----TASK 7-----");

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');

        System.out.println(chars);

        for (Character c: chars
             )
            System.out.println(c);{


        }


        System.out.println("\n-----TASK8-----\n");

        ArrayList<String> objects = new ArrayList<>();

        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int count = 0;
        int count1 = 0;

        for (String o: objects) {
            if (!(o.contains("A") || o.contains("a") || o.contains("E") || o.contains("e")))
                count++;
            if (o.toLowerCase().startsWith("m")) count1++;
        }
        System.out.println(count1);
        System.out.println(count);

        System.out.println("\n-----TASK9-----\n");

        ArrayList<String> kitchen = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));

        System.out.println(kitchen);

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countP = 0;
        int startsWithOrEndsWith = 0;

        for (String s : kitchen) {
            if (Character.isUpperCase(s.charAt(0))) countUpperCase++;
            else countLowerCase++;
            if (s.startsWith("P") || s.endsWith("p"))
            {
                countP++;
                startsWithOrEndsWith ++;
            } else if (s.contains("P") || s.contains("p")) countP++;
        }

        System.out.println("Elements starts with uppercase = " + countUpperCase);
        System.out.println("Elements starts with lowercase = " + countLowerCase);
        System.out.println("Elements having P or p= " + countP);
        System.out.println("Elements starting or ending with P or p = " + startsWithOrEndsWith);

        System.out.println("\n-----TASK10-----\n");

        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(7);
        numbers2.add(10);
        numbers2.add(0);
        numbers2.add(20);
        numbers2.add(17);
        numbers2.add(10);
        numbers2.add(23);
        numbers2.add(56);
        numbers2.add(78);

        System.out.println(numbers2);

        int dividedBy10 = 0;
        int evenNumbersGreaterThan15 = 0;
        int oddNumbersLessThan20 = 0;
        int elementsLessThan15OrGreaterThan50 = 0;

        for (Integer i : numbers2) {
            if (i % 10 == 0) dividedBy10++;
            if (i > 15 && i % 2 == 0) evenNumbersGreaterThan15++;
            if (i < 20 && i % 2 == 1) oddNumbersLessThan20++;
            if (i < 15 || i > 50) elementsLessThan15OrGreaterThan50++;
        }

        System.out.println("Elements that can be divided by 10 = " + dividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + evenNumbersGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddNumbersLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + elementsLessThan15OrGreaterThan50);

    }
}
