package dsa.math;

public class AddDigits {

    public static int addDigits(int num) {
        if (num <= 9) return num;
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38)); // 2
        System.out.println(addDigits(0));  // 0
    }
}

