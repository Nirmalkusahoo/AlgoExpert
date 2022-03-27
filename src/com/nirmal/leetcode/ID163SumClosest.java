package com.nirmal.leetcode;

import java.util.Arrays;

public class ID163SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int closestSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int leftIdx = i + 1;
            int rightIdx = nums.length - 1;

            while (leftIdx < rightIdx) {
                int sum = nums[i] + nums[leftIdx] + nums[rightIdx];
                int currentDiff = Math.abs(sum - target);

                if (sum < target) {

                    leftIdx++;
                } else if (sum > target) {
                    rightIdx--;
                } else {
                    return sum;
                }
                if (currentDiff < diff) {
                    closestSum = sum;
                }
                diff = Math.min(diff, currentDiff);
            }
        }
        return closestSum;
    }
}
