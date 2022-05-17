package com.nirmal.leetcode;

public class ID2016MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                maxDiff = Math.max(maxDiff, nums[i] - min);
            }
            min = Math.min(min, nums[i]);
        }

        return maxDiff == Integer.MIN_VALUE ? -1 : maxDiff;
    }
}
