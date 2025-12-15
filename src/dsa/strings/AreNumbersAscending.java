package dsa.strings;

public class AreNumbersAscending {
    static void main(String[] args) {
        System.out.println(areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
    }

    public static boolean areNumbersAscending(String s) {
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.setLength(0);
            if (Character.isDigit(s.charAt(i))) {
                int j = i;
                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    sb.append(s.charAt(j) + "");
                    j++;
                    i++;
                }
                if (num < Integer.parseInt(sb.toString())) {
                    num = Integer.parseInt(sb.toString());
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
