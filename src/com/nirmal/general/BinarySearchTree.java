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
    public static class Tree {
        int value;
        Tree left;
        Tree right;

        Tree(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(7);
        binarySearchTree.insert(1);
        binarySearchTree.inOrder();

        if(binarySearchTree.search(1) !=null){
            System.out.println();
            System.out.println("Key found");
        }
        if(binarySearchTree.search(10) !=null){
            System.out.println("Key Found");
        } else {
            System.out.println("Key not found");
        }
    }
}
