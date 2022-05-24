package com.nirmal.leetcode;

public class ID63UniquePathsII {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int maxRow = obstacleGrid.length;
        int maxCol = obstacleGrid[0].length;
        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxCol; j++) {

                if (i == 0 || j == 0) {
                    if (obstacleGrid[i][j] == 1 || (i != 0 && obstacleGrid[i - 1][j] == 0) || (j != 0 && obstacleGrid[i][j - 1] == 0)) {
                        obstacleGrid[i][j] = 0;
                    } else {
                        obstacleGrid[i][j] = 1;
                    }
                } else {
                    if (obstacleGrid[i][j] == 1) {
                        obstacleGrid[i][j] = 0;
                    } else {
                        obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                    }
                }

            }
        }
        return obstacleGrid[maxRow - 1][maxCol - 1];
    }


    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0}}));
    }
}
