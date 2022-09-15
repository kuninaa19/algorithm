package me.algorithm.week5;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        String openBrackets = "([{";
        String closedBrackets = ")]}";

        Stack<Character> charStack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int openCharIdx = openBrackets.indexOf(c);

            if (openCharIdx != -1) {
                charStack.push(closedBrackets.charAt(openCharIdx));
                continue;
            }
            if (charStack.isEmpty() || c != (char) charStack.pop()) {
                return false;
            }
        }

        return charStack.isEmpty();
    }
}
