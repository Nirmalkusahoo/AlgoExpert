package com.nirmal.algoExpert.graphs;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveIslands {
    public int[][] removeIslands(int[][] matrix) {
        // Write your code here.

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                boolean borderRow = row == 0 || row == matrix.length - 1;
                boolean borderCol = col == 0 || col == matrix[row].length - 1;

                boolean isBorder = borderRow || borderCol;

                if (!isBorder) {
                    continue;
                }
                if (matrix[row][col] != 1) {
                    continue;
                }

                changeOnesConnectedToBordersToTwo(matrix, row, col);


            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int value = matrix[row][col];
                if (value == 2) {
                    matrix[row][col] = 1;
                } else if (value == 1) {
                    matrix[row][col] = 0;
                }
            }
        }
        return matrix;
    }

    public void changeOnesConnectedToBordersToTwo(int[][] matrix, int startRow, int startCol) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startRow, startCol});

        while (stack.size() > 0) {
            int[] currentPosition = stack.pop();
            int currentRow = currentPosition[0];
            int currentCol = currentPosition[1];

            matrix[currentRow][currentCol] = 2;

            ArrayList<int[]> neighbours = findNeighbours(matrix, currentRow, currentCol);
            for (int[] neighbour : neighbours) {
                int row = neighbour[0];
                int col = neighbour[1];

                if (matrix[row][col] != 1) {
                    continue;
                }
                stack.push(neighbour);
            }
        }
    }

    public ArrayList<int[]> findNeighbours(int[][] matrix, int row, int col) {
        int maxRow = matrix.length;
        int maxCol = matrix[row].length;
        ArrayList<int[]> neighbours = new ArrayList<>();

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
}
