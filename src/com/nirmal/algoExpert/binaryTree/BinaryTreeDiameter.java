package com.nirmal.algoExpert.binaryTree;

public class BinaryTreeDiameter {
    static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;
        BinaryTree(int value){
            this.value=value;
        }
    }

    public int binaryTreeDiameter(BinaryTree tree) {
        // Write your code here.
        return getTreeInfo(tree).diameter;

    }

    public TreeInfo getTreeInfo(BinaryTree tree){
        if(tree ==null){
            return new TreeInfo(0,0);
        }

        TreeInfo leftTree=getTreeInfo(tree.left);
        TreeInfo rightTree=getTreeInfo(tree.right);

        int longestPathThroughRoot=leftTree.height+ rightTree.height;
        int maxDiameterSoFar=Math.max(leftTree.diameter,rightTree.diameter);
        int currentDiameter= Math.max(maxDiameterSoFar,longestPathThroughRoot);
        int height=1+Math.max(leftTree.height,rightTree.height);

        return new TreeInfo(currentDiameter,height);
    }

    static class TreeInfo{
        public int diameter;
        public int height;
        TreeInfo(int diameter,int height){
            this.diameter=diameter;
            this.height=height;
        }
    }
}
