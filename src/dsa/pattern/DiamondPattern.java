package dsa.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiamondPattern {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value :");
            int n = sc.nextInt();
            System.out.println();
            printDiamond(n);
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid number !");
        }
    }

    private static void printDiamond(int n) {
        int i = 0;
        int j;
        int space;
        while (i < n) {
            j = 0;
            space = n - i;
            while (space > 0) {
                System.out.print("  ");
                space--;
            }
            while (j <= i) {
                System.out.print("*   ");
                j++;
            }
            System.out.println();
            i++;
        }
        i = 1;
        while (i <= n - 1) {
            j = n - i;
            space = 0;
            while (space <= i) {
                System.out.print("  ");
                space++;
            }
            while (j > 0) {
                System.out.print("*   ");
                j--;
            }
            System.out.println();
            i++;
        }

    }

}
