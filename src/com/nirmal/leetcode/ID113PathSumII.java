package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ID113PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        prepareSum(root, targetSum, list, 0, new ArrayList<Integer>());
        return list;
    }

    public static void prepareSum(TreeNode root, int targetSum, List<List<Integer>> list, int currentSum, List<Integer> currentList) {
        if (root == null) {
            return;
        }

        currentSum = currentSum + root.val;
        currentList.add(root.val);
        if (root.left == null & root.right == null) {
            if (currentSum == targetSum) {
                list.add(currentList);
                return;
            }
        }
        prepareSum(root.left, targetSum, list, currentSum, new ArrayList<>(currentList));
        prepareSum(root.right, targetSum, list, currentSum, new ArrayList<>(currentList));

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
