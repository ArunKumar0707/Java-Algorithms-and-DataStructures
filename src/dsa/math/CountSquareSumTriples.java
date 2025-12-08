package dsa.math;

public class CountSquareSumTriples {
    // https://leetcode.com/problems/count-square-sum-triples
    static void main(String[] args) {
        System.out.println(countTriples(5));
        System.out.println(countTriples(10));
    }

    public static int countTriples(int n) {
        int res = 0;
        for (int a = 1; a <= n; ++a) {
            for (int b = 1; b <= n; ++b) {
                int c = (int) Math.sqrt(a * a + b * b + 1.0);
                if (c <= n && c * c == a * a + b * b) {
                    ++res;
                }
            }
        }
        return res;
    }
}
