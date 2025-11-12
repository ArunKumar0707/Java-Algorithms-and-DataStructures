package dsa.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberTriangle {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value :");
            int n = sc.nextInt();
            System.out.println();
            printZeroOneTriangle(n);
            System.out.println();
            printPalindromeTriangle(n);
        } catch (InputMismatchException e){
            System.out.println("Enter Valid number !");
        }
    }

    private static void printPalindromeTriangle(int n) {
        int i = 1;
        int j;
        int space;
        int k;
        while (i <= n) {
            space = n - i;
            j = n - space;
            while (space > 0) {
                System.out.print("  ");
                space--;
            }
            System.out.print(" ");
            while (j > 0) {
                System.out.print(j + " ");
                j--;
            }
            j = 2;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    private static void printZeroOneTriangle(int n) {
        int i = 0;
        int j;
        while (i < n) {
            j = 0;
            while (j <= i) {
                System.out.print((i % 2 == 0 ? (j % 2 == 0 ? 1 : 0) : (j % 2 == 0 ? 0 : 1) ) + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
