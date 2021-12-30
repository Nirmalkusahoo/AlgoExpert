package com.nirmal.algoExpert.arrays;

public class FirstDuplicateValues {

    // Solution 2:
    public int firstDuplicateValue(int[] array) {
        // Write your code here.
        for (int i :array) {
            int value = Math.abs(i);
            if (array[value - 1] < 0) {
                return value;
            } else {
                array[value-1] = array[value-1] * -1;
            }
        }
        return -1;
    }

    // Solution 1:
    /*public int firstDuplicateValue(int[] array) {
        // Write your code here.

        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (map.contains(array[i])) {
                return array[i];
            } else {
                map.add(array[i]);
            }
        }
        return -1;
    }*/
}
