package dsa.arrays;

public class LargestLuckyInteger {

    public static int c(int[] arr) {
        int[] freq = new int[501];
        int max = -1;

        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (i == freq[i]) {
                max = Math.max(max, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(c(new int[]{2, 2, 3, 4}));
        System.out.println(c(new int[]{1, 2, 2, 3, 3, 3}));
    }
}

