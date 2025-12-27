package dsa.strings;

import java.util.Set;
import java.util.HashSet;

public class BuddyStrings {

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        Set<Character> set = new HashSet();
        if (s.equals(goal)) {
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            return set.size() < goal.length();
        }

        int i = 0;
        int j = s.length() - 1;
        while (i < j && s.charAt(i) == goal.charAt(i)) i++;
        while (j >= 0 && s.charAt(j) == goal.charAt(j)) j--;
        if (i < j) {
            char[] sArr = s.toCharArray();
            char temp = sArr[i];
            sArr[i] = sArr[j];
            sArr[j] = temp;
            s = new String(sArr);
        }
        return s.equals(goal);
    }

    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba"));
        System.out.println(buddyStrings("aa", "aa"));
        System.out.println(buddyStrings("aba", "aaa"));
    }
}

