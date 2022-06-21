package com.nirmal.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ID359LoggerRateLimiter {
    Map<String, Integer> map = new HashMap<>();

    public void Logger() {

    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (map.containsKey(message)) {
            if (timestamp >= map.get(message)) {
                map.put(message, timestamp + 10);
                return true;
            } else {
                return false;
            }
        } else {
            map.put(message, timestamp + 10);
            return true;
        }
    }

    public static void main(String[] args) {
        ID359LoggerRateLimiter logger = new ID359LoggerRateLimiter();
        System.out.println(logger.shouldPrintMessage(1, "foo"));  // return true, next allowed timestamp for "foo" is 1 + 10 = 11
        System.out.println(logger.shouldPrintMessage(2, "bar"));  // return true, next allowed timestamp for "bar" is 2 + 10 = 12
        System.out.println(logger.shouldPrintMessage(3, "foo"));  // 3 < 11, return false
        System.out.println(logger.shouldPrintMessage(8, "bar"));  // 8 < 12, return false
        System.out.println(logger.shouldPrintMessage(10, "foo")); // 10 < 11, return false
        System.out.println(logger.shouldPrintMessage(11, "foo"));
    }
}
