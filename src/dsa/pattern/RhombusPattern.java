package dsa.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RhombusPattern {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value :");
            int n = sc.nextInt();
            System.out.println();
            printRhombus(n);
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid number !");
        }
    }

    private static void printRhombus(int n) {
        int i = 0;
        int j;
        int space;
        while (i <= n) {
            j = 0;
            space = 0;
            while (space <= i) {
                System.out.print(" ");
                space++;
            }
            while (j < n) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
