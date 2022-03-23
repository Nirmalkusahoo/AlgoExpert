package com.nirmal.leetcode;

public class ID270ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root, double target) {
        double diff=Integer.MAX_VALUE;
        int closetValue=0;

        TreeNode currentNode=root;
        while (currentNode !=null){
            double currentDiff=Math.abs(currentNode.val-target);
            if(currentDiff<diff){
                closetValue= currentNode.val;
                diff= Math.min(diff,currentDiff);
            }

            if(target<currentNode.val){
                currentNode=currentNode.left;
            } else if(target>currentNode.val){
                currentNode=currentNode.right;
            } else {
                return currentNode.val;
            }
        }
        return closetValue;
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
