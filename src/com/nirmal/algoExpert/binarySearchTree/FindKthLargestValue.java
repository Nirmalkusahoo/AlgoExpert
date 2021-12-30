package com.nirmal.algoExpert.binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class FindKthLargestValue {
    public static class BST {
        int value;
        BST left;
        BST right;

        BST(int value) {
            this.value = value;
        }
    }

    //Solution 1
   /* public int findKthLargestValueInBst(BST tree, int k) {
        // Write your code here.

        List<Integer> sortedValues = new ArrayList<Integer>();
        inorderTraversal(tree, sortedValues);
        return sortedValues.get(sortedValues.size() - k);
    }

    public void inorderTraversal(BST tree, List<Integer> sortedValues) {
        if (tree == null) {
            return;
        }
        inorderTraversal(tree.left, sortedValues);
        sortedValues.add(tree.value);
        inorderTraversal(tree.right, sortedValues);
    }*/

    // Solution 2
    public int findKthLargestValueInBst(BST tree, int k) {
        // Write your code here.
        TreeInfo treeInfo= new TreeInfo(-1,0);
        reverseInorderTraversal(tree,k,treeInfo);
        return treeInfo.nodeValue;
    }

    public static void reverseInorderTraversal(BST tree, int k,TreeInfo treeInfo){
        if(tree == null || treeInfo.numberOfVisit>=k){
            return;
        }
        reverseInorderTraversal(tree.right,k,treeInfo);
        if(treeInfo.numberOfVisit<k){
            treeInfo.nodeValue= tree.value;
            treeInfo.numberOfVisit= treeInfo.numberOfVisit+1;
            reverseInorderTraversal(tree.left,k,treeInfo);
        }
    }

    public static class TreeInfo{
        int nodeValue;
        int numberOfVisit;
        TreeInfo(int value,int numberOfVisit){
            this.nodeValue=value;
            this.numberOfVisit=numberOfVisit;
        }
    }
}
