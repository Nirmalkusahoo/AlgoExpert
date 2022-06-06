package com.nirmal.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ID1197MinimumKnightMoves {
    public int minKnightMoves(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        int result = 0;
        int[][] directions = new int[][]{{2, 1}, {2, -1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}};
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(new int[]{0, 0});
        visited.add("0,0");

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] position = queue.poll();
                int r = position[0];
                int c = position[1];
                if (r == x && c == y) {
                    return result;
                }
                for (int[] dir : directions) {
                    int newRow = r + dir[0];
                    int newCol = c + dir[1];
                    if (newRow >= -1 && newCol >= -1 && !visited.contains(newRow + "," + newCol)) {
                        queue.offer(new int[]{newRow, newCol});
                        visited.add(newRow + "," + newCol);
                    }
                }
            }
            result++;
        }
        return -1;
    }
}
