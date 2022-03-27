package com.nirmal.leetcode;

public class ID852PeakIndexinaMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 1;

        while (i < arr.length - 1) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            } else {
                i++;
            }
        }
        return i;
    }
}
