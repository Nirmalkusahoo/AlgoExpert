package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ID230KthSmallestElementinaBST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list.get(k-1);
    }

    public static void inOrder(TreeNode tree, List<Integer> list) {
        if (tree == null) {
            return;
        }
        inOrder(tree.left, list);
        list.add(tree.val);
        inOrder(tree.right, list);
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
