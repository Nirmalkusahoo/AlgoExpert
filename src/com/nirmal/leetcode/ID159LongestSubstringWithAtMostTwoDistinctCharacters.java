package com.nirmal.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ID159LongestSubstringWithAtMostTwoDistinctCharacters {


    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s.length() < 3) {
            return s.length();
        }
        int leftIdx = 0;
        int rightIdx = 0;
        int maxLength = 2;
        Map<Character, Integer> lastSeen = new HashMap<>();

        while (rightIdx < s.length()) {
            char c = s.charAt(rightIdx);
            lastSeen.put(c, rightIdx);

            if (lastSeen.size() == 3) {
                int smallestIdx = Collections.min(lastSeen.values());
                lastSeen.remove(s.charAt(smallestIdx));
                leftIdx = smallestIdx + 1;
            }
            maxLength = Math.max(maxLength, rightIdx - leftIdx + 1);
            rightIdx++;
        }
        return maxLength;
    }
}
