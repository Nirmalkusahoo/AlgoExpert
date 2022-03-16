package com.nirmal.leetcode;

public class ID268MissingNumber {
    public int missingNumber(int[] nums) {
        int length=nums.length;
        int total= length*(length+1)/2;

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum= sum +nums[i];
        }
        return total-sum;
    }
}
