package dsa.arrays;

public class ConstructTransformedArray {

    public static int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[((i + nums[i]) % n + n) % n];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, -2, 1, 1};
        int[] result1 = constructTransformedArray(nums1);
        printArray(result1);

        int[] nums2 = {-1, -1, -1};
        int[] result2 = constructTransformedArray(nums2);
        printArray(result2);
    }

    private static void printArray(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
