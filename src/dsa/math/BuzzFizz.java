package dsa.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuzzFizz {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            list.add(i % 3 == 0 && i % 5 == 0 ? "FizzBuzz"
                    : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i));
        }
        return list;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n = sc.nextInt();
        System.out.println(fizzBuzz(n));
    }
}
