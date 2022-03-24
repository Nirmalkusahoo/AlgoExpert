package com.nirmal.leetcode;

public class ID700SearchinaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }

    public static TreeNode search(TreeNode root, int val) {
        TreeNode currentNode = root;

        while (currentNode != null) {
            if (val < currentNode.val) {
                currentNode = currentNode.left;
            } else if (val > currentNode.val) {
                currentNode = currentNode.right;
            } else {
                return currentNode;
            }
        }
        return currentNode;
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
