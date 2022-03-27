package com.nirmal.leetcode;

public class ID977SquaresofaSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int[] resultArray = new int[nums.length];
        int largerIdx = nums.length - 1;
        int smallerIdx = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[smallerIdx]) > Math.abs(nums[largerIdx])) {
                resultArray[i] = nums[smallerIdx] * nums[smallerIdx];
                smallerIdx++;
            } else {
                resultArray[i] = nums[largerIdx] * nums[largerIdx];
                largerIdx--;
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        System.out.println(sortedSquares(new int[]{-4,-1,0,3,10}));
    }
}
