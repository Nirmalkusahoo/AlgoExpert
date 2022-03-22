package com.nirmal.leetcode;

public class ID110BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return treeInfo(root).isBalanced;
    }

    public static TreeInfo treeInfo(TreeNode root) {
        if (root == null) {
            return new TreeInfo(0, true);
        }

        TreeInfo leftInfo = treeInfo(root.left);
        TreeInfo rightInfo = treeInfo(root.right);

        int height = 1 + Math.max(leftInfo.height, rightInfo.height);
        boolean isBalanced = leftInfo.isBalanced && rightInfo.isBalanced && Math.abs(leftInfo.height - rightInfo.height) <= 1;
        return new TreeInfo(height, isBalanced);
    }

    public static class TreeInfo {
        public boolean isBalanced;
        public int height;

        TreeInfo(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
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
