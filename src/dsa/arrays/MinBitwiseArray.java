package dsa.arrays;

import java.util.*;

public class MinBitwiseArray {

    public static int[] minBitwiseArray(List<Integer> nums) {
        int[] arr = new int[nums.size()];
        int j = 0;

        for (int num : nums) {
            arr[j] = -1;
            for (int i = 0; i < num; i++) {
                int res = i | (i + 1);
                if (res == num) {
                    arr[j] = i;
                    break;
                }
            }
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                minBitwiseArray(Arrays.asList(2, 3, 5))
        ));

        System.out.println(Arrays.toString(
                minBitwiseArray(Arrays.asList(1, 4))
        ));
    }
}

