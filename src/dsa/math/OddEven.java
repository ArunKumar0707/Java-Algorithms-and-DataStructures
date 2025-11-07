package dsa.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {
    static void main() {
        try{
            //checking the input by dividing with 2 to determine whether even or odd
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number between -2^31 to 2^31");
            int n = sc.nextInt();
            System.out.println(n % 2 == 0 ? "Even Number" : "Odd Number");
            //Alternate way
            System.out.println(isOdd(n));
        } catch (InputMismatchException e){
            System.out.println("Enter Valid Number");
        }
    }

    private static boolean isOdd(int n) {
        // The expression (n & 1) checks the least significant bit (LSB) of the number.
        // In binary, odd numbers always end with 1, and even numbers end with 0.
        // Example:
        // 5  -> binary: 101  -> 101 & 001 = 1  (odd)
        // 6  -> binary: 110  -> 110 & 001 = 0  (even)
        //
        // So if (n & 1) == 1 → number is odd, else even.
        return (n & 1) == 1;
    }
}
