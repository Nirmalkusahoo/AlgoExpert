package com.nirmal.leetcode;


import java.util.Stack;

public class ID32LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }

    // Solution 2:
   /* public int longestValidParentheses(String s) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> indexStack = new Stack<>();
        int maxLength = 0;
        indexStack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                charStack.push(c);
                indexStack.push(i);
            } else {
                if (!charStack.isEmpty() && charStack.peek() == '(') {
                    charStack.pop();
                    indexStack.pop();
                    maxLength = Math.max(maxLength, i - indexStack.peek());
                } else {
                    indexStack.push(i);
                }
            }
        }
        return maxLength;
    }*/
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(())"));
    }
}
