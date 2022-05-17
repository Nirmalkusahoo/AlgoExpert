package com.nirmal.leetcode;

public class ID344ReverseString {
    public void reverseString(char[] s) {
        int L = 0;
        int R = s.length - 1;

        while (L < R) {
            char temp = s[L];
            s[L] = s[R];
            s[R] = temp;
            L++;
            R--;
        }
    }
}
