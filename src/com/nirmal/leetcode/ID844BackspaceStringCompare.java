package com.nirmal.leetcode;

import java.util.Stack;

public class ID844BackspaceStringCompare {
    // Solution 1: East to solve O(M +N) space complexity
    public boolean backspaceCompare(String s, String t) {
        return compute(s).equals(compute(t));
    }

    public Stack<Character> compute(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        return stack;
    }

    // Solution 2: Bit logic involved but better space complexity with O(1)
   /* public boolean backspaceCompare(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        int i = s.length() - 1;
        int j = t.length() - 1;
        while (i >= 0 || j >= 0) {

            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    sPointer++;
                    i--;
                } else if (sPointer > 0) {
                    sPointer--;
                    i--;
                } else {
                    break;
                }
            }

            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    tPointer++;
                    j--;
                } else if (tPointer > 0) {
                    tPointer--;
                    j--;
                } else {
                    break;
                }
            }

            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }
            if ((i >= 0) != (j >= 0)) {
                return false;
            }

            i--;
            j--;
        }
        return true;
    }*/
}
