package com.nirmal.algoExpert.graphs;

import java.util.ArrayList;
import java.util.List;

public class MinimumPassesOfMatrix {
    public static int minimumPassesOfMatrix(int[][] matrix) {
        // Write your code here.
        int passes = convertToPositives(matrix);
        return (containsNegatives(matrix) ? -1 : passes);
    }

    public static int convertToPositives(int[][] matrix) {
        List<int[]> queue = getAllPositive(matrix);
        int passes = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                int[] pos = queue.remove(0);
                int row = pos[0];
                int col = pos[1];
                List<int[]> neighbours = getNeighbour(row, col, matrix);
                for (int[] neighbour : neighbours) {
                    int neighbourRow = neighbour[0];
                    int neighbourCol = neighbour[1];
                    int value = matrix[neighbourRow][neighbourCol];
                    if (value < 0) {
                        matrix[neighbourRow][neighbourCol] = value * -1;
                        queue.add(new int[]{neighbourRow, neighbourCol});
                    }
                }
                size--;
            }
            passes++;
        }
        return passes - 1;
    }

    public static List<int[]> getAllPositive(int[][] matrix) {
        List<int[]> list = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int value = matrix[row][col];
                if (value > 0) {
                    list.add(new int[]{row, col});
                }
            }
        }
        return list;
    }

    public static List<int[]> getNeighbour(int row, int col, int[][] matrix) {
        List<int[]> list = new ArrayList<>();
        if (row > 0) {
            list.add(new int[]{row - 1, col});
        }
        if (row < matrix.length - 1) {
            list.add(new int[]{row + 1, col});
        }
        if (col > 0) {
            list.add(new int[]{row, col - 1});
        }
        if (col < matrix[0].length - 1) {
            list.add(new int[]{row, col + 1});
        }
        return list;
    }

    public static boolean containsNegatives(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        arr[0] = new int[]{-2, 0, -2, 1};
        arr[1] = new int[]{-2, -1, -1, -1};

        minimumPassesOfMatrix(arr);
    }
}
