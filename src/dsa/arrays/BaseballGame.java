package dsa.arrays;

import java.util.Stack;

public class BaseballGame {

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            if (s.equals("+")) {
                int top = stack.pop();
                int result = stack.peek() + top;
                stack.push(top);
                stack.push(result);
            } else if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        for (int e : stack) {
            score += e;
        }
        return score;
    }

    public static void main(String[] args) {
        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(ops1));

        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(ops2));
    }
}

