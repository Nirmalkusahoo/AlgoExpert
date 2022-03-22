package com.nirmal.leetcode;

public class ID167TwoSumIIInputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int L=0;
        int R=numbers.length-1;

        while (L<R){
            int sum=numbers[L] + numbers[R];
            if(sum == target){
                return new int[]{L,R};
            } else if(sum<target) {
                L++;
            } else {
                R--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,7,11,15},9));
    }
}
