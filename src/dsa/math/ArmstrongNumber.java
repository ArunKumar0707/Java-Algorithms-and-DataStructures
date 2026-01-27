package dsa.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumber {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number :  ");
            int n = sc.nextInt();
            System.out.println(isArmstrongNumber(n));
        } catch (InputMismatchException e) {
            System.out.println("Enter valid number");
        }

    }

    private static boolean isArmstrongNumber(int n) {
        int sum = 0;
        int num = n;
        int length = length(n);
        while (n > 0) {
            int rem = n % 10;
            sum = sum + pow(rem, length);
            n = n / 10;
        }
        return num == sum;
    }

    private static int length(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    private static int pow(int num, int length) {
        int result = 1;
        while (length > 0) {
            result = result * num;
            length--;
        }
        return result;
    }
}
