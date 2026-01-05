package dsa.arrays;

public class MinimumOperations {

    public static int minimumOperations(int[] nums) {
        int count = 0;
        while (!checkZero(nums)) {
            reduce(nums, findMin(nums));
            count++;
        }
        return count;
    }

    private static boolean checkZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
    }

    private static int findMin(int[] arr) {
        int min = 101;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) min = Math.min(min, arr[i]);
        }
        return min;
    }

    private static void reduce(int[] arr, int e) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) arr[i] = arr[i] - e;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 5, 0, 3, 5};
        System.out.println(minimumOperations(nums1));

        int[] nums2 = {0, 0, 0};
        System.out.println(minimumOperations(nums2));
    }
}

