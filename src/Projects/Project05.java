package Projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {
        int[] arrayT1 = {10, 7, 7, 10, -3, 10, -3};
        int[] arrayT2 = {10, 7, 7, 10, -3, 10, -3};
        int[] arrayT3 = {10, 5, 6, 7, 8, 5, 15, 15};
        int[] arrayT4 = {10, 5, 6, 7, 8, 5, 15, 15};
        String[] arrayT5 = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        String[] arrayT6 = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findGreatestAndSmallestWithSort(arrayT1);
        findGreatestAndSmallest(arrayT2);
        findSecondGreatestAndSmallestWithSort(arrayT3);
        findSecondGreatestAndSmallest(arrayT4);
        findDuplicatedElementsInAnArray(arrayT5);
        findMostRepeatedElementInAnArray(arrayT6);
    }

    public static void findGreatestAndSmallestWithSort(int[] array) {
        Arrays.sort(array);
        System.out.println("TASK 1 With sort");
        System.out.println("Smallest = " + array[0]);
        System.out.println("Greatest = " + array[array.length - 1]);
    }

    public static void findGreatestAndSmallest(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : array) {
            if (num > max) {
                max = num;
            } else min = num;
        }
        System.out.println("TASK 2 Without sort");
        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
    }

    public static int findMax(int[] array){
        int max = Integer.MIN_VALUE;

        for(int number : array){
            if(number > max) max = number;
        }
        return max;
    }
    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for(int number : array){
            if(number < min) min = number;
        }
        return min;
    }
    public static void findSecondGreatestAndSmallestWithSort(int[] array){

        Arrays.sort(array);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int number : array){
            if(number > max && number != findMax(array)){
                max = number;
            }
            else if(number < min && number != findMin(array)){
                min = number;
            }
        }

        System.out.println("Task 3 with sort");
        System.out.println("Second smallest = " + min);
        System.out.println("Second Greatest = " + max);
    }
    public static void findSecondGreatestAndSmallest(int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int number : array){
            if(number > max && number != findMax(array)){
                max = number;
            }
            else if(number < min && number != findMin(array)){
                min = number;
            }
        }
        System.out.println("Task 4 without sort");

        System.out.println("Second smallest = " + min);
        System.out.println("Second Greatest  = " + max);
    }
    public static void findDuplicatedElementsInAnArray(String[] array){


        System.out.println("----------TASK FIVE----------");
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i].equals(array[j])){
                    System.out.println(array[j]);
                }
            }
        }
    }
    public static void findMostRepeatedElementInAnArray(String[] array){
        System.out.println("----------TASK SIX----------");
        String result = "";
        int count = 0, finalWord = 0;
        String first = array[0];

        for(int i = 1; i < array.length; i++){
            if(first.equals(array[i])){
                count++;
            }
            else{
                if(count > finalWord){
                    finalWord = count;
                    result = first;
                }
                first = array[i];
                count = 1;
            }
        }
        System.out.println("Most repeated element = " + result);
    }

}