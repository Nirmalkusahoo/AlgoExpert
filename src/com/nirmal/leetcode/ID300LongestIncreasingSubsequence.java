package com.nirmal.leetcode;

import java.util.Arrays;

public class ID300LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int maxLength = 0;
        int[] length = new int[nums.length];
        Arrays.fill(length, 1);
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            for (int j = 0; j < i; j++) {
                int otherNum = nums[j];
                if (otherNum < currentNum && length[j] + 1 > length[i]) {
                    length[i] = length[j] + 1;
                }
            }
            maxLength = Math.max(maxLength, length[i]);
        }
        return maxLength;
    }
}
