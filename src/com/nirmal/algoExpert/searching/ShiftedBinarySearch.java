package com.nirmal.algoExpert.searching;

public class ShiftedBinarySearch {
    public static int shiftedBinarySearch(int[] array, int target) {
        // Write your code here.

        return doBinarySearch(array, target, 0, array.length - 1);
    }

    public static int doBinarySearch(int[] array, int target, int left, int right) {
        while (left < right) {
            int middle = left + right;
            int leftNum = array[left];
            int rightNum = array[right];
            int middleNum = array[middle];

            if (target == middleNum) {
                return middle;
            } else if (leftNum < middleNum) {
                if (target > leftNum && target <= middleNum) {
                    left = middle - 1;
                } else {
                    right = middle + 1;
                }
            } else {
                if (target > middleNum && target <= rightNum) {
                    right = middle + 1;
                } else {
                    left = middle - 1;
                }
            }
        }
        return -1;
    }
    // Solution 1:
    /*public static int doBinarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        int middleNum = array[middle];
        int leftNum = array[left];
        int rightNum = array[right];
        if (middleNum == target) {
            return middle;
        } else if (leftNum <= middleNum) {
            if (target >= leftNum && target < middleNum) {
                return doBinarySearch(array, target, left, middle - 1);
            } else {
                return doBinarySearch(array, target, middle + 1, right);
            }
        } else {
            if (target > middleNum && target <= rightNum) {
                return doBinarySearch(array, target, middle + 1, right);
            } else {
                return doBinarySearch(array, target, left, middle - 1);
            }
        }
    }*/
}
