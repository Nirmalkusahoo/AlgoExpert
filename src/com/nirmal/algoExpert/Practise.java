package com.nirmal.algoExpert;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practise {
    Set<String> pointSet = new HashSet<>();
    int minArea = Integer.MAX_VALUE;

    public int minimumAreaRectangle(int[][] points) {
        // Write your code here.
        prepareSet(points);

        for (int i = 0; i < points.length; i++) {
            int p1x = points[i][0];
            int p1y = points[i][1];
            for (int j = 0; j < i; j++) {
                int p2x = points[j][0];
                int p2y = points[j][1];

                boolean sharedSameIndex = p1x == p2x || p1y == p2y;
                if (sharedSameIndex) {
                    continue;
                }
                boolean firstOppositeFound = pointSet.contains(format(p1x, p2y));
                boolean secondOppositeFound = pointSet.contains(format(p2x, p1y));
                if (firstOppositeFound && secondOppositeFound) {
                    int area = Math.abs(p1x - p2x) * Math.abs(p1y - p2y);
                    minArea = Math.min(minArea, area);
                }

            }
        }
        return minArea == Integer.MAX_VALUE ? 0 : minArea;
    }

    public void prepareSet(int[][] points) {
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int x = point[0];
            int y = point[1];
            pointSet.add(format(x, y));
        }
    }

    public String format(int x, int y) {
        return String.valueOf(x) + ":" + String.valueOf(y);
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(3, 3, 3, 3, 3);
        List<Integer> sequence = Arrays.asList(22, 25, 6);
        System.out.println(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }


}
