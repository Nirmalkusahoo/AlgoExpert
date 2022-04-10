package com.nirmal.leetcode;

public class ID453MinimumMovestoEqualArrayElements {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            min = Math.min(num, min);
        }

        int result = 0;
        for (int num : nums) {
            result = result + num - min;
        }
        return result;
    }
}
