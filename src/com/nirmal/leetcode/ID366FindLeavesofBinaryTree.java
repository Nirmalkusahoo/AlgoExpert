package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ID366FindLeavesofBinaryTree {


    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        findHeights(root, list);
        return list;
    }

    public static int findHeights(TreeNode root, List<List<Integer>> list) {
        if (root == null) {
            return -1;
        }

        int leftHeight = findHeights(root.left, list);
        int rightHeight = findHeights(root.right, list);
        int height = 1 + Math.max(leftHeight, rightHeight);

        if (list.size() == height) {
            list.add(new ArrayList<>());
        }
        list.get(height).add(root.val);
        return height;
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
