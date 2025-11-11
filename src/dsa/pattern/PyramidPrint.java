package dsa.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PyramidPrint {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value :");
            int n = sc.nextInt();
            System.out.println();
            printRightHalfPyramid(n);
            System.out.println();
            printReverseRightHalfPyramid(n);
            printLeftHalfPyramid(n);
            System.out.println();
            printReverseLeftHalfPyramid(n);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid number");
        }
    }

    private static void printReverseLeftHalfPyramid(int n) {
        int i = n;
        int j;
        int space;
        while (i > 0) {
            j = 0;
            space = 0;
            while (space < n - i) {
                System.out.print(" ");
                space++;
            }
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    private static void printLeftHalfPyramid(int n) {
        int i = 0;
        int j;
        int space;
        while (i <= n) {
            j = 0;
            space = n - i;
            while (j < n) {
                if (space > 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
                space--;
            }
            System.out.println();
            i++;
        }
    }

    private static void printReverseRightHalfPyramid(int n) {
        int i = 0;
        int j;
        while (i < n) {
            j = n - i;
            while (j > 0) {
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    private static void printRightHalfPyramid(int n) {
        int i = 0;
        int j;
        while (i < n) {
            j = 0;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
