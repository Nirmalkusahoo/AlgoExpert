package com.nirmal.algoExpert.arrays;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        boolean isNonDecreasing=true;
        boolean isNonIncreasing=true;
        for(int i=1;i<array.length;i++){
            if(array[i-1]>array[i]){
                isNonIncreasing=false;
                break;
            }
            if(array[i-1]<array[i]){
                isNonDecreasing =false;
                break;
            }
        }

        return isNonDecreasing || isNonIncreasing ;

    }

    public static void main(String[] args) {
        System.out.println(MonotonicArray.isMonotonic(new int[]{-1, -5, -10, -1100, -900, -1101, -1102, -9001}));
    }
}
