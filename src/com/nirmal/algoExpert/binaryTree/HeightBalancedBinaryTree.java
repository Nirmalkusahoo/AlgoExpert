package com.nirmal.algoExpert.binaryTree;

public class HeightBalancedBinaryTree {
    public boolean heightBalancedBinaryTree(BinaryTree tree) {
        // Write your code here.

        TreeInfo treeInfo = getTreeInfo(tree);
        return treeInfo.isBalanced;
    }


    public TreeInfo getTreeInfo(BinaryTree tree) {
        if (tree == null) {
            return new TreeInfo(true, -1);
        }

        TreeInfo leftTree = getTreeInfo(tree.left);
        TreeInfo rightTree = getTreeInfo(tree.right);

        boolean isBalanced = false;
        if (leftTree.isBalanced && rightTree.isBalanced && Math.abs(leftTree.height - rightTree.height) <= 1) {
            isBalanced = true;
        }
        int height = 1 + Math.max(leftTree.height, rightTree.height);

        return new TreeInfo(isBalanced, height);
    }

    public static class TreeInfo {
        boolean isBalanced;
        int height;

        TreeInfo(boolean isBalanced, int height) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
        }
    }
}
