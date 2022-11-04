package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("        TASK 1        ");
        int[] numbers = {89, 0, 23, 0, 12, 0, 15, 34, 0, 7};
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("        TASK 2        ");

        String[] letters;

        letters = new String[5];
        letters[1] = "abc";
        letters[4] = "xyz";
        System.out.println(letters[3]);
        System.out.println(letters[0]);
        System.out.println(letters[4]);
        System.out.println(Arrays.toString(letters));

        System.out.println("        TASK 3        ");

        int[] numbers1 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numbers1));
        Arrays.sort(numbers1);

        System.out.println(Arrays.toString(numbers1));

        System.out.println("        TASK 4        ");
        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania" };
        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);

        System.out.println(Arrays.toString(countries));


        System.out.println("        TASK 5        ");

        String[] dogNames = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky" };
        boolean hasPluto = false;
        System.out.println(Arrays.toString(dogNames));

        int[] num11 = new int[0];
        int[] num12 = new int[0];
        for (String dogName : dogNames) {
            if (dogNames.equals("Pluto")) {
                hasPluto = true;
                break;
            }
            System.out.println(hasPluto);

            System.out.println("        TASK 6        ");

            String[] catNames = {"Garfield", "Tom", "Syslvester", "Azrael" };
            System.out.println(Arrays.toString(catNames));
            if (Arrays.toString(catNames).contains("Garfield") && Arrays.toString(catNames).contains("Felix"))
                System.out.println("True");
            else System.out.println("false");

            System.out.println("        TASK 7        ");

            double[] doubNums = {10.5, 20.75, 70, 80, 15.75};
            System.out.println(Arrays.toString(doubNums));
            for (int i = 0; i < doubNums.length; i++) {
                System.out.println(doubNums[i]);
            }

            System.out.println("        TASK 8        ");
            char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', 'e', '@', '4'};
            System.out.println(Arrays.toString(characters));
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            int count5 = 0;

            for (int i = 0; i < characters.length; i++) {
                if (Character.isLetter(characters[i])) count1++;
            }
            System.out.println("Letters = " + count1);


            for (int i = 0; i < characters.length; i++) {
                if (Character.isLowerCase(characters[i])) count2++;
            }
            System.out.println("Lower case letters = " + count2);

            for (int i = 0; i < characters.length; i++) {
                if (Character.isUpperCase(characters[i])) count3++;
            }
            System.out.println("Upper case letters = " + count3);

            for (int i = 0; i < characters.length; i++) {
                if (Character.isDigit(characters[i])) count4++;
            }
            System.out.println("Digits = " + count4);

            for (int i = 0; i < characters.length; i++) {

            }
            System.out.println("Special characters = " + count5);

            System.out.println("        TASK 9        ");

            String[] objects = {"Pen", "notebook", "Book", "bag", "pencil", "Ruler" };

            System.out.println(Arrays.toString(objects));
            int upperCase = 0;
            int lowerCase = 0;
            int bOrP = 0;
            int bookOrPen = 0;

            System.out.println(Arrays.toString(objects));

            for (String object: objects){
                if (Character.isUpperCase(object.charAt(0))) upperCase++;
                if (Character.isLowerCase(object.charAt(0))) lowerCase++;
                if (object.toLowerCase().charAt(0) == 'p' || object.toLowerCase().charAt(0) == 'b') bOrP++;
                if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) bookOrPen++;
            }
            System.out.println("Elements stars with uppercase = " + upperCase +
                    "\nElements stars with lowercase = " + lowerCase +
                    "\nElements stars with B or P = " + bOrP +
                    "\nElements having \"book\" or \"pen\" = " + bookOrPen);

            System.out.println("        TASK 10        ");

            int[] nums = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

            System.out.println(Arrays.toString(nums));

            int elements = 0;
            int elementsM10 = 0;
            int elementsL10 = 0;
            int elementsAre10 = 0;

            for (int element : nums) {
                if (element > 10) elementsM10++;
            }
            System.out.println("Elements that are more than 10 = " + elementsM10++);

            for (int element : nums) {
                if (element < 10) elementsL10++;
            }
            System.out.println("Elements that are less than 10 = " + elementsL10++);

            for (int element : nums) {
                if (element == 10) elementsAre10++;
            }
            System.out.println("Elements that are 10 = " + elementsAre10++);

            System.out.println("        TASK 11        ");
            num11 = new int[]{5, 8, 13, 1, 2};
            num12 = new int[]{9, 3, 67, 1, 0};
        } ;

        System.out.println("1st array is = " + Arrays.toString(num11));
        System.out.println(Arrays.toString(num12));

        int[] maxNumbers = new int[5];

        maxNumbers[0] = Math.max(num11[0], num12[0]);
        maxNumbers[1] = Math.max(num11[1], num12[1]);
        maxNumbers[2] = Math.max(num11[2], num12[2]);
        maxNumbers[3] = Math.max(num11[3], num12[3]);
        maxNumbers[4] = Math.max(num11[4], num12[4]);

        System.out.println(Arrays.toString(maxNumbers));
    }
        }

