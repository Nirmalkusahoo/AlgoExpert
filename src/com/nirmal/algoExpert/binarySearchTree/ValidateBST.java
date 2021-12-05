package com.nirmal.algoExpert.binarySearchTree;

public class ValidateBST {
    public static class BST{
        int value;
        public BST left;
        public BST right;
        BST(int value){
            this.value=value;
        }
    }

    public static boolean validateBst(BST tree) {
        // Write your code here.
        return validateHelper(tree, Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static boolean validateHelper(BST tree,int minValue,int maxValue){

        if(tree.value<minValue || tree.value>=maxValue){
            return false;
        }

        if(tree.left !=null && !validateHelper(tree.left,minValue,tree.value)){
            return false;
        }

        if(tree.right !=null && !validateHelper(tree.right,tree.value,maxValue)){
            return false;
        }
        return true;
    }
}
