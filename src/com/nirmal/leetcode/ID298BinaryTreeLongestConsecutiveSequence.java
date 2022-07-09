package com.nirmal.leetcode;

public class ID298BinaryTreeLongestConsecutiveSequence {
    int maxLength = 0;

    public int longestConsecutive(TreeNode root) {
        dfs(root, null, 0);
        return maxLength;
    }

    public void dfs(TreeNode node, TreeNode parent, int length) {
        if (node == null) {
            return;
        }
        if (parent != null && node.val == parent.val + 1) {
            length = length + 1;
        } else {
            length = 1;
        }
        maxLength = Math.max(maxLength, length);
        dfs(node.left, node, length);
        dfs(node.right, node, length);
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
