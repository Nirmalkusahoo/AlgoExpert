package com.nirmal.algoExpert.sorting;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        int counter = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            counter++;
        }
        return array;
    }
}
