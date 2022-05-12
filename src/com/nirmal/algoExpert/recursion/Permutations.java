package com.nirmal.algoExpert.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        // Write your code here.
        List<List<Integer>> list = new ArrayList<>();
        getPermutations(0, array, list);
        return list;
    }

    public static void getPermutations(int i, List<Integer> array, List<List<Integer>> list) {
        if (array.size() - 1 == i) {
            list.add(new ArrayList<>(array));
        } else {
            for (int j = i; j < array.size(); j++) {
                swap(i, j, array);
                getPermutations(i+1,array,list);
                swap(i,j,array);
            }
        }
    }

    public static void swap(int i, int j, List<Integer> array) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

    public static void main(String[] args) {

    }
}
