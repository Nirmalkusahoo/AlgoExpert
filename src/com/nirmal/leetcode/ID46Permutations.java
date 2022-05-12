package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ID46Permutations {
    public static List<List<Integer>> permute(int[] nums) {

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
        } else {
            for (int j = i; j < array.length; j++) {
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

    // Solution 2: using Map - easier to understand
   /* public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        find(nums, visited, result, new ArrayList<>());
        return result;
    }

    public static void find(int[] nums, boolean[] visited, List<List<Integer>> result, List<Integer> current) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    current.add(nums[i]);
                    find(nums, visited, result, current);
                    current.remove(current.size()-1);
                    visited[i] = false;
                }
            }
        }
    }*/

    public static void main(String[] args) {
        permute(new int[]{1,2,3});
    }
}
