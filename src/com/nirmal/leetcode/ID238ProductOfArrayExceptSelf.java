package com.nirmal.leetcode;

public class ID238ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] products=new int[nums.length];

        int runningProducts=1;
        for(int i=0;i<nums.length;i++){
            products[i]=runningProducts;
            runningProducts=runningProducts*nums[i];
        }

         runningProducts=1;
        for(int i=nums.length-1;i>=0;i--){
            products[i]=products[i]*runningProducts;
            runningProducts=runningProducts*nums[i];
        }

        return products;
    }
}
