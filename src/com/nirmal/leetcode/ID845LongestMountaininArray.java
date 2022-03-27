package com.nirmal.leetcode;

public class ID845LongestMountaininArray {
    public int longestMountain(int[] arr) {
        int i = 1;
        int longestLength = 0;
        while (i < arr.length - 1) {
            boolean isPeak = false;
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                isPeak = true;
            }
            if (!isPeak) {
                i++;
                continue;
            }

            int leftIdx = i - 2;
            while (leftIdx >= 0 && arr[leftIdx] < arr[leftIdx + 1]) {
                leftIdx--;
            }

            int rightIdx = i + 2;
            while (rightIdx < arr.length && arr[rightIdx] < arr[rightIdx - 1]) {
                rightIdx++;
            }
            int currentLength = rightIdx - leftIdx - 1;
            if (currentLength > longestLength) {
                longestLength = currentLength;
            }
            i = rightIdx;
        }
        return longestLength;
    }
}
