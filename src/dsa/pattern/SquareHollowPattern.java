package dsa.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareHollowPattern {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value :");
            int n = sc.nextInt();
            System.out.println();
            printSquareHollow(n);
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Value !");
        }
    }

    private static void printSquareHollow(int n) {
        int i = 0;
        int j;
        while (i <= n) {
            j = 0;
            while (j < n) {
                if (i == 0 || j == 0 || i == n || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
