package com.nirmal.leetcode;

public class ID304RangeSumQuery2DImmutable {
    int[][] dp;

    public ID304RangeSumQuery2DImmutable(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        dp = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
        dp = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int bottomRight = dp[row2][col2];
        int left = 0;
        int above = 0;
        int topLeft = 0;
        if (row1 != 0) {
            above = dp[row1 - 1][col2];
        }

        if (col1 != 0) {
            left = dp[row2][col1 - 1];
        }

        if (row1 != 0 && col1 != 0) {
            topLeft = dp[row1 - 1][col1 - 1];
        }

        int extra = above + left - topLeft;
        return bottomRight - extra;
    }

    public static void main(String[] args) {
        ID304RangeSumQuery2DImmutable obj = new ID304RangeSumQuery2DImmutable(new int[][]{{1, 2, 3}, {4, 5, 6}});
        obj.sumRegion(0, 0, 1, 2);
    }
}
