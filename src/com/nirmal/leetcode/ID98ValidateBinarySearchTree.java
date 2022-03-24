package com.nirmal.leetcode;

public class ID98ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isValid(TreeNode node, int minValue, int maxValue) {
        if (node.val < minValue || node.val >= maxValue) {
            return false;
        }

        if (node.left != null && !isValid(node.left, minValue, node.val)) {
            return false;
        }
        if (node.right != null && !isValid(node.right, node.val, maxValue)) {
            return false;
        }
        return true;
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
