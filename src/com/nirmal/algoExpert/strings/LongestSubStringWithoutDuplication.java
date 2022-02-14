package com.nirmal.algoExpert.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutDuplication {
    public static String longestSubstringWithoutDuplication(String str) {
        // Write your code here

        Map<Character, Integer> lastSeen = new HashMap<>();
        int[] longest = {0, 1};
        int startIdx = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (lastSeen.containsKey(c)) {
                startIdx = Math.max(startIdx, lastSeen.get(c) + 1);
            }
            if (longest[1] - longest[0] < i + 1 - startIdx) {
                longest[0] = startIdx;
                longest[1] = i + 1;
            }
            lastSeen.put(c, i);
        }

        return str.substring(longest[0], longest[1]);
    }
}
