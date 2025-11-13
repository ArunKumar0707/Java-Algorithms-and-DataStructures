package dsa.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberIncreasingReversePyramid {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value :");
            int n = sc.nextInt();
            System.out.println();
            printNumberIncreasingReversePyramid(n);
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Value !");
        }
    }

    private static void printNumberIncreasingReversePyramid(int n) {
        int i = 1;
        int j;
        int k = n;
        while (i <= n) {
            j = 1;
            while (j <= k) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
            k--;
        }
    }
}
