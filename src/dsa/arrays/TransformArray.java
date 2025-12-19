package dsa.arrays;

import java.util.Arrays;

public class TransformArray {
    // https://leetcode.com/problems/transform-array-by-parity/
    public static int[] transformArray(int[] nums) {
        int[] output = new int[nums.length];
        int count = 0;
        for (int num : nums) {
            if (num % 2 != 0) count++;
        }
        Arrays.fill(output, output.length - count, output.length, 1);
        return output;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 1};
        System.out.println(Arrays.toString(transformArray(nums1)));

        int[] nums2 = {1, 5, 7};
        System.out.println(Arrays.toString(transformArray(nums2)));
    }
}

