package dsa.arrays;

import java.util.Map;
import java.util.HashMap;

public class SingleNumberIII {

    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] arr = new int[2];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) arr[i++] = entry.getKey();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1, 3, 2, 5};
        print(singleNumber(nums1));

        int[] nums2 = {4, 1, 2, 1, 2, 3};
        print(singleNumber(nums2));
    }

    private static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

