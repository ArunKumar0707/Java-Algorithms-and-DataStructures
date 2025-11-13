package dsa.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberIncreasingPyramid {
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
        while (i <= n) {
            j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
