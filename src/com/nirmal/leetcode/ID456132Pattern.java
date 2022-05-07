package com.nirmal.leetcode;

import java.util.Stack;

public class ID456132Pattern {
    public static boolean find132pattern(int[] nums) {
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min[i] = Math.min(min[i - 1], nums[i]);
        }

        Stack<Integer> stack = new Stack();

        for (int j = nums.length - 1; j >= 0; j--) {
            while (!stack.isEmpty() && nums[j] > stack.peek()) {
                if (stack.peek() > min[j]) {
                    return true;
                }
                stack.pop();
            }
            stack.push(nums[j]);
        }
        return false;
    }
}
