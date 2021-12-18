package com.nirmal.algoExpert.stack;

import java.util.ArrayList;
import java.util.Collections;

public class SunSetViews {
    public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.

        ArrayList<Integer> buildingsWithSunsetViews = new ArrayList<Integer>();

        int startIdx = buildings.length - 1;
        int step = -1;

        if (direction.equals("WEST")) {
            startIdx = 0;
            step = 1;
        }
        int currentMaxHeight = 0;
        int idx = startIdx;
        while (idx >= 0 && idx < buildings.length) {
            int currentBuildingHeight = buildings[idx];
            if (currentBuildingHeight > currentMaxHeight) {
                buildingsWithSunsetViews.add(idx);
                currentMaxHeight = currentBuildingHeight;
            }
            idx = idx + step;
        }

        if (direction.equals("EAST")) {
            Collections.reverse(buildingsWithSunsetViews);
        }
        return buildingsWithSunsetViews;
    }
}
