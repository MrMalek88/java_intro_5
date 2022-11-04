package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class extrapracme {

    public static void main (String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));

        System.out.println(nums);

        int dividedBy10 = 0;
        int evenGreaterThan15 = 0;
        int oddLessThan20 = 0;
        int LessThan15OrGreaterThan50 = 0;

        for (int num: nums) {
            if(num % 10 == 0)dividedBy10++;
            if (num > 15 && num % 2 == 0)evenGreaterThan15++;
            if (num < 15 && num % 2 == 1)oddLessThan20++;
            if(num < 15 && num > 50)LessThan15OrGreaterThan50++;

            }
        System.out.println("Elements that can be divided by 10 = " + dividedBy10);

        // 5, 10, 15, 25, 40, 65, 105

        int first = 5;
        int second = 10;
        int sum = first + second;
        int iter = 6;

        String x = "";

        for (int i = 5; i < iter; i++) {

            x += first + " ";
            sum = first + second;
            first = second;
            second = sum;
        }
            System.out.println(x);

        }



        }



