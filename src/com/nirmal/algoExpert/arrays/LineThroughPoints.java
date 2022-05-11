package com.nirmal.algoExpert.arrays;

import java.util.HashMap;
import java.util.Map;

public class LineThroughPoints {
    public int lineThroughPoints(int[][] points) {
        // Write your code here.

        int maxPointsInALine = 1;
        for (int i = 0; i < points.length; i++) {
            int[] p1 = points[i];
            Map<String, Integer> pointCount = new HashMap<>();

            for (int j = i + 1; j < points.length; j++) {
                int[] p2 = points[j];

                int[] slope = findSlope(p1, p2);
                int rise = slope[0];
                int run = slope[1];

                String slopeKey = makeKey(rise, run);
                if (!pointCount.containsKey(slopeKey)) {
                    pointCount.put(slopeKey, 1);
                }
                pointCount.put(slopeKey, pointCount.get(slopeKey) + 1);
            }
            int currentMax = findMax(pointCount);
            maxPointsInALine = Math.max(currentMax, maxPointsInALine);
        }
        return maxPointsInALine;
    }

    public static int findMax(Map<String, Integer> pointCount) {
        int max = 0;

        for (String key : pointCount.keySet()) {
            if (pointCount.get(key) > max) {
                max = pointCount.get(key);
            }
        }
        return max;
    }

    public static String makeKey(int numerator, int denominator) {
        return String.valueOf(numerator) + ":" + String.valueOf(denominator);
    }

    public static int[] findSlope(int[] p1, int[] p2) {
        int p1x = p1[0];
        int p1y = p1[1];
        int p2x = p2[0];
        int p2y = p2[1];

        int[] slope = new int[]{1, 0};
        if (p1x != p2x) {
            int xDiff = p1x - p2x;
            int yDiff = p1y - p2y;

            int gcd = findGreatestCommonDivisor(Math.abs(xDiff), Math.abs(yDiff));
            xDiff = xDiff / gcd;
            yDiff = yDiff / gcd;

            if (xDiff < 0) {
                xDiff = xDiff * -1;
                yDiff = yDiff * -1;
            }

            slope = new int[]{yDiff, xDiff};
        }
        return slope;
    }

    public static int findGreatestCommonDivisor(int num1, int num2) {
        int a = num1;
        int b = num2;
        while (true) {
            if (a == 0) {
                return b;
            }
            if (b == 0) {
                return a;
            }
            int temp = a;
            a = b;
            b = temp % b;
        }
    }
}
