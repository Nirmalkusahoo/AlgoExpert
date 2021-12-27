package com.nirmal.algoExpert.greedyAlgorithims;

import java.util.Arrays;

public class MinimumWaitingTime {
    public int minimumWaitingTime(int[] queries) {
        // Write your code here.
        Arrays.sort(queries);

        int totalDuration = 0;
        for (int i = 0; i < queries.length; i++) {
            int waitingTime = queries[i];
            int queriesLeft = queries.length - (i + 1);
            totalDuration = totalDuration + waitingTime * queriesLeft;
        }
        return totalDuration;
    }
}
