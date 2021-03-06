package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ID22GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTrack(list, "", 0, 0, n);
        return list;
    }

    public static void backTrack(List<String> list, String str, int open, int close, int max) {
        if (open == max && close == max) {
            list.add(str);
            return;
        }
        if (open < max) {
            backTrack(list, str + "(", open + 1, close, max);
        }
        if (close < open) {
            backTrack(list, str + ")", open, close + 1, max);
        }
    }


}
