package com.nirmal.algoExpert.binarySearchTree;

public class BSTConstruction {
    static class BST{
        public int value;
        public BST left;
        public BST right;
        BST(int value){
            this.value=value;
        }
    }

    public BST root;
    public BST insert(int value){

        return insert(2,root);
    }

    public BST insert(int value,BST root){
        if(root == null){
            return new BST(value);
        }
        if(value<root.value){
            root.left=insert(value,root.left);
        } else {
            root.right=insert(value,root.right);
        }
        return root;
    }
    public boolean contains(int value){
        return contains(value,root);
    }
    public boolean contains(int value,BST root){
        if (root == null){
            return false;
        } else if(root.value == value){
            return true;
        }

        if(value<root.value){
            return contains(value,root.left);
        } else {
            return contains(value,root.right);
        }
    }

    /*public BST remove(int value){
        return remove(value,root,root);
    }*/

    public void remove(int value,BST root){

    }
}
