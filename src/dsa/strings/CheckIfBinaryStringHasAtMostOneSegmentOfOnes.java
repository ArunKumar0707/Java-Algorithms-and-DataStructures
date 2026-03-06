package dsa.strings;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {

    public static boolean checkOnesSegment(String s) {
        boolean zeroSeen = false;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeroSeen = true;
            }
            if (zeroSeen && c == '1') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkOnesSegment("110"));     // true
        System.out.println(checkOnesSegment("1001"));    // false
    }
}