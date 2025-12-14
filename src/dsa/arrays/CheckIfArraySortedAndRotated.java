package dsa.arrays;

public class CheckIfArraySortedAndRotated {
    // https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
    static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(check(arr));
    }

    public static boolean check(int[] nums) {
        int n = nums.length;
        while (n > 0) {
            if (isSorted(nums)) return true;
            rotate(nums);
            n--;
        }
        return false;
    }

    private static void rotate(int[] nums) {
        int last_ele = nums[nums.length - 1];
        int i = nums.length - 2;
        while (i >= 0) {
            nums[i + 1] = nums[i];
            i--;
        }
        nums[0] = last_ele;
    }

    private static boolean isSorted(int[] nums) {
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] > nums[i + 1]) return false;
            i++;
        }
        return true;
    }

}
