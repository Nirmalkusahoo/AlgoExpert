package com.nirmal.algoExpert.sorting;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        // Write your code here.
        if(array.length == 0){
            return new int[]{};
        }
        int startIdx = 0;
        while (startIdx < array.length - 1) {
            int smallestIdx = startIdx;
            for (int i = startIdx + 1; i < array.length; i++) {
                if (array[i] < array[smallestIdx]) {
                    smallestIdx = i;
                }
            }
            swap(smallestIdx, startIdx, array);
            startIdx++;
        }
        return array;
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
