package dsa.arrays;

import java.util.Arrays;

public class LeftRightDifference {
    //    https://leetcode.com/problems/left-and-right-sum-differences/
    static void main(String[] args) {
        System.out.println(Arrays.toString(
                leftRightDifference(new int[]{10, 4, 8, 3})));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] arr = new int[nums.length];
        int n = nums.length;
        int sum = 0;
        int sum2 = 0;
        int lSum = 0;
        int rSum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            rSum = sum - nums[i] - sum2;
            lSum = sum2;
            arr[i] = Math.abs(lSum - rSum);
            sum2 += nums[i];
        }
        return arr;
    }
}
