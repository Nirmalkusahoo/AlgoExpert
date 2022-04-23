package com.nirmal.algoExpert.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestRange {
    public static int[] largestRange(int[] array) {
        // Write your code here.
        int largest = 0;
        int[] besRange = new int[2];
        Map<Integer, Boolean> map = new HashMap<>();

        for (int n : array) {
            map.put(n, true);
        }

        for (int n : array) {
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
                besRange = new int[]{left + 1, right - 1};
            }
        }
        return besRange;
    }
}
