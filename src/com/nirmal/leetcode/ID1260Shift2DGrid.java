package com.nirmal.leetcode;

import java.util.Arrays;
import java.util.List;

public class ID1260Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;

        k = k % (row * col);
        int[][] newGrid = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int newRow = i;
                int newCol = j + k;
                if (newCol >= col) {
                    newRow = newRow + newCol / col;
                    if (newRow >= row) {
                        newRow = newRow % row;
                    }
                    if (newCol >= col) {
                        newCol = newCol % col;
                    }
                }
                newGrid[newRow][newCol] = grid[i][j];
            }
        }

        return (List) Arrays.asList(newGrid);
    }
}
