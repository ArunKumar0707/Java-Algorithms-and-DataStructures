package dsa.arrays;

import java.util.Arrays;

public class ArrayRotateCounterClockwise {
    public static void main(String[] args) {
        // 1st test case
        int[] arr1 = {1, 2, 3, 4, 5};
        int d1 = 2;
        rotate(arr1, d1);
        System.out.println("1st test case : ");
        Arrays.stream(arr1).forEach(s -> System.out.printf(" %s ", s));
        System.out.println();

        // 2nd test case
        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d2 = 3;
        rotate(arr2, d2);
        System.out.println("2nd test case : ");
        Arrays.stream(arr2).forEach(s -> System.out.printf(" %s ", s));
        System.out.println();

        // 3rd test case
        int[] arr3 = {7, 3, 9, 1};
        int d3 = 9;
        rotate(arr3, d3);
        System.out.println("3rd test case : ");
        Arrays.stream(arr3).forEach(s -> System.out.printf(" %s ", s));

    }

    public static void rotate(int[] arr, int d) {
        // when d == arr.length it same as the original array
        // so that means it becomes periodic so we dont need
        // to do all the iterations , hence we will do the remainder amount
        // of iterations .
        d = d % arr.length;
        for(int i = 0; i < d ; i++){
            int first_element = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first_element;
        }
    }
}
