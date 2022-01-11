package com.nirmal.algoExpert.sorting;

public class ThreeNumberSort {

    // Solution 2:
    public int[] threeNumberSort(int[] array, int[] order) {
        // Write your code here.

        int firstValue = order[0];
        int thirdValue = order[2];

        int firstIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == firstValue) {
                swap(i, firstIdx, array);
                firstIdx++;
            }
        }

        int thirdIdx = array.length - 1;
        for (int i = array.length - 1; i >= 0; i++) {
            if (array[i] == thirdValue) {
                swap(i, thirdIdx, array);
                thirdIdx--;
            }
        }
        return array;
    }

    public void swap(int first, int second, int[] array) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    // Solution 1:
    /*public static int[] threeNumberSort(int[] array, int[] order) {
        // Write your code here.

        int[] valueCounts = new int[]{0,0,0};

        for (int element : array) {
            int idx = 0;
            for (int i = 0; i < order.length; i++) {
                if (element == order[i]) {
                    idx = i;
                }
            }
            valueCounts[idx] = valueCounts[idx] + 1;
        }

        for (int i = 0; i < 3; i++) {
            int startIdx = 0;
            for (int n = 0; n < i; n++) {
                startIdx = startIdx + valueCounts[n];
            }

            for (int j = 0; j < valueCounts[i]; j++) {
                array[startIdx+ j] = order[i];
            }
        }

        return array;
    }*/

}
