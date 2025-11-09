package dsa.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number : ");
            int n = sc.nextInt();
            if (n < 0) throw new IllegalArgumentException();
            System.out.println(n + "! = " + factorial(n));
            //using Recursion
            System.out.println("Using Recursion : " + n + "! = " + factorialRecursion(n));
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Enter Non Negative Number");
        }
    }

    private static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }

    private static int factorialRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }
}
