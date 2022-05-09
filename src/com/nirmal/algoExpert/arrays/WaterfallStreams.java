package com.nirmal.algoExpert.arrays;

public class WaterfallStreams {
    public static double[] waterfallStreams(double[][] array, int source) {
        // Write your code here.

        double[] rowAbove = array[0];
        rowAbove[source] = -1;

        for (int row = 1; row < array.length; row++) {
            double[] currentRow = array[row];

            for (int idx = 0; idx < rowAbove.length; idx++) {
                double valueAbove = rowAbove[idx];

                boolean hasWater = valueAbove < 0;
                boolean hasBlock = currentRow[idx] == 1.0;

                if (!hasWater) {
                    continue;
                }
                if (!hasBlock) {
                    currentRow[idx] = currentRow[idx] + valueAbove;
                    continue;
                }

                double splitWater = valueAbove / 2;

                int rightIdx = idx;
                while (rightIdx + 1 < rowAbove.length) {
                    rightIdx = rightIdx + 1;
                    if (rowAbove[rightIdx] == 1.0) {
                        break;
                    }
                    if (currentRow[rightIdx] != 1.0) {
                        currentRow[rightIdx] = currentRow[rightIdx] + splitWater;
                        break;
                    }
                }

                int leftIdx = idx;
                while (leftIdx - 1 >= 0) {
                    leftIdx = leftIdx - 1;
                    if (rowAbove[leftIdx] == 1.0) {
                        break;
                    }
                    if (currentRow[leftIdx] != 1.0) {
                        currentRow[leftIdx] = currentRow[leftIdx] + splitWater;
                        break;
                    }
                }
            }
            rowAbove = currentRow;
        }

        double[] finalValue = new double[rowAbove.length];

        for (int i = 0; i < rowAbove.length; i++) {
            double value = rowAbove[i];
            if (value == 0) {
                finalValue[i] = value;
            } else {
                finalValue[i] = -100 * value;
            }
        }
        return finalValue;
    }

    public static void main(String[] args) {
        System.out.println(waterfallStreams(new double[][]{{0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0}}, 3));
    }
}
