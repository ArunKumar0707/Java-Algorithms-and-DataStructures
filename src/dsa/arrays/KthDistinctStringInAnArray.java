package dsa.arrays;

import java.util.Map;
import java.util.LinkedHashMap;

public class KthDistinctStringInAnArray {

    public static String kthDistinct(String[] arr, int k) {
        Map<String, Boolean> m = new LinkedHashMap<>();   // insertion order preserved
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!m.containsKey(arr[i])) {
                m.put(arr[i], true);
            } else {
                m.put(arr[i], false);
            }
        }
        for (Map.Entry<String, Boolean> entry : m.entrySet()) {
            if (entry.getValue() == true) j++;
            if (j == k) return entry.getKey();
        }
        return "";
    }

    public static void main(String[] args) {
        String[] arr1 = {"d", "b", "c", "b", "c", "a"};
        System.out.println(kthDistinct(arr1, 2));

        String[] arr2 = {"aaa", "aa", "a"};
        System.out.println(kthDistinct(arr2, 1));
    }
}

