package dsa.recursion;

import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class ReverseOfANumber {
    static void main(String[] args) {
        System.out.println(rev(1234567890));
    }

    private static int rev(int num) {
        int digits = (int) log10(num);
        return helper(num, digits);
    }

    private static int helper(int num, int digits) {
        if (num == 0) {
            return 0;
        }
        int rem = num % 10;
        return (rem * (int) (pow(10, digits))) + helper(num / 10, digits - 1);
    }
}
