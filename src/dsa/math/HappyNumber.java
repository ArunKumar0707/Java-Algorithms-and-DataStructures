package dsa.math;

public class HappyNumber {

    public static boolean isHappy(int n) {
        if (n == 1 || n == 7) return true;
        if (n < 10) return false;

        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return isHappy(sum);
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19)); // true
        System.out.println(isHappy(2));  // false
    }
}

