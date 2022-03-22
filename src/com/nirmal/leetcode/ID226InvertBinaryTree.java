package com.nirmal.leetcode;

public class ID226InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    public void invert(TreeNode root) {
        if (root == null) {
            return;
        }
        swap(root);
        invert(root.left);
        invert(root.right);
    }

    public static void swap(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
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
