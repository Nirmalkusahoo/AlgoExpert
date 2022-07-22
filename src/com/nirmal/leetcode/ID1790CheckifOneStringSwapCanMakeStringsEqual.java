package com.nirmal.leetcode;

public class ID1790CheckifOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        int firstIdx = -1;
        int secondIdx = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (firstIdx == -1) {
                    firstIdx = i;
                } else if (secondIdx == -1) {
                    secondIdx = i;
                } else {
                    return false;
                }
            }
        }
        if (firstIdx == -1 && secondIdx == -1) {
            return true;
        }
        if (firstIdx == -1 || secondIdx == -1) {
            return false;
        }

        return s1.charAt(firstIdx) == s2.charAt(secondIdx) && s1.charAt(secondIdx) == s2.charAt(firstIdx);
    }
}
