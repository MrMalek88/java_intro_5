package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework15 {

        public static void main(String[] args) {
            System.out.println("\n------------TASK-1------------\n");
            System.out.println(Arrays.toString(fibonacciSeries1(3)));
            System.out.println(Arrays.toString(fibonacciSeries1(11)));

            System.out.println("\n------------TASK-2------------\n");
            System.out.println(fibonacciSeries2(2));
            System.out.println(fibonacciSeries2(8));

            System.out.println("\n------------TASK-3------------\n");
            System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{})));
            System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));


            System.out.println("\n------------TASK-4------------\n");
            System.out.println(isPowerOf3(1));
            System.out.println(isPowerOf3(2));
            System.out.println(isPowerOf3(3));
            System.out.println(isPowerOf3(81));
            System.out.println(isPowerOf3(27));
            System.out.println(isPowerOf3(253));

            System.out.println("\n------------TASK-5------------\n");
            int[] arr5_2 = {1};
            System.out.println(firstDuplicate(arr5_2));
            int[] arr5_4 = {1, 3, 3, 4, 5, 1};
            System.out.println(firstDuplicate(arr5_4));

        }

        public static int[] fibonacciSeries1(int num){
            int[] arr = new int[num];
            arr[0] = 0;
            arr[1] = 1;

            int firstTerm =  0;
            int secondTerm = 1;

            for (int i = 2; i < num; i++) {
                int nextTerm = firstTerm + secondTerm;
                arr[i] = nextTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            return arr;
        }


        public static int fibonacciSeries2(int n){
            if(n == 0) return 0;
            if(n == 1) return 1;

            int firstNumber = 0;
            int secondNumber = 1;
            int nextNumber = 0;
            for (int i = 3; i <= n; i++) {
                nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
            return nextNumber;
        }



        public static int[] findUniques(int[] a, int[] b){
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> listA = new ArrayList<>();
            ArrayList<Integer> listB = new ArrayList<>();
            for (int element : a) {
                listA.add(element);
            }
            for (int element : b) {
                listB.add(element);
            }


            for (Integer value : listA) {
                if (!list.contains(value) && !listB.contains(value)) list.add(value);
            }
            for (Integer integer : listB) {
                if (!list.contains(integer) && !listA.contains(integer)) list.add(integer);
            }
            int[] uniques = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                uniques[i] = list.get(i);
            }
            return uniques;
        }


        public static boolean isPowerOf3(int number){//27
            int power = 3;
            while(power < number){
                power = power * 3;
            }
            return power == number;
        }


        public static int firstDuplicate(int[] arr){
            int duplicate = -1;
            int iOfDuplicate = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                for (int j =i+1; j < arr.length; j++) {
                    if(arr[i] == arr[j] && j < iOfDuplicate) {
                        duplicate = arr[i];
                        iOfDuplicate = j;
                    }
                }
            }
            return duplicate;
        }

    }
