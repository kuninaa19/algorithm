package me.algorithm.week5;

import java.util.Stack;

/* Implement Queue using Stacks */
class MyQueue {
    protected Stack<Integer> stack1;
    protected Stack<Integer> stack2;

    public MyQueue() {
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.empty() && !stack1.empty()) {
            int stack1Size = stack1.size();

            for (int i = 0; i < stack1Size; i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.empty() && !stack1.empty()) {
            int stack1Size = stack1.size();
            for (int i = 0; i < stack1Size; i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.empty();
    }
}

/* 코드 리팩토링 */
class MyQueueRefactored extends MyQueue{
    public MyQueueRefactored() {
        super();
    }

    @Override
    public void push(int x) {
        super.push(x);
    }

    @Override
    public int pop() {
        if(!this.stack2.isEmpty()) return stack2.pop();
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    @Override
    public int peek() {
        if(!this.stack2.isEmpty()) return stack2.peek();
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    @Override
    public boolean empty() {
        return super.empty();
    }
}
