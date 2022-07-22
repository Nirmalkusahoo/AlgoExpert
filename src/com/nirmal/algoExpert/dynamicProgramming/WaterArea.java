package com.nirmal.algoExpert.dynamicProgramming;

public class WaterArea {
    public static int waterArea(int[] heights) {
        // Write your code here.
        if (heights.length == 0) {
            return 0;
        }

        int leftIdx = 0;
        int rightIdx = heights.length - 1;
        int leftMax = heights[leftIdx];
        int rightMax = heights[rightIdx];
        int water = 0;
        while (leftIdx < rightIdx) {
            if (heights[leftIdx] < heights[rightIdx]) {
                leftIdx++;
                leftMax = Math.max(leftMax, heights[leftIdx]);
                water = water + leftMax - heights[leftIdx];
            } else {
                rightIdx--;
                rightMax = Math.max(rightMax, heights[rightIdx]);
                water = water + rightMax - heights[rightIdx];
            }
        }
        return water;
    }
    // Solution :2
   /* public static int waterArea(int[] heights) {
        // Write your code here.

        int[] maxes = new int[heights.length];
        int leftMax = 0;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            maxes[i] = leftMax;
            leftMax = Math.max(leftMax, height);
        }

        int rightMax = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            int height = heights[i];

            int minHeight = Math.min(rightMax, maxes[i]);

            if (height < minHeight) {
                maxes[i] = minHeight - height;
            } else {
                maxes[i] = 0;
            }
            rightMax = Math.max(rightMax, height);
        }

        int total = 0;
        for (int i = 0; i < maxes.length; i++) {
            total = total + maxes[i];
        }
        return total;
    }*/
}
