package dsa.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ButterflyPattern {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value :");
            int n = sc.nextInt();
            System.out.println();
            printButterfly(n);
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid number !");
        }
    }

    private static void printButterfly(int n) {
        int size = 2 * n - 1;
        int i = 1, j;
        while (i <= size) {
            int k = (i <= n) ? i : 2 * n - i;
            j = 1;
            while (j <= size) {
                boolean parityMatch = (j % 2) == (k % 2);
                boolean diff = Math.abs(j - n) >= (n - k);
                System.out.print(parityMatch && diff ? '*' : ' ');
                if (j < size) System.out.print("  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
