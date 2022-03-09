package com.nirmal.leetcode;

public class ID162FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int i=1;

        while (i<=nums.length-1){
            int leftIdx=i-1;
            int rightIdx=i+1;
            boolean isPeak=false;
            if(leftIdx>=0 && nums[leftIdx+1]>nums[leftIdx]){
                isPeak=true;
            } else {
                isPeak=false;
            }
            if(rightIdx<nums.length && nums[rightIdx]<nums[rightIdx-1]){
                isPeak=true;
            }else {
                isPeak=false;
            }
            if(isPeak){
                return i;
            } else {
                i++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1,2}));
    }
}
