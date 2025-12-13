package dsa.arrays;

public class ArraySign {
    //    https://leetcode.com/problems/sign-of-the-product-of-an-array
    static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4, 3, 2, 1};
        System.out.println(arraySign(arr));
    }

    public static int arraySign(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while (i <= j) {
            if (nums[i] < 0) count++;
            if (nums[j] < 0 && j != i) count++;
            if (nums[i] == 0 || nums[j] == 0) return 0;
            i++;
            j--;
        }
        return count % 2 == 0 ? 1 : -1;
    }
}
