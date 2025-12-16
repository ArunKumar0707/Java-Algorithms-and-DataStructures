package dsa.arrays;

import java.util.Arrays;

public class GetSneakyNumbers {
    // https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/
    static void main(String[] args) {
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{0, 1, 1, 0})));
    }

    public static int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        i = 0;
        int j = 0;
        while (i < nums.length && j < arr.length) {
            if (i != nums[i]) {
                arr[j] = nums[i];
                j++;
            }
            i++;
        }
        return arr;
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
