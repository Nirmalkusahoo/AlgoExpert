package com.nirmal.algoExpert.binaryTree;

import java.util.Stack;

public class AllKindsOfNodeDepths {

    // Solution2:: Stack +recursive
    public static int allKindsOfNodeDepths(BinaryTree root) {
        // Write your code here.

        Stack<BinaryTree> stack = new Stack<>();
        stack.push(root);
        int depthSum = 0;
        while (!stack.isEmpty()) {
            BinaryTree node = stack.pop();
            if (node == null) {
                continue;
            }
            depthSum = depthSum + findNodeDepth(node, 0);
            stack.push(node.left);
            stack.push(node.right);
        }
        return depthSum;
    }

    public static int findNodeDepth(BinaryTree root, int depth) {
        if (root == null) {
            return 0;
        }
        return depth + findNodeDepth(root.left, depth + 1) + findNodeDepth(root.right, depth + 1);
    }

    // Solution2:: recursive
    /*public static int allKindsOfNodeDepths(BinaryTree root) {
        // Write your code here.
        return sumHelper(root, 0, 0);
    }

    public static int sumHelper(BinaryTree root, int depthSum, int depth) {
        if (root == null) {
            return 0;
        }
        depthSum = depthSum + depth;
        return depthSum + sumHelper(root.left, depthSum, depth + 1) + sumHelper(root.right, depthSum, depth + 1);
    }*/

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
