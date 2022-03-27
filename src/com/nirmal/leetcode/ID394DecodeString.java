package com.nirmal.leetcode;

import java.util.Stack;

public class ID394DecodeString {
    public String decodeString(String s) {

        Stack<String> result = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        String res = "";

        int index = 0;
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                numStack.push(count);
            } else if (s.charAt(index) == '[') {
                result.push(res);
                res = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder sb = new StringBuilder(result.pop());
                int count = numStack.pop();
                for (int i = 0; i < count; i++) {
                    sb.append(res);
                }
                res = sb.toString();
                index++;
            } else {
                res = res+ String.valueOf(s.charAt(index));
                index++;
            }
        }

        return res;

    }
}
