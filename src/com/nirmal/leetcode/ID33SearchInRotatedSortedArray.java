package com.nirmal.leetcode;

public class ID33SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            int middleNum = nums[middle];
            int leftNum = nums[left];
            int rightNum = nums[right];
            if (middleNum == target) {
                return middle;
            } else if (leftNum <= middleNum) {
                if (target >= leftNum && target < middleNum) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target > middleNum && target <= rightNum) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }
}
