package com.nirmal.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ID1293ShortestPathinaGridwithObstaclesElimination {
    public int shortestPath(int[][] grid, int k) {
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        int maxRow = grid.length;
        int maxCol = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        boolean[][][] visited = new boolean[maxRow][maxCol][k + 1];
        queue.offer(new int[]{0, 0, 0});
        visited[0][0][0] = true;

        int path = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] info = queue.poll();
                int row = info[0];
                int col = info[1];
                int cuurentk = info[2];

                if (row == maxRow - 1 && col == maxCol - 1) {
                    return path;
                }

                for (int[] dir : dirs) {
                    int nxtRow = row + dir[0];
                    int nxtCol = col + dir[1];
                    int nxtK = cuurentk;
                    if (nxtRow < maxRow && nxtRow >= 0 && nxtCol < maxCol && nxtCol >= 0) {
                        if (grid[nxtRow][nxtCol] == 1) {
                            nxtK++;
                        }
                        if (nxtK <= k && !visited[nxtRow][nxtCol][nxtK]) {
                            queue.offer(new int[]{nxtRow, nxtCol, nxtK});
                            visited[nxtRow][nxtCol][nxtK] = true;
                        }
                    }

                }
            }
            path++;
        }
        return -1;
    }
}
