package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ID47PermutationsII {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        getPermutations(0, nums, list);

        return list;
    }

    public static void getPermutations(int i, int[] array, List<List<Integer>> list) {
        if (array.length - 1 == i) {
            List<Integer> finalList = new ArrayList<Integer>();
            for (int num : array) {
                finalList.add(num);
            }
            list.add(finalList);
        }
        Set<Integer> appeared = new HashSet<>();
        for (int j = i; j < array.length; j++) {
            if (appeared.add(array[j])) {
                swap(i, j, array);
                getPermutations(i + 1, array, list);
                swap(i, j, array);
            }

        }
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1, 1, 2}));
    }
}
