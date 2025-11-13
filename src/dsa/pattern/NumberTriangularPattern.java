package dsa.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberTriangularPattern {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value :");
            int n = sc.nextInt();
            System.out.println();
            printNumberTriangular(n);
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Value !");
        }
    }

    private static void printNumberTriangular(int n) {
        int i = 1;
        int j;
        while (i <= n) {
            j = n;
            while (j > i) {
                System.out.print(" ");
                j--;
            }
            j = 0;
            while (j < i) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
