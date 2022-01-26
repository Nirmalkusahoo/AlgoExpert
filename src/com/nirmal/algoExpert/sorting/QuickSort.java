package com.nirmal.algoExpert.sorting;

public class QuickSort {
    public static int[] quickSort(int[] array) {
        // Write your code here.
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public static void quickSort(int[] array, int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            return;
        }

        int pivotIdx = startIdx;
        int leftIdx = startIdx + 1;
        int rightIdx = endIdx;

        while (leftIdx <= rightIdx) {
            if (array[leftIdx] > array[pivotIdx] && array[rightIdx] < array[pivotIdx]) {
                swap(leftIdx, rightIdx, array);
            }
            if (array[leftIdx] <= array[pivotIdx]) {
                leftIdx++;
            }
            if (array[rightIdx] >= array[pivotIdx]) {
                rightIdx--;
            }
        }

        swap(rightIdx, pivotIdx, array);
        boolean leftArrayIsSmaller = rightIdx - 1 - startIdx < endIdx - rightIdx + 1;

        if (leftArrayIsSmaller) {
            quickSort(array, startIdx, rightIdx - 1);
            quickSort(array, rightIdx + 1, endIdx);
        } else {
            quickSort(array, rightIdx + 1, endIdx);
            quickSort(array, startIdx, rightIdx - 1);
        }
    }

    public static void swap(int firstIdx, int secondIdx, int[] array) {
        int temp = array[firstIdx];
        array[firstIdx] = array[secondIdx];
        array[secondIdx] = temp;
    }
}
