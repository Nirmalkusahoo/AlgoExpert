package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ID200NumberofIslands {
    public static int numIslands(char[][] grid) {
        int noOfLands = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                char currentValue = grid[row][col];
                if (currentValue == '1') {
                    dfs(grid, row, col);
                    noOfLands++;
                }
            }
        }
        return noOfLands;
    }

    public static void dfs(char[][] grid, int row, int col) {

        Stack<int[]> stack = new Stack<>();
        grid[row][col] = '0';
        stack.push(new int[]{row, col});
        while (stack.size() > 0) {
            int[] current = stack.pop();
            int currentRow = current[0];
            int currentCol = current[1];
            grid[currentRow][currentCol] = '0';
            List<int[]> neighbours = getNeighbours(grid, currentRow, currentCol);

            for (int[] neighbour : neighbours) {
                int neighbourRow = neighbour[0];
                int neighbourCol = neighbour[1];
                if (grid[neighbourRow][neighbourCol] == '1') {
                    stack.push(neighbour);
                }
            }
        }
    }

    public static List<int[]> getNeighbours(char[][] grid, int row, int col) {
        int maxRow = grid.length;
        int maxCol = grid[0].length;
        List<int[]> neighbours = new ArrayList<>();
        if (row - 1 >= 0) {
            neighbours.add(new int[]{row - 1, col});
        }
        if (row + 1 < maxRow) {
            neighbours.add(new int[]{row + 1, col});
        }
        if (col - 1 >= 0) {
            neighbours.add(new int[]{row, col - 1});
        }
        if (col + 1 < maxCol) {
            neighbours.add(new int[]{row, col + 1});
        }
        return neighbours;
    }

    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}}));
    }
}
