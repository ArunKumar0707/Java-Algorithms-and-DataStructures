package dsa.math;

public class CountBalls {

    public static int countBalls(int lowLimit, int highLimit) {
        int[] balls = new int[46];
        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = sum(i);
            balls[sum]++;
            max = Math.max(max, balls[sum]);
        }
        return max;
    }

    private static int sum(int i) {
        int sum = 0;
        while (i != 0) {
            int rem = i % 10;
            sum += rem;
            i /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countBalls(1, 10));
        System.out.println(countBalls(5, 15));
    }
}
