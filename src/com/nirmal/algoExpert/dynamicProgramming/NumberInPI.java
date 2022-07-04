package com.nirmal.algoExpert.dynamicProgramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberInPI {
    public static int numbersInPi(String pi, String[] numbers) {
        // Write your code here.
        Set<String> numberStable = new HashSet<>();
        for (String num : numbers) {
            numberStable.add(num);
        }

        Map<Integer, Integer> cache = new HashMap<>();

        int minSpaces = getMinSpaces(pi, numberStable, cache, 0);
        return minSpaces == Integer.MAX_VALUE ? -1 : minSpaces;
    }

    public static int getMinSpaces(String pi, Set<String> numberStable, Map<Integer, Integer> cache, int idx) {
        if (idx == pi.length()) {
            return -1;
        }
        if (cache.containsKey(idx)) {
            return cache.get(idx);
        }

        int minSpaces = Integer.MAX_VALUE;
        for (int i = idx; i < pi.length(); i++) {
            String prefix = pi.substring(idx, i + 1);
            if (numberStable.contains(prefix)) {
                int minSpaceInSuffix = getMinSpaces(pi, numberStable, cache, i + 1);
                if (minSpaceInSuffix == Integer.MAX_VALUE) {
                    minSpaces = Math.min(minSpaces, minSpaceInSuffix);
                } else {
                    minSpaces = Math.min(minSpaces, minSpaceInSuffix + 1);
                }

            }
        }
        cache.put(idx, minSpaces);
        return minSpaces;
    }
}
