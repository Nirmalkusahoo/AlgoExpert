package com.nirmal.leetcode;

public class ID161OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {

        int[][] edits = new int[s.length() + 1][t.length() + 1];

        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = 0; j < t.length() + 1; j++) {
                edits[0][j] = j;
            }
            edits[i][0] = i;
        }

        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 1; j < t.length() + 1; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    edits[i][j] = edits[i - 1][j - 1];
                } else {
                    edits[i][j] = Math.min(edits[i - 1][j - 1], Math.min(edits[i - 1][j], edits[i][j - 1]));
                }
            }
        }
        return edits[s.length()][t.length()] == 1;
    }
}
