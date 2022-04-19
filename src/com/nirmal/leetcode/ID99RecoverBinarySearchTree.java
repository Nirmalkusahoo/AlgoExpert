package com.nirmal.leetcode;

public class ID99RecoverBinarySearchTree {
    TreeNode prev;
    TreeNode first;
    TreeNode middle;
    TreeNode last;

    public void recoverTree(TreeNode root) {
        prev = new TreeNode(Integer.MIN_VALUE);
        first = middle = last = null;
        inOrder(root);

        if (first != null && last != null) {
            int temp = first.val;
            ;
            first.val = last.val;
            last.val = temp;
        } else if (first != null && middle != null) {
            int temp = first.val;
            ;
            first.val = middle.val;
            middle.val = temp;
        }
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);

        if (root.val < prev.val) {
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }

        prev = root;
        inOrder(root.right);
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
