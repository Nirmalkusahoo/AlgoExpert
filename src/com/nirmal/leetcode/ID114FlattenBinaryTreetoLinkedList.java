package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ID114FlattenBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preOrder(root, list);
        TreeNode currentNode = root;
        for (int i = 1; i < list.size(); i++) {
            currentNode.left = null;
            currentNode.right = list.get(i);
            currentNode = currentNode.right;
        }
    }

    public static void preOrder(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        list.add(root);
        preOrder(root.left, list);
        preOrder(root.right, list);
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
