package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ID1200MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int diff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int currentDiff = arr[i] - arr[i - 1];
            if (diff == currentDiff) {
                list.add(Arrays.asList(new Integer[]{arr[i - 1], arr[i]}));
            } else if (currentDiff < diff) {
                diff = currentDiff;
                list.clear();
                list.add(Arrays.asList(new Integer[]{arr[i - 1], arr[i]}));
            }
        }
        return list;

    }
}
