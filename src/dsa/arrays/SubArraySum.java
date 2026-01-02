package dsa.arrays;

public class SubArraySum {

    public static int subarraySum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int start = Math.max(0, i - nums[i]); start <= i; start++) {
                sum += nums[start];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 1, 2};
        System.out.println(subarraySum(nums1));

        int[] nums2 = {1, 1, 1};
        System.out.println(subarraySum(nums2));
    }
}

