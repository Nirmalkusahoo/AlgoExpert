package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ID124BinaryTreeMaximumPathSum {

    public int maxPathSum(TreeNode root) {
        List<Integer> maxSumList = findSum(root);
        return maxSumList.get(1);
    }

    public List<Integer> findSum(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>(Arrays.asList(0, Integer.MIN_VALUE));
        }

        List<Integer> leftMaxSumArray = findSum(root.left);
        Integer leftMaxSumAsBranch = leftMaxSumArray.get(0);
        Integer leftMaxPathSum = leftMaxSumArray.get(1);

        List<Integer> rightMaxSumArray = findSum(root.right);
        Integer rightMaxSumAsBranch = rightMaxSumArray.get(0);
        Integer rightMaxPathSum = rightMaxSumArray.get(1);

        Integer childMaxSumAsBranch = Math.max(leftMaxSumAsBranch, rightMaxSumAsBranch);
        Integer maxSumAsBranch = Math.max(childMaxSumAsBranch + root.val, root.val);
        Integer maxSumAsRoot = Math.max(maxSumAsBranch, leftMaxSumAsBranch + root.val + rightMaxSumAsBranch);
        Integer maxPathSum = Math.max(leftMaxPathSum, Math.max(rightMaxPathSum, maxSumAsRoot));

        return new ArrayList<>(Arrays.asList(maxSumAsBranch, maxPathSum));
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
