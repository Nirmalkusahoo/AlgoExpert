package com.nirmal.leetcode;

public class ID867TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int[][] newMatrix = new int[C][R];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                newMatrix[c][r] = matrix[r][c];
            }
        }
        return newMatrix;
    }
}
