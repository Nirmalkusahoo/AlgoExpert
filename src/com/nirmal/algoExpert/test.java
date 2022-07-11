package com.nirmal.algoExpert;

import java.util.HashSet;
import java.util.Set;

public class test {

    public int firstDuplicateValue(int[] array) {
        // Write your code here.
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            if (set.add(i)) {
            } else {
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]) {
        test obj = new test();
    }
}
