package com.nirmal.algoExpert.greedyAlgorithims;

import java.util.Arrays;

public class TandemBicycle {
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        // Write your code here.

        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        if (!fastest) {
            reverseArray(blueShirtSpeeds);
        }

        int totalSpeed = 0;
        for (int idx = 0; idx < blueShirtSpeeds.length; idx++) {
            int rider1 = redShirtSpeeds[idx];
            int rider2 = blueShirtSpeeds[blueShirtSpeeds.length - 1 - idx];

            totalSpeed += Math.max(rider1, rider2);
        }

        return totalSpeed;
    }

    public void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
