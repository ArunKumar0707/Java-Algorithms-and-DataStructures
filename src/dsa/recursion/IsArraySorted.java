package dsa.recursion;

import java.util.Arrays;

public class IsArraySorted {
    static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int arr2[] = {1, 2, 3, 9, 5, 6, 7, 8};
        System.out.println(isSorted(arr1, 0));
        System.out.println(isSorted(arr2, 0));
    }

    private static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) return true;
        if (arr[i] > arr[i + 1]) return false;
        return isSorted(arr, i + 1);
    }
}