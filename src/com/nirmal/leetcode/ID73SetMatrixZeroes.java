package com.nirmal.leetcode;

public class ID73SetMatrixZeroes {

    // to understand watch this- https://www.youtube.com/watch?v=M65xBewcqcI
    public static void setZeroes(int[][] matrix) {
        int isColZero = 1;

        int maxRow = matrix.length;
        int maxCol = matrix[0].length;

        for (int i = 0; i < maxRow; i++) {
            if (matrix[i][0] == 0) {
                isColZero = 0;
            }
            for (int j = 1; j < maxCol; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = maxRow - 1; i >= 0; i--) {
            for (int j = maxCol - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }

            }
        }
        if (isColZero == 0) {
            for (int i = 0; i < maxRow; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        setZeroes(new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}});
    }
}
