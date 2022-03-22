package com.nirmal.leetcode;

public class ID543DiameterofBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        return getTreeInfo(root).diameter;
    }

    public static TreeInfo getTreeInfo(TreeNode root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTreeInfo = getTreeInfo(root.left);
        TreeInfo rightTreeInfo = getTreeInfo(root.right);

        int maxPathSoFar = leftTreeInfo.height + rightTreeInfo.height;
        int maxDiameterSoFar = Math.max(leftTreeInfo.diameter, rightTreeInfo.diameter);
        int currentDiamter = Math.max(maxDiameterSoFar, maxPathSoFar);
        int currentHeight =1 + Math.max(leftTreeInfo.height, rightTreeInfo.height);

        return new TreeInfo(currentHeight, currentDiamter);
    }

    public static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
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
