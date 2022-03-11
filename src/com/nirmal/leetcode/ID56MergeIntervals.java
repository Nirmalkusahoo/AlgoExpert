package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ID56MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedIntervals = new ArrayList<>();

        int[] currentInterval = sortedIntervals[0];
        mergedIntervals.add(currentInterval);

        for (int[] nextInterval : sortedIntervals) {
            int currentIntervalEnd = currentInterval[1];
            int nextIntervalStart = nextInterval[0];
            int nextIntervalEnd = nextInterval[1];
            if (currentIntervalEnd >= nextIntervalStart) {
                currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
            } else {
                currentInterval = nextInterval;
                mergedIntervals.add(nextInterval);
            }

        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
