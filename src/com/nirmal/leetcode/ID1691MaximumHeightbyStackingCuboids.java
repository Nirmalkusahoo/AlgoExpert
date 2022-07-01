package com.nirmal.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class ID1691MaximumHeightbyStackingCuboids {
    /*public static int maxHeight(int[][] cuboids) {
        for (int[] a : cuboids)
            Arrays.sort(a);
        Arrays.sort(cuboids, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0])
                    return b[0] - a[0];
                if (a[1] != b[1])
                    return b[1] - a[1];
                return b[2] - a[2];
            }
        });
        int n = cuboids.length, res = 0, dp[] = new int[n];
        for (int j = 0; j < n; ++j) {
            dp[j] = cuboids[j][2];
            for (int i = 0; i < j; ++i) {
                if (cuboids[i][0] >= cuboids[j][0] && cuboids[i][1] >= cuboids[j][1] && cuboids[i][2] >= cuboids[j][2]) {
                    dp[j] = Math.max(dp[j], dp[i] + cuboids[j][2]);
                }
            }
            res = Math.max(res, dp[j]);
        }
        return res;
    }*/

    public static int maxHeight(int[][] cuboids) {
        for (int[] cuboid : cuboids) {
            Arrays.sort(cuboid);
        }

        Arrays.sort(cuboids, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0])
                    return b[0] - a[0];
                if (a[1] != b[1])
                    return b[1] - a[1];
                return b[2] - a[2];
            }
        });

        int[] height = new int[cuboids.length];
        for (int i = 0; i < cuboids.length; i++) {
            height[i] = cuboids[i][2];
        }
        int maxHeight = 0;
        for (int i = 0; i < cuboids.length; i++) {
            int[] currentCuboid = cuboids[i];
            for (int j = 0; j < i; j++) {
                int[] otherCuboid = cuboids[j];

                if (validCuboid(currentCuboid, otherCuboid)) {
                    height[i] = Math.max(height[i], currentCuboid[2] + height[j]);
                }
            }
            maxHeight = Math.max(maxHeight, height[i]);
        }
        return maxHeight;
    }

    public static boolean validCuboid(int[] currentCuboid, int[] otherCuboid) {
        return currentCuboid[0] <= otherCuboid[0] && currentCuboid[1] <= otherCuboid[1] && currentCuboid[2] <= otherCuboid[2];
    }

    public static void main(String[] args) {
        System.out.println(maxHeight(new int[][]{{50, 45, 20}, {95, 37, 53}, {45, 23, 12}}));
    }
}
