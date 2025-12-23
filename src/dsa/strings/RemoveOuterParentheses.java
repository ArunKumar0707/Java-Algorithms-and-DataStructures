package dsa.strings;

public class RemoveOuterParentheses {
    // https://leetcode.com/problems/remove-outermost-parentheses/
    // Topic : string , stack

    public static String removeOuterParentheses(String s) {
        int balance = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ')') balance--;
            if (balance != 0) sb.append(ch);
            if (ch == '(') balance++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }
}

