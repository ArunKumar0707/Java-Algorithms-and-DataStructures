package dsa.strings;

public class FirstRepeatedCharacter {

    public static char repeatedCharacter(String s) {
        int[] ch = new int[27];
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            ch[index]++;
            if (ch[index] > 1) return c;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));
        System.out.println(repeatedCharacter("abcdd"));
    }
}
