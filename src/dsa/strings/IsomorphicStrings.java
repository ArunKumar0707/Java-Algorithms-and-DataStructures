package dsa.strings;

public class IsomorphicStrings {
    // topic : Hash Table , String
    // https://leetcode.com/problems/isomorphic-strings
    public static boolean isIsomorphic(String s, String t) {
        byte sUsed[] = new byte[255];
        boolean tUsed[] = new boolean[255];

        byte sBytes[] = s.getBytes();
        byte tBytes[] = t.getBytes();


        for (int i = 0; i < sBytes.length; i++) {
            byte sc = sBytes[i];
            byte tc = tBytes[i];
            //a , p
            if (sUsed[sc] == 0) {
                if (tUsed[tc]) {
                    return false;
                }
            } else if (sUsed[sc] != tc) {
                return false;
            }

            sUsed[sc] = tc;
            tUsed[tc] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("aapq", "aabc"));
        System.out.println(isIsomorphic("apa", "aab"));
    }
}

