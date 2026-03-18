package dsa.strings;

public class ReverseVowelsOfAString {

    public static String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        String vowels = "aeiouAEIOU";

        int i = 0, j = n - 1;

        while (i < j) {
            if (vowels.indexOf(arr[i]) == -1) {
                i++;
                continue;
            }
            if (vowels.indexOf(arr[j]) == -1) {
                j--;
                continue;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));   // holle
        System.out.println(reverseVowels("leetcode")); // leotcede
    }
}
