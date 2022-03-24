package com.nirmal.leetcode;

public class ID108ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode();
        return find(null, nums, 0, nums.length - 1);
    }

    public static TreeNode find(TreeNode root, int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int m = (start + end) / 2;
        if (root == null) {
            root = new TreeNode(nums[m]);
        } else {
            insert(root, nums[m]);
        }
        find(root, nums, start, m - 1);
        find(root, nums, m + 1, end);
        return root;
    }

    public static void insert(TreeNode root, int num) {
        if (root == null) {
            root = new TreeNode(num);
        }
        if (num < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(num);
            } else {
                insert(root.left, num);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(num);
            } else {
                insert(root.right, num);
            }
        }
    }

    public static class TreeNode {
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
