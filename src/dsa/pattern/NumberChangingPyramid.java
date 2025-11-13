package dsa.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberChangingPyramid {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value :");
            int n = sc.nextInt();
            System.out.println();
            printNumberIncreasingPyramid(n);
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Value !");
        }
    }

    private static void printNumberIncreasingPyramid(int n) {
        int i = 1;
        int j;
        int k = 1;
        while (i <= n) {
            j = 1;
            while (j <= i) {
                System.out.print(k + " ");
                j++;
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
