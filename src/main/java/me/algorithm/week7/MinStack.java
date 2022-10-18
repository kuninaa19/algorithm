package me.algorithm.week7;

import java.util.Stack;

public class MinStack {
    private final Stack<Integer> stack;
    private final Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        if (val <= getMin()) {
            min.push(val);
        }

        stack.push(val);
    }

    public int top() {
        return stack.peek();
    }

    public void pop() {
        Integer pop = stack.pop();
        if (pop == getMin()) {
            min.pop();
        }
    }

    public int getMin() {
        if (min.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return min.peek();
    }
}
