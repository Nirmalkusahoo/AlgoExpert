package com.nirmal.algoExpert.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumIncreasingSubsequence {
    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
        // Write your code here.
        int[] sums = array.clone();

        int[] sequence = new int[array.length];
        Arrays.fill(sequence, Integer.MIN_VALUE);

        int maxIdx = 0;
        for (int i = 0; i < array.length; i++) {
            int currentNum = array[i];
            for (int j = 0; j < i; j++) {
                int otherNum = array[j];
                if (otherNum < currentNum && currentNum + sums[j] >= sums[i]) {
                    sums[i] = sums[j] + currentNum;
                    sequence[i] = j;
                }
            }
            if (sums[i] > sums[maxIdx]) {
                maxIdx = i;
            }
        }
        return buildSequence(array, sequence, maxIdx, sums[maxIdx]);
    }

    public static List<List<Integer>> buildSequence(int[] array, int[] sequence, int currenIdx, int maxSum) {

        List<List<Integer>> newSequence = new ArrayList<List<Integer>>();
        newSequence.add(new ArrayList<Integer>());
        newSequence.add(new ArrayList<Integer>());
        newSequence.get(0).add(maxSum);

        while (currenIdx != Integer.MIN_VALUE) {
            newSequence.get(1).add(0, array[currenIdx]);
            currenIdx = sequence[currenIdx];
        }
        return newSequence;
    }
}
