package dsa.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Year :");
            int n = sc.nextInt();
            System.out.println(isLeapYear(n));
        } catch (InputMismatchException e) {
            System.out.println("Enter year in number format");;
        }
    }

    private static boolean isLeapYear(int n) {
        return n % 400 == 0 || n % 4 == 0 && n % 100 != 0;

    }
}
