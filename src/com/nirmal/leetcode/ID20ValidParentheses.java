package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ID20ValidParentheses {
    public boolean isValid(String s) {
        String openingBrackets = "({[";
        String closingBrackets = ")}]";
        List<Character> stack = new ArrayList<>();

        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (openingBrackets.indexOf(bracket) != -1) {
                stack.add(bracket);
            } else if (closingBrackets.indexOf(bracket) != -1) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.get(stack.size() - 1) != bracketMap.get(bracket)) {
                    return false;
                } else {
                    stack.remove(stack.size() - 1);
                }
            }
        }
        return stack.size() == 0;
    }
}
