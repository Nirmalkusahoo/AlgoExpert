package com.nirmal.algoExpert.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        List<Integer[]> triplets = new ArrayList<Integer[]>();
        int left=0;
        int right=0;
        int sum=0;
        for(int i=0;i<array.length-2;i++){
            left=i+1;
            right=array.length-1;
            while(left<right){
                sum=array[i]+array[left]+array[right];
                if(sum==targetSum){
                    Integer[] newTriplet={array[i],array[left],array[right]};
                    triplets.add(newTriplet);
                    left++;
                    right--;
                } else if(sum<targetSum){
                    left++;
                } else if(sum>targetSum){
                    right--;
                }
            }
        }
        return triplets;
    }
}
