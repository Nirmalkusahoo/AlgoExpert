package com.nirmal.leetcode;

public class ID63UniquePathsII {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        int[][] ways = new int[row][col];

        ways[0][0]=1;
        for (int i = 1; i < row; i++) {
            if (obstacleGrid[i][0] == 1 || obstacleGrid[i - 1][0] == 1) {
                ways[i][0] = 0;
            } else {
                ways[i][0] = 1;
            }
        }

        for (int i = 1; i < col; i++) {
            if (obstacleGrid[0][i] == 1 || obstacleGrid[0][i - 1] == 1) {
                ways[0][i] = 0;
            } else {
                ways[0][i] = 1;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if(obstacleGrid[i][j] ==1){
                    ways[i][j] =0;
                } else {
                    ways[i][j] = ways[i - 1][j] + ways[i][j - 1];
                }

            }
        }

        return ways[row - 1][col - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0}}));
    }
}
