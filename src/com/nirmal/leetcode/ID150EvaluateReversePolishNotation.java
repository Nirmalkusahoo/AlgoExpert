package com.nirmal.leetcode;


import java.util.Stack;

public class ID150EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            if ("+*/-".contains(str)) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                int value = evaluate(num1, num2, str);
                stack.push(value);
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }

    public static int evaluate(int num1, int num2, String str) {
        if (str.equals("+")) {
            return num2 + num1;
        } else if (str.equals("-")) {
            return num2 - num1;
        } else if (str.equals("*")) {
            return num2 * num1;
        } else {
            return num2 / num1;
        }
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));

        System.out.println("Nirmal".contains("Nir"));
    }

}
