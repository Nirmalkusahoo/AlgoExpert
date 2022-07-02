package com.nirmal.algoExpert.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximizeExpression {
    public int maximizeExpression(int[] array) {
        // Write your code here.
        if (array.length < 4) {
            return 0;
        }

        List<Integer> aList = new ArrayList<>(Arrays.asList(array[0]));
        List<Integer> abList = new ArrayList<>(Arrays.asList(Integer.MIN_VALUE));
        List<Integer> abcList = new ArrayList<>(Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE));
        List<Integer> abcdList = new ArrayList<>(Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));

        for (int i = 1; i < array.length; i++) {
            int currentMax = Math.max(aList.get(i - 1), array[i]);
            aList.add(currentMax);
        }
        for (int i = 1; i < array.length; i++) {
            int currentMax = Math.max(abList.get(i - 1), aList.get(i - 1) - array[i]);
            abList.add(currentMax);
        }
        for (int i = 2; i < array.length; i++) {
            int currentMax = Math.max(abcList.get(i - 1), abList.get(i - 1) + array[i]);
            abcList.add(currentMax);
        }
        for (int i = 3; i < array.length; i++) {
            int currentMax = Math.max(abcdList.get(i - 1), abcList.get(i - 1) - array[i]);
            abcdList.add(currentMax);
        }
        return abcdList.get(abcdList.size() - 1);
    }
}
