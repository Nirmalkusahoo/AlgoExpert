package com.nirmal.algoExpert.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    // using while loop
    /*public static int[] twoNumberSum(int[] arr, int targetSum){
        int index=0;
        Set<Integer> nums= new HashSet<Integer>();
        while (index<arr.length){
            int potentialMatch=targetSum-arr[index];
            if(nums.contains(potentialMatch)){
                return new int[]{arr[index], potentialMatch};
            } else {
                nums.add(arr[index]);
                index++;
            }
        }
        return new int[]{};
    }*/
    // using for loop
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int index=0;
        Set<Integer> nums= new HashSet<Integer>();
        for(int num:array){
            int potentialMatch=targetSum-num;
            if(nums.contains(potentialMatch)){
                return new int[]{num, potentialMatch};
            } else {
                nums.add(num);
                index++;
            }
            index++;
        }
        return new int[]{};
    }
    public static void main(String[] args) {
//        int[] result= twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6},10);
        int[] result= twoNumberSum(new int[]{6,4},10);

        System.out.println("Result is"+ Arrays.toString(result) );
    }
}
