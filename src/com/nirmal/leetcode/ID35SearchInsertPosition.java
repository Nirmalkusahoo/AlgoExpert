package com.nirmal.leetcode;

public class ID35SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int L = 0;
        int R = nums.length - 1;
        while (L <= R) {
            int M = (L + R) / 2;
            if (target == nums[M]) {
                return M;
            } else if (target < nums[M]) {
                R = M - 1;
            } else {
                L = M + 1;
            }
        }
        return L;
    }
}
