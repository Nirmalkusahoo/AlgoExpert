package com.nirmal.leetcode;

public class ID329LongestIncreasingPathinaMatrix {
    int[][] direction = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int longestIncreasingPath(int[][] matrix) {
        int maxRow = matrix.length;
        int maxCol = matrix[0].length;
        int maxPath = 0;
        int[][] memory = new int[maxRow][maxCol];
        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxCol; j++) {
                int max = dfs(i, j, matrix, direction, maxRow, maxCol, memory);
                maxPath = Math.max(maxPath, max);
            }
        }
        return maxPath;
    }

    public static int dfs(int row, int col, int[][] matrix, int[][] direction, int maxRow, int maxCol, int[][] memory) {
        if (memory[row][col] > 0) {
            return memory[row][col];
        }
        int maxPath = 0;
        for (int[] dir : direction) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow < maxRow && newRow >= 0 && newCol < maxCol && newCol >= 0 && matrix[newRow][newCol] > matrix[row][col]) {
                maxPath = Math.max(maxPath, dfs(newRow, newCol, matrix, direction, maxRow, maxCol, memory));
            }
        }
        memory[row][col] = maxPath + 1;
        return maxPath + 1;
    }
}
