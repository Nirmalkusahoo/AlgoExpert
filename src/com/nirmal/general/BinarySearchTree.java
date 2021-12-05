package com.nirmal.general;

public class BinarySearchTree {
    public Tree root;

    public void insert(int value) {
        root = insert(value, root);
    }

    public Tree insert(int value, Tree root) {
        if (root == null) {
            Tree node = new Tree(value);
            return node;
        }
        if (value < root.value) {
            root.left = insert(value, root.left);
        } else {
            root.right = insert(value, root.right);
        }
        return root;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Tree node) {
        if (root == null) {
            return;
        }
        if (node.left != null) {
            inOrder(node.left);
        }
        System.out.print(node.value +" ");
        if (node.right != null) {
            inOrder(node.right);
        }
    }
    public Tree search(int key){
        return search(key,root);
    }
    public Tree search(int key, Tree root){
        if(root ==null || key==root.value){
            return root;
        }

        if(key<root.value){
            return search(key,root.left);
        } else {
            return search(key,root.right);
        }
    }

    public void remove(int key){
        remove(key,root,null);
    }
    public void remove(int key, Tree root,Tree parentNode){
        Tree currentNode=root;

        while(currentNode !=null){
            if(key<currentNode.value){
                parentNode=currentNode;
                currentNode=currentNode.left;
            } else if(key> currentNode.value){
                parentNode=currentNode;
                currentNode=currentNode.right;
            } else {
                if(currentNode.left !=null && currentNode.right !=null){
                    currentNode.value=getMinValue(currentNode.right);
                    remove(currentNode.value,currentNode.right,null);
                }
                if(parentNode.left.value==key){
                    currentNode=null;
                    parentNode.left=null;
                } else {
                    currentNode=null;
                    parentNode.right=null;
                }
            }
        }
    }

    public int getMinValue(Tree root){
        if(root.left==null){
            return root.value;
        } else {
            return getMinValue(root.left);
        }
    }
    public static class Tree {
        int value;
        Tree left;
        Tree right;

        Tree(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        bst.insert(6);
        bst.insert(8);
        bst.inOrder();

       /* if(binarySearchTree.search(1) !=null){
            System.out.println();
            System.out.println("Key found");
        }
        if(binarySearchTree.search(10) !=null){
            System.out.println("Key Found");
        } else {
            Sys
            tem.out.println("Key not found");
        }*/
        System.out.println("After removing ");
//        bst.remove(7);
        bst.remove(5);
        bst.inOrder();
    }
}
