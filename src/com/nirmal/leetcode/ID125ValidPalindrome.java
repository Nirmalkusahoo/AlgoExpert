package com.nirmal.leetcode;

public class ID125ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        char cleft, cRight;
        s = s.toLowerCase();
        while (left <= right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
