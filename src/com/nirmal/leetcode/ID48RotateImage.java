package com.nirmal.leetcode;

public class ID48RotateImage {
    public void rotate(int[][] matrix) {
        int l = matrix.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][l - j - 1];
                matrix[i][l - j - 1] = temp;
            }
        }
    }
}
