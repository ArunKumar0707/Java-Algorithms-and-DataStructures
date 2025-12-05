package dsa.recursion;

import java.util.Arrays;

public class BinarySearchUsingRecursion {
    static void main(String[] args) {
        int arr[] = {1, 22, 22, 44, 55, 66, 77, 88, 99};
        int target = 77;
        int start = 0;
        int end = arr.length - 1;
        System.out.println("index : " + search(arr, start, end, target));
    }

    private static int search(int[] arr, int start, int end, int target) {
        if (start > end) return -1;
        int mid = start + end >>> 1;
        if (target == arr[mid]) return mid;
        if (target > arr[mid]) {
            return search(arr, mid + 1, end, target);
        } else {
            return search(arr, start, mid - 1, target);
        }
    }
}
