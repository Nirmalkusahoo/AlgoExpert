package com.nirmal.algoExpert.arrays;

import java.util.HashSet;
import java.util.Set;

public class MinimumAreaRectangle {
    public static int minimumAreaRectangle(int[][] points) {
        // Write your code here.
        Set<String> pointSet = createSet(points);
        int minArea = Integer.MAX_VALUE;
        for (int currentIdx = 0; currentIdx < points.length; currentIdx++) {
            int p1x = points[currentIdx][0];
            int p1y = points[currentIdx][1];

            for (int previousIdx = currentIdx; previousIdx < points.length; previousIdx++) {
                int p2x = points[previousIdx][0];
                int p2y = points[previousIdx][1];

                boolean isPointMatches = p1x == p2x || p1y == p2y;

                if (isPointMatches) {
                    continue;
                }

                boolean isOppositeToP1Exist = pointSet.contains(convert(p1x, p2y));
                boolean isOppositeToP2Exist = pointSet.contains(convert(p2x, p1y));

                if (isOppositeToP1Exist && isOppositeToP2Exist) {
                    int width = Math.abs(p1x - p2x);
                    int height = Math.abs(p1y - p2y);

                    int area = width * height;
                    minArea = Math.min(area, minArea);
                }
            }
        }
        return minArea != Integer.MAX_VALUE ? minArea : 0;
    }

    public static String convert(int x, int y) {
        return String.valueOf(x) + ":" + String.valueOf(y);
    }

    public static Set<String> createSet(int[][] points) {
        Set<String> set = new HashSet<>();

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            String converted = convert(x, y);
            set.add(converted);
        }
        return set;
    }

}
