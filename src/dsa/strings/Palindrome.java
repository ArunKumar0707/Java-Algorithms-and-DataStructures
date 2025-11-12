package dsa.strings;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String :");
        String string = sc.nextLine();
        System.out.println("The Entered String is " + (isPalindrome(string) ? "Palindrome" : "Not Palindrome"));
    }

    private static boolean isPalindrome(String s) {
        // using 2 pointers to iterate
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            //converting uppercase to lowercase
            if (left >= 'A' && left <= 'Z')
                left = (char) (left + 32);
            if (right >= 'A' && right <= 'Z')
                right = (char) (right + 32);
            //skipping nonAlphanumeric chars
            if (!isAlphanumeric(left)) {
                i++;
            } else if (!isAlphanumeric(right)) {
                j--;
            }
            //checking left with right for eg in "Malayalam" :
            // _'a'_____'a'_ where left 'a'
            //is at ith pos and right 'a' is at jth pos if i and j
            //dont match we return false instead of checking others
            else {
                if (left != right) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    //checking alphanumeric char
    private static boolean isAlphanumeric(char ch) {
        return ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'));
    }
}
