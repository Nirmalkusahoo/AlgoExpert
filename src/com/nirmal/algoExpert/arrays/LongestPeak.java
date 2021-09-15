package com.nirmal.algoExpert.arrays;

public class LongestPeak {
    public static int longestPeak(int[] array) {
        // Write your code here.
        int peak = 0;
        int i = 1;
        while (i < array.length - 1) {
            boolean isPeak = array[i - 1] < array[i] && array[i]>array[i + 1] ;
            if (!isPeak) {
                i+=1;
                continue;
            }
            int leftIndex = i - 2;
            while (leftIndex >= 0 && array[leftIndex] < array[leftIndex+1]) {
                leftIndex-=1;
            }

            int rightIndex = i + 2;
            while (rightIndex < array.length && array[rightIndex ] < array[rightIndex-1]) {
                rightIndex+=1;
            }
            int currentPeak = rightIndex - leftIndex - 1;
            if (currentPeak > peak) {
                peak = currentPeak;
            }
            i = rightIndex;
        }
        return peak;
    }

    public static void main(String[] args) {
        System.out.println(LongestPeak.longestPeak(new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3}));
    }
}
