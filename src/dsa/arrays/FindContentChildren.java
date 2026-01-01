package dsa.arrays;

import java.util.Arrays;

public class FindContentChildren {

    public static int findContentChildren(int[] g, int[] s) {
        int cookies = 0;
        Arrays.sort(s);
        Arrays.sort(g);
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                ++cookies;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return cookies;
    }

    public static void main(String[] args) {
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println(findContentChildren(g1, s1));

        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println(findContentChildren(g2, s2));
    }
}
