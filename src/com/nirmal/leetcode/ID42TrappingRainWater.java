package com.nirmal.leetcode;

public class ID42TrappingRainWater {
    public static int trap(int[] height) {
        int[] maxLeftHeight = new int[height.length];
        int[] maxRightHeight = new int[height.length];
        int maxLeft = 0;
        for (int i = 0; i < height.length; i++) {
            maxLeftHeight[i] = maxLeft;
            maxLeft = Math.max(maxLeft, height[i]);
        }


        int total = 0;
        int rightHeight = 0;
        for (int i = height.length - 1; i > 0; i--) {
            if (Math.min(maxLeftHeight[i], rightHeight) > height[i]) {
                total = total + Math.min(maxLeftHeight[i], rightHeight) - height[i];
            }
            rightHeight = Math.max(height[i], rightHeight);

        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3}));
    }
}
