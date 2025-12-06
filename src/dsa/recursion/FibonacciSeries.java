package dsa.recursion;

public class FibonacciSeries {
    static void main(String[] args) {
        int num = 4;
        System.out.println(fibo(num));
    }

    private static int fibo(int i) {
        if (i < 2) return i;
        return fibo(i - 1) + fibo(i - 2);
    }
}
