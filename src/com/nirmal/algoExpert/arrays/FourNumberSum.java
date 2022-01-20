package com.nirmal.algoExpert.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumberSum {
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // Write your code here.

        Map<Integer, List<Integer[]>> allPairSum = new HashMap<>();
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();

        for (int i = 1; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int currentSum = array[i] + array[j];
                int diff = targetSum - currentSum;
                if (allPairSum.containsKey(diff)) {
                    for (Integer[] pair : allPairSum.get(diff)) {
                        Integer[] newQuadruplets = {array[i], array[j], pair[0], pair[1]};
                        quadruplets.add(newQuadruplets);
                    }

                }
            }

            for (int k = 0; k < i; k++) {
                int currentSum = array[i] + array[k];
                Integer[] pair = {array[i], array[k]};

                if (!allPairSum.containsKey(currentSum)) {
                    List<Integer[]> pairGroups = new ArrayList<>();
                    pairGroups.add(pair);
                    allPairSum.put(currentSum, pairGroups);
                } else {
                    allPairSum.get(currentSum).add(pair);
                }
            }
        }
        return quadruplets;
    }
}
