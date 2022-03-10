package com.nirmal.leetcode;

public class ID186ReverseWordsInAStringII {
    public void reverseWords(char[] s) {
        s = reverse(s, 0, s.length - 1);

        int starIdx = 0;
        while (starIdx < s.length) {
            int endIdx = starIdx;
            while (endIdx<s.length && s[endIdx] != ' ') {
                endIdx++;
            }
            reverse(s, starIdx, endIdx - 1);
            starIdx = endIdx + 1;
        }
    }

    public static char[] reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
}
