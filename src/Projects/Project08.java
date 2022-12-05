package Projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project08 {

    public static void main(String[] args) {
        int[] nums = {4,2,5,9,6,8,7,1};
        String s = "Hello WorldHe Wr";

        System.out.println(findMissingNumber(nums));
    }



    public static int findClosestDistance (int [] arr){

        if (arr.length < 2)
            return -1;

        int closestDiff = Integer.MAX_VALUE;
        if (arr.length < 2) return -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) < closestDiff) closestDiff = Math.abs(arr[i] - arr[j]);
            }
        }
        return closestDiff;
    }

    public static int findSingleNumber(int[] nums) {
        ArrayList nums1 = new ArrayList<>();
        for (int num : nums) {
            nums1.add(num);
        }
        for (int i = 0; i < nums1.size(); i++) {
            Object num = nums[i];
            nums1.remove(i);
            if (!nums1.contains(num)) {
                return nums[i];
            } else {
                nums1.add(i, num);
            }
        }
        return -1;
    }

    public static char findFirstUniqueCharacter(String words) {
        ArrayList<Character> words1 = new ArrayList<>();
        for (int i = 0; i < words.length(); i++) {
            words1.add(words.charAt(i));
        }
        for (int i = 0; i < words1.size(); i++) {
            char letter = words1.get(i);
            words1.remove(i);
            if (!words1.contains(letter)) {
                return letter;
            } else {
                words1.add(i, letter);
            }
        }
        return ' ';
    }

    public static int findMissingNumber(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] + 1 != nums[i + 1]) return nums[i] + 1;

            // 2, 3, 5, 6



        } return -1;
    }

}
