package com.nirmal.algoExpert.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class MaxSubsetSumNoAdjacent {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        // Write your code here.
        int largest= -999999;
        for(int i=2;i<array.length-2;i++){
            int leftIndex=i-2;
            int rightIndex=i+2;
            while(leftIndex>=0 && rightIndex<=array.length-2){
                int sum =array[i]+array[leftIndex]+array[rightIndex];
                if(sum>largest){
                    largest=sum;
                }
                leftIndex--;
                rightIndex++;
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(new int[]{75, 105, 120, 75, 90, 135}));
    }

}
