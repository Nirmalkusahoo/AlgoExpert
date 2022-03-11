package com.nirmal.leetcode;

import java.util.*;

public class ID15ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> list = new HashSet<>();

        for (int i = 0; i < nums.length-2; i++) {
            int leftIdx = i + 1;
            int rightIdx = nums.length - 1;
            while (leftIdx < rightIdx) {

                int sum = nums[i] + nums[leftIdx] + nums[rightIdx];
                if (sum == 0) {
                    list.add(Arrays.asList(new Integer[]{nums[i], nums[leftIdx], nums[rightIdx]}));
                    leftIdx++;
                    rightIdx--;
                } else if (sum < 0) {
                    leftIdx++;
                } else if (sum > 0) {
                    rightIdx--;
                }
            }

        }
        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
