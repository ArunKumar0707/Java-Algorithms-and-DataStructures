package dsa.strings;

public class MaxFreqSum {
    public static int maxFreqSum(String s) {
        String vowels = "aeiou";
        byte[] vch = new byte[150];
        byte[] cch = new byte[150];
        int vc = 0;
        int cc = 0;
        for (int i = 0; i < s.length(); i++) {
            byte value = (byte) s.charAt(i);
            if (vowels.indexOf(s.charAt(i)) != -1) {
                vch[value]++;
            } else {
                cch[value]++;
            }
        }
        for (int i = 0; i < vch.length; i++) {
            if (vc < vch[i]) vc = vch[i];
            if (cc < cch[i]) cc = cch[i];
        }
        return vc + cc;
    }

    public static void main(String[] args) {

        // Test case 1
        String s1 = "aeiaeia";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + maxFreqSum(s1));

        // Test case 2
        String s2 = "successes";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + maxFreqSum(s2));
    }
}
