package com.nirmal.leetcode;

public class ID1470ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }

    // Solution 2:
    /*public static int[] shuffle(int[] nums, int n) {
        int i = n;
        int firstIndex = 0;
        int firstNewIndex = 0;
        int[] result = new int[2 * n];
        while (i < 2 * n) {
            result[firstNewIndex] = nums[firstIndex];
            result[firstNewIndex + 1] = nums[i];
            i++;
            firstIndex++;
            firstNewIndex = firstNewIndex + 2;
        }
        for (int a : result) {
            System.out.print(a + " ");
        }
        return result;
    }*/

    public static void main(String[] args) {
        shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4);
    }
}
