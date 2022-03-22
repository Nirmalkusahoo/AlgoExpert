package com.nirmal.leetcode;

public class ID704BinarySearch {
    public int search(int[] nums, int target) {
        int left=0;
        int right= nums.length-1;
        while (left<=right){
            int middle=(left+right)/2;

            int match=nums[middle];
            if(target == nums[middle]){
                return middle;
            }
            if(target<match){
                right=middle-1;
            } else {
                left=middle+1;
            }
        }
        return -1;
    }
}
