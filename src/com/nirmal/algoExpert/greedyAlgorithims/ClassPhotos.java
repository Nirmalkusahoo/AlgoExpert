package com.nirmal.algoExpert.greedyAlgorithims;

import java.util.ArrayList;
import java.util.Collections;

public class ClassPhotos {
    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        // Write your code here.
        Collections.sort(redShirtHeights, Collections.reverseOrder());
        Collections.sort(blueShirtHeights, Collections.reverseOrder());

        String shirtInFirstRow = redShirtHeights.get(0) > blueShirtHeights.get(0) ? "BLUE" : "RED";

        for (int i = 0; i < redShirtHeights.size(); i++) {
            if (shirtInFirstRow == "RED") {
                if (redShirtHeights.get(i) >= blueShirtHeights.get(i)) {
                    return false;
                }
            } else {
                if (blueShirtHeights.get(i) >= redShirtHeights.get(i)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
