package dsa.strings;

public class ReverseString {

    public static void reverseString(char[] s) {
        int n = s.length;

        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] test1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(test1);
        System.out.println(test1);

        char[] test2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(test2);
        System.out.println(test2);
    }
}
