package com.nirmal.leetcode;

public class ID792NumberofMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        for (String word : words) {
            if (isFound(word, s)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isFound(String word, String match) {
        int idx = 0;
        for (char c : word.toCharArray()) {

            int index = match.indexOf(c, idx);
            if (index == -1) {
                return false;
            }
            idx = index + 1;
        }
        return true;
    }
}
