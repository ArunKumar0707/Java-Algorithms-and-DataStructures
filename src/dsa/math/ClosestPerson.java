package dsa.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClosestPerson {
    private static int diffY;

    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter x :");
            int x = sc.nextInt();
            System.out.println("Enter y :");
            int y = sc.nextInt();
            System.out.println("Enter z :");
            int z = sc.nextInt();
            System.out.println("Output : "+valueOfPerson(x, y, z));
        }catch (InputMismatchException e){
            System.out.println("Enter valid number");
        }
    }

    private static int valueOfPerson(int x, int y, int z) {
        int diffX = Math.abs(z - x);
        int diffY = Math.abs(z - y);
        return (diffX == diffY) ?
                0 : diffX > diffY ? 2 : 1;
    }
}
