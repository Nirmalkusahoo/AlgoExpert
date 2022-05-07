package com.nirmal.algoExpert.arrays;

import java.util.List;
import java.util.Map;

public class ApartmentHunting {
    public static int apartmentHunting(List<Map<String, Boolean>> blocks, String[] reqs) {
        // Write your code here.
        int[][] minDistanceFromBlocks = new int[reqs.length][];

        for (int i = 0; i < minDistanceFromBlocks.length; i++) {
            minDistanceFromBlocks[i] = getMinDistances(blocks, reqs[i]);
        }
        int[] maxDistancesAtBlocks = getMaxDistancesAtBlocks(blocks, minDistanceFromBlocks);
        return getMinIdxValue(maxDistancesAtBlocks);
    }

    public static int[] getMinDistances(List<Map<String, Boolean>> blocks, String requirement) {
        int[] minDistances = new int[blocks.size()];
        int closestReqIdx = Integer.MAX_VALUE;

        for (int i = 0; i < blocks.size(); i++) {
            if (blocks.get(i).get(requirement)) {
                closestReqIdx = i;
            }
            minDistances[i] = distanceBetween(i, closestReqIdx);
        }

        for (int i = blocks.size() - 1; i >= 0; i--) {
            if (blocks.get(i).get(requirement)) {
                closestReqIdx = i;
            }
            minDistances[i] = Math.min(minDistances[i], distanceBetween(i, closestReqIdx));
        }
        return minDistances;
    }

    public static int[] getMaxDistancesAtBlocks(List<Map<String, Boolean>> blocks, int[][] minDistanceFromBlocks) {
        int[] maxDistancesAtBlocks = new int[blocks.size()];

        for (int i = 0; i < blocks.size(); i++) {
            int[] minDistancesAtBlocks = new int[minDistanceFromBlocks.length];
            for (int j = 0; j < minDistanceFromBlocks.length; j++) {
                minDistancesAtBlocks[j] = minDistanceFromBlocks[j][i];
            }
            maxDistancesAtBlocks[i] = arrayMax(minDistancesAtBlocks);
        }
        return maxDistancesAtBlocks;
    }

    public static int getMinIdxValue(int[] maxDistancesAtBlocks) {
        int minIdx = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < maxDistancesAtBlocks.length; i++) {
            int currentDistance = maxDistancesAtBlocks[i];
            if (currentDistance < minValue) {
                minIdx = i;
                minValue = currentDistance;
            }
        }
        return minIdx;
    }

    public static int arrayMax(int[] arr) {
        int max = arr[0];
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static int distanceBetween(int i, int closestReqIdx) {
        return Math.abs(i - closestReqIdx);
    }
}
