package dsa.strings;

public class FirstUniqueCharacterInAString  {

    public static int firstUniqChar(String s) {
        int n = s.length();
        int[] lookUp = new int[26];

        for (int i = 0; i < n; i++) {
            lookUp[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            if (lookUp[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));     // 0
        System.out.println(firstUniqChar("loveleetcode")); // 2
    }
}
