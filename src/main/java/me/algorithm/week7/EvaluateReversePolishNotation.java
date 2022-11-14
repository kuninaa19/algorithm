package me.algorithm.week7;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    private final Stack<Integer> stack = new Stack<>();

    public int evanRPN(String[] tokens) {
        for (String token : tokens) {
            if ("+-*/".contains(token)) {
                stack.push(calculator(token, stack.pop(), stack.pop()));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private Integer calculator(String operator, Integer last_attr, Integer first_attr) {
        switch (operator) {
            case "+":
                return first_attr + last_attr;
            case "-":
                return first_attr - last_attr;
            case "*":
                return first_attr * last_attr;
            case "/":
                return first_attr / last_attr;
        }

        return null;
    }
}
