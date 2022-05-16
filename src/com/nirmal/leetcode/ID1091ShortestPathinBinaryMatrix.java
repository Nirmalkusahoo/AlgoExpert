package com.nirmal.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ID1091ShortestPathinBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;

        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};
        int height = grid.length;
        int width = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        grid[0][0] = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                int[] value = queue.poll();
                int r = value[0];
                int c = value[1];
                int path = value[2];
                if (r == height - 1 && c == width - 1) {
                    return path;
                }

                for (int[] dir : directions) {
                    int newRow = r + dir[0];
                    int newCol = c + dir[1];
                    if (newRow >= 0 && newRow < height && newCol >= 0 && newCol < width && grid[newRow][newCol] == 0) {
                        queue.add(new int[]{newRow, newCol, path + 1});
                        grid[newRow][newCol] = 1;
                    }
                }
                size--;
            }
        }
        return -1;
    }
}
