package com.nirmal.leetcode;

public class ID5LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int[] longest = {0, 1};
        for (int i = 1; i < s.length(); i++) {
            int[] odd = findLongest(s, i - 1, i + 1);
            int[] even = findLongest(s, i - 1, i);
            int[] currentLongest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
            longest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
        }
        return s.substring(longest[0], longest[1]);
    }

    public static int[] findLongest(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return new int[]{left + 1, right};
    }
}
