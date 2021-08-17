package com.nirmal.algoExpert.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        int currentChangeCreated=0;
        Arrays.sort(coins);
        for(int i : coins){
            if(i>currentChangeCreated +1){
                return currentChangeCreated +1;
            }
            currentChangeCreated=currentChangeCreated+i;

        }
        return currentChangeCreated+1;
    }
    public static void main(String[] args) {
        NonConstructibleChange obj=new NonConstructibleChange();
//        System.out.println(obj.nonConstructibleChange(new int[]{1,2,5}));
        System.out.println(obj.nonConstructibleChange(new int[]{1,1,1,1}));
    }
}
