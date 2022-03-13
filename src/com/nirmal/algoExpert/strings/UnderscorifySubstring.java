package com.nirmal.algoExpert.strings;

import java.util.ArrayList;
import java.util.List;

public class UnderscorifySubstring {
    public static String underscorifySubstring(String str, String substring) {
        // Write your code here.
        List<Integer[]> locations = collpase(getLocations(str, substring));
        return underScorify(str, locations);
    }

    public static List<Integer[]> getLocations(String str, String subString) {
        int startIdx = 0;
        List<Integer[]> locations = new ArrayList<>();
        while (startIdx < str.length()) {
            int nextIdx = str.indexOf(subString, startIdx);
            if (nextIdx != -1) {
                locations.add(new Integer[]{nextIdx, nextIdx+ subString.length()});
                startIdx = nextIdx + 1;
            } else {
                break;
            }
        }
        return locations;
    }

    public static List<Integer[]> collpase(List<Integer[]> locations) {
        if (locations.size() == 0) {
            return locations;
        }

        List<Integer[]> newLocations = new ArrayList<>();
        newLocations.add(locations.get(0));
        Integer[] previous = locations.get(0);
        for (int i = 1; i < locations.size(); i++) {
            Integer[] current = locations.get(i);
            if (current[0] <= previous[1]) {
                previous[1] = current[1];
            } else {
                newLocations.add(current);
                previous = current;
            }
        }
        return newLocations;
    }

    public static String underScorify(String str, List<Integer[]> locations) {
        int locationIdx = 0;
        int stringIdx = 0;
        boolean isBetweenUnderScore = false;
        int i = 0;
        List<String> finalString = new ArrayList<>();
        while (stringIdx < str.length() && locationIdx < locations.size()) {
            if (stringIdx == locations.get(locationIdx)[i]) {
                finalString.add("_");
                isBetweenUnderScore = !isBetweenUnderScore;
                if (!isBetweenUnderScore) {
                    locationIdx++;
                }
                i = i == 1 ? 0 : 1;
            }
            finalString.add(String.valueOf(str.charAt(stringIdx)));
            stringIdx=stringIdx+1;
        }

        if (locationIdx < locations.size()) {
            finalString.add("_");
        } else if (stringIdx < str.length()) {
            finalString.add(str.substring(stringIdx));
        }
        return String.join("", finalString);
    }
}
