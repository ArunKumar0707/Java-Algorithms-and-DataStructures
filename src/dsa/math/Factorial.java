package dsa.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    static void main() {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number : ");
            int n = sc.nextInt();
            System.out.println(n+"! = "+factorial(n));
        } catch (InputMismatchException e){
            System.out.println("Enter Valid Number");
        }
    }

    private static int factorial(int n) {
        int fact = 1;
        while (n>0){
            fact *= n;
            n--;
        }
        return fact;
    }
}
