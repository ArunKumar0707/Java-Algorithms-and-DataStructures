package dsa.arrays;

public class MonotonicArray {

    public static boolean isMonotonic(int[] nums) {
        boolean isAsc = (nums[0] <= nums[nums.length - 1]);
        if (isAsc) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) return false;
            }
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3};
        System.out.println(isMonotonic(nums1));

        int[] nums2 = {6, 5, 4, 4};
        System.out.println(isMonotonic(nums2));
    }
}

