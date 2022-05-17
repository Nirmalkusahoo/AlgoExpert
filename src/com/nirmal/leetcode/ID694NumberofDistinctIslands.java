package com.nirmal.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ID694NumberofDistinctIslands {
    public int WATER = 0;
    public int LAND = 1;
    public int baseRow, baseCol;
    public int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numDistinctIslands(int[][] grid) {
        Set<String> uniqueIslands = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == WATER) {
                    continue;
                }
                baseRow = i;
                baseCol = j;
                StringBuilder sb = new StringBuilder();
                bfs(baseRow, baseCol, sb, grid);
                uniqueIslands.add(sb.toString());
            }
        }
        return uniqueIslands.size();
    }

    public void bfs(int row, int col, StringBuilder sb, int[][] grid) {
        grid[row][col] = WATER;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int r = pos[0];
            int c = pos[1];
            sb.append(r - baseRow).append(c - baseCol);

            for (int[] dir : directions) {
                int cr = r + dir[0];
                int cc = c + dir[1];
                if (isValid(cr, cc, grid)) {
                    queue.add(new int[]{cr, cc});
                    grid[cr][cc] = WATER;
                }
            }
        }

    }

    public boolean isValid(int row, int col, int[][] grid) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) return false;

        if (grid[row][col] == WATER) return false;

        return true;
    }
}
