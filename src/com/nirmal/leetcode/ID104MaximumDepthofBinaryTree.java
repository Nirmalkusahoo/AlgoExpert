package com.nirmal.leetcode;

import java.util.Stack;

public class ID104MaximumDepthofBinaryTree {
   /* public int maxDepth(TreeNode root) {
        return findMaxDepth(root, 1);
    }

    public int findMaxDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth - 1;
        }
        int maxDepth = Integer.MIN_VALUE;

        maxDepth = Math.max(maxDepth, Math.max(findMaxDepth(root.left, depth + 1), findMaxDepth(root.right, depth + 1)));
        return maxDepth;
    }*/

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Stack<Level> stack = new Stack<>();
        stack.add(new Level(1, root));
        int maxDepth = Integer.MIN_VALUE;
        while (!stack.isEmpty()) {
            Level level = stack.pop();
            int depth = level.depth;
            TreeNode node = level.node;
            if (node == null) {
                continue;
            }
            maxDepth = Math.max(depth, maxDepth);
            stack.push(new Level(depth + 1, node.left));
            stack.push(new Level(depth + 1, node.right));
        }
        return maxDepth;
    }

    public static class Level {
        int depth;
        TreeNode node;

        Level(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
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
