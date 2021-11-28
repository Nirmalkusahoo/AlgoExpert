package com.nirmal.algoExpert.dynamicProgramming;

public class MaxSubsetSumNoAdjacent {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        // Write your code here.
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        }

        int second = array[0];
        int first = Math.max(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            int current = Math.max(first, second + array[i]);
            second = first;
            first = current;
        }
        return first;
    }

    // Solution 1:
    /*public static int maxSubsetSumNoAdjacent(int[] array) {
        // Write your code here.
        if(array.length ==0){
            return 0;
        }
        else if(array.length ==1){
            return array[0];
        }

        int[] maxSums=array.clone();
        maxSums[1]= Math.max(array[1],array[0]);

        for(int i=2;i<array.length;i++){
            maxSums[i]= Math.max(maxSums[i-1],maxSums[i-2]+ array[i]);
        }

        return maxSums[array.length-1];
    }*/

    public static void main(String[] args) {
        System.out.println(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(new int[]{75, 105, 120, 75, 90, 135}));
    }

}
