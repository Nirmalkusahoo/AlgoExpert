package com.nirmal.leetcode;

public class ID896MonotonicArray {

    public boolean isMonotonic(int[] nums) {
        boolean decreased=true;
        boolean increased=true;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                decreased=false;
            }
            if(nums[i]<nums[i-1]){
                increased=false;
            }
        }
        return decreased || increased;

    }
}
