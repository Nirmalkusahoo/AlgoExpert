package com.nirmal.algoExpert.sorting;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] array) {
        // Write your code here.
        if (array.length <= 1) {
            return array;
        }

        int middleIdx = array.length / 2;
        int[] leftHalf = Arrays.copyOfRange(array, 0, middleIdx);
        int[] rightHalf = Arrays.copyOfRange(array, middleIdx, array.length);
        return mergeSortedArray(mergeSort(leftHalf), mergeSort(rightHalf));
    }

    public static int[] mergeSortedArray(int[] left, int[] right) {
        int[] sortedArray = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                sortedArray[k++] = left[i++];
            } else {
                sortedArray[k++] = right[j++];
            }
        }
        while (i < left.length) {
            sortedArray[k++] = left[i++];
        }

        while (j < right.length) {
            sortedArray[k++] = right[j++];
        }
        return sortedArray;
    }
}
