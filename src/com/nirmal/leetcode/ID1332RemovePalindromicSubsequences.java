package com.nirmal.leetcode;

public class ID1332RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (isPalindrome(s)) {
            return 1;
        } else {
            return 2;
        }
    }

    public static boolean isPalindrome(String str) {
        int L = 0;
        int R = str.length() - 1;

        while (L < R) {
            if (str.charAt(L) == str.charAt(R)) {
                L++;
                R--;
            } else {
                return false;
            }
        }
        return true;
    }
}
