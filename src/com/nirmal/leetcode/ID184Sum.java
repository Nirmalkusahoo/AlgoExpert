package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ID184Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Map<Integer, List<Integer[]>> allPairSum = new HashMap<>();
        List<List<Integer>> resultArray = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            for (int j = i + 1; i < nums.length; j++) {
                int currentSum = nums[i] + nums[j];
                int diff = target - currentSum;
                if (allPairSum.containsKey(diff)) {
                    for (Integer[] pair : allPairSum.get(diff)) {
                        List<Integer> resultPair = new ArrayList<>();
                        resultPair.add(nums[i]);
                        resultPair.add(nums[j]);
                        resultPair.add(pair[0]);
                        resultPair.add(pair[1]);
                        resultArray.add(resultPair);
                    }
                }
            }

            for (int k = 0; k < i; k++) {
                int currentSum = nums[k] + nums[i];
                Integer[] pair = {nums[k], nums[i]};
                if (allPairSum.containsKey(currentSum)) {
                    allPairSum.get(currentSum).add(pair);
                } else {
                    List<Integer[]> pairGroup = new ArrayList<>();
                    pairGroup.add(pair);
                    allPairSum.put(currentSum, pairGroup);
                }
            }
        }

        return resultArray;

    }
}
