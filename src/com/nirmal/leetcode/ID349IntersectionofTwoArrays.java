package com.nirmal.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ID349IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int idx1 = 0;
        int idx2 = 0;
        Set<Integer> result = new HashSet<>();
        while (idx1 < nums1.length && idx2 < nums2.length) {
            int firstNum = nums1[idx1];
            int secNum = nums2[idx2];
            if (firstNum == secNum) {
                result.add(nums1[idx1]);
                idx1++;
                idx2++;
            } else if (firstNum < secNum) {
                idx1++;
            } else {
                idx2++;
            }
        }

        int[] arr = new int[result.size()];
        int i = 0;
        for (int num : result) {
            arr[i] = num;
            i++;
        }
        return arr;
    }
}
