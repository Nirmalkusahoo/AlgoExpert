package com.nirmal.algoExpert.graphs;

public class SingleCycleCheck {
    public static boolean hasSingleCycle(int[] array) {
        // Write your code here.
        int numberOfElementVisited = 0;
        int currentIndex = 0;

        while (numberOfElementVisited < array.length) {
            if (numberOfElementVisited > 0 && currentIndex == 0) {
                return false;
            }
            numberOfElementVisited++;
            currentIndex = getIndex(array, currentIndex);
        }
        return currentIndex == 0;
    }

    public static int getIndex(int[] array, int index) {
        int jump = array[index];
        int nextIdx = (index + jump) % array.length;

        return nextIdx >= 0 ? nextIdx : array.length + nextIdx;
    }
}
