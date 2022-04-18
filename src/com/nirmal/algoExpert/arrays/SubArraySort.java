package com.nirmal.algoExpert.arrays;

public class SubArraySort {
    public static int[] subarraySort(int[] array) {
        // Write your code here.
        int minOutOfOrderNum = Integer.MAX_VALUE;
        int maxOutOfOrderNum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (isOutOfOrder(num, i, array)) {
                minOutOfOrderNum = Math.min(minOutOfOrderNum, num);
                maxOutOfOrderNum = Math.max(maxOutOfOrderNum, num);
            }
        }
        if (minOutOfOrderNum == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }

        int leftIdx = 0;
        while (minOutOfOrderNum >= array[leftIdx]) {
            leftIdx++;
        }

        int rightIdx = array.length - 1;
        while (maxOutOfOrderNum <= array[rightIdx]) {
            rightIdx--;
        }
        return new int[]{leftIdx, rightIdx};
    }

    public static boolean isOutOfOrder(int num, int index, int[] array) {
        if (index == 0) {
            return num > array[index + 1];
        }
        if (index == array.length - 1) {
            return num < array[index - 1];
        }
        return num < array[index - 1] || num > array[index + 1];
    }
}
