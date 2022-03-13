package com.nirmal.leetcode;

public class ID11ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int[] maxLeftHeights = new int[height.length];
        int[] maxRightHeights = new int[height.length];

        int maxLeft = 0;
        for (int i = 0; i < height.length; i++) {
            maxLeftHeights[i] = maxLeft;
            maxLeft = Math.max(height[i], maxLeft);
        }

        int maxRight = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            maxRightHeights[i] = maxRight;
            maxRight = Math.max(height[i], maxRight);
        }

        int total = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] < Math.min(maxLeftHeights[i], maxRightHeights[i])) {
                total = total + Math.min(maxLeftHeights[i], maxRightHeights[i]) - height[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,1}));
//        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
