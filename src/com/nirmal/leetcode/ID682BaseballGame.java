package com.nirmal.leetcode;

import java.util.Stack;

public class ID682BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String s : ops) {
            if (s.equals("+")) {
                int top = stack.pop();
                int neTop = stack.peek();
                stack.push(top);
                stack.push(top + neTop);
            } else if (s.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (s.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        int sum = 0;
        for (Integer num : stack) {
            sum = sum + num;
        }
        return sum;
    }
}
