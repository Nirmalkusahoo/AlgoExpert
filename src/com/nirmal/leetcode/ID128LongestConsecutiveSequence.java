package com.nirmal.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ID128LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int largest = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, true);
        }

        for (int n : nums) {
            if (!map.get(n)) {
                continue;
            }
            map.put(n, false);
            int currentLength = 1;

            int left = n - 1;
            int right = n + 1;

            while (map.containsKey(left)) {
                map.put(left, false);
                currentLength++;
                left--;
            }
            while (map.containsKey(right)) {
                map.put(right, false);
                currentLength++;
                right++;
            }

            if (currentLength > largest) {
                largest = currentLength;
            }
        }
        return largest;
    }
}
