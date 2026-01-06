package dsa.strings;

public class RobotReturnToOrigin {

    public static boolean judgeCircle(String moves) {
        int[] map = new int[26];
        for (char c : moves.toCharArray()) {
            map[c - 'A']++;
        }
        return map['U' - 'A'] == map['D' - 'A'] && map['L' - 'A'] == map['R' - 'A'];
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }
}
