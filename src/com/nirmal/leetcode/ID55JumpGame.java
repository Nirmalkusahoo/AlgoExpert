package com.nirmal.leetcode;

public class ID55JumpGame {
    public boolean canJump(int[] nums) {
        int lasGoodIndexPosition=nums.length-1;

        for(int i=nums.length-1;i>=0;i--){
            if(i + nums[i]>= lasGoodIndexPosition){
                lasGoodIndexPosition=i;
            }
        }
        return lasGoodIndexPosition == 0;
    }
}
