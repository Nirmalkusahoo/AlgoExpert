package com.nirmal.algoExpert.graphs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RectangleMania {
    public static int rectangleMania(List<Integer[]> coords) {
        // Write your code here.
        Set<String> pointSet = getPointSet(coords);
        return getRectangleCount(coords, pointSet);
    }

    public static int getRectangleCount(List<Integer[]> coords, Set<String> pointSet) {
        int count = 0;
        for (Integer[] coord1 : coords) {
            for (Integer[] coord2 : coords) {
                if (!isInUpperRight(coord1, coord2)) {
                    continue;
                }
                String upperCoordinate = coordinateString(new Integer[]{coord1[0], coord2[1]});
                String rightCoordinate = coordinateString(new Integer[]{coord2[0], coord1[1]});
                if (pointSet.contains(upperCoordinate) && pointSet.contains(rightCoordinate)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isInUpperRight(Integer[] coord1, Integer[] coord2) {
        return coord2[0] > coord1[0] && coord2[1] > coord1[1];
    }

    public static Set<String> getPointSet(List<Integer[]> coords) {
        Set<String> pointSet = new HashSet<>();
        for (Integer[] coordinate : coords) {
            pointSet.add(coordinateString(coordinate));
        }
        return pointSet;
    }

    public static String coordinateString(Integer[] coordinate) {
        return Integer.toString(coordinate[0]) + ":" + Integer.toString(coordinate[1]);
    }

}
