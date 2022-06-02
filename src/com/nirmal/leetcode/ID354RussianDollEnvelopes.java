package com.nirmal.leetcode;

import java.util.Arrays;

public class ID354RussianDollEnvelopes {
    public static int maxEnvelopes(int[][] envelopes) {

//        Solution 1: Time Limit exceeded
        Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);

        int maxLength = 1;
        int[] maxSequence = new int[envelopes.length];
        maxSequence[0] = 1;
        for (int i = 1; i < envelopes.length; i++) {
            maxSequence[i] = 1;
            for (int j = 0; j < i; j++) {
                if (envelopes[i][0] != envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
                    maxSequence[i] = Math.max(maxSequence[i], maxSequence[j] + 1);
                }
            }

            maxLength = Math.max(maxLength, maxSequence[i]);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[][] envelopes = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        System.out.println(maxEnvelopes(envelopes));
    }
}
