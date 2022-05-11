package com.nirmal.leetcode;

public class ID1641CountSortedVowelStrings {
    public int countVowelStrings(int n) {
        int[][] count = new int[n + 1][6];

        for (int i = 1; i < count.length; i++) {
            for (int j = 1; j < count[0].length; j++) {
                if (i == 1) {
                    count[i][j] = j;
                } else {
                    count[i][j] = count[i - 1][j] + count[i][j - 1];
                }
            }
        }

        return count[n][5];
    }
}
