package com.nirmal.algoExpert.arrays;

import java.util.ArrayList;
import java.util.List;

public class ZigzagTraverse {
    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
        // Write your code here.

        int row = 0;
        int col = 0;
        int width = array.get(0).size() - 1;
        int height = array.size() - 1;

        List<Integer> result = new ArrayList<>();
        boolean isGoingDown = true;

        while (!isOutBounds(width, height, row, col)) {
            result.add(array.get(row).get(col));

            if (isGoingDown) {
                if (col == 0 || row == height) {
                    isGoingDown = false;
                    if (row == height) {
                        col++;
                    } else {
                        row++;
                    }

                } else {
                    col--;
                    row++;
                }
            } else {
                if (row == 0 || col == width) {
                    isGoingDown = true;
                    if (col == width) {
                        row++;
                    } else {
                        col++;
                    }

                } else {
                    col++;
                    row--;
                }
            }
        }
        return result;
    }

    public static boolean isOutBounds(int width, int height, int row, int col) {

        return row < 0 || row > height || col > width || col < 0;
    }
}
