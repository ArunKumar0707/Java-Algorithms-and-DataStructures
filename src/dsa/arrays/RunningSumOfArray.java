package dsa.arrays;

public class RunningSumOfArray {

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        print(runningSum(nums1));

        int[] nums2 = {1, 1, 1, 1, 1};
        print(runningSum(nums2));
    }

    private static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

