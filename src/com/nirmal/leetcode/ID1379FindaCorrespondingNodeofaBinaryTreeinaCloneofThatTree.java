package com.nirmal.leetcode;

public class ID1379FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode target, res;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        inOrder(original, cloned);
        return res;
    }

    public void inOrder(TreeNode original, TreeNode cloned) {
        if (original != null) {
            inOrder(original.left, cloned.left);
            if (original == target) {
                res = cloned;
            }
            inOrder(original.right, cloned.right);
        }
    }

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node19 = new TreeNode(19);
        node7.left = node4;
        node7.right = node3;
        node3.left = node6;
        node3.right = node19;
        ID1379FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree obj = new ID1379FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree();
        System.out.println(obj.getTargetCopy(node7, node7, new TreeNode(7)));
    }
}
