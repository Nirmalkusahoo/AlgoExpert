package com.nirmal.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ID1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> location= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=Math.abs(target-nums[i]);
            if(location.containsKey(diff)){
                return new int[]{location.get(diff),i};
            } else {
                location.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
