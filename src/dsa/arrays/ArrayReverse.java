package dsa.arrays;

import java.util.Arrays;

public class ArrayReverse {
    static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        System.out.println("The reversed Array for 1st test case is : ");
        Arrays.stream(reverseArray(arr)).forEach(i -> System.out.printf(" %s ", i));
        System.out.println();
        arr = new int[]{4, 5, 2};
        System.out.println("The reversed Array for 2nd test case is : ");
        Arrays.stream(reverseArray(arr)).forEach(i -> System.out.printf(" %s ", i));
        System.out.println();
        arr = new int[]{1};
        System.out.println("The reversed Array for 3rd test case is : ");
        Arrays.stream(reverseArray(arr)).forEach(i -> System.out.printf(" %s ", i));
        System.out.println();
        arr = new int[]{10, 23, 43, 32, 67};
        System.out.println("The reversed Array for 4th test case is : ");
        Arrays.stream(reverseArray(arr)).forEach(i -> System.out.printf(" %s ", i));
    }

    private static int[] reverseArray(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
    }
}
