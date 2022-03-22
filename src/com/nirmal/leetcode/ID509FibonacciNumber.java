package com.nirmal.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ID509FibonacciNumber {
    public int fib(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);

        return getFib(n, map);


    }

    public static int getFib(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int value = getFib(n - 1, map) + getFib(n - 2, map);
            map.put(n, value);
            return value;
        }
    }
}
