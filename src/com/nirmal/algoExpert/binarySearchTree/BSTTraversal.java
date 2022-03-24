package com.nirmal.algoExpert.binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class BSTTraversal {
    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        inOrder(tree, list);
        return list;
    }

    public static void inOrder(BST tree, List<Integer> list) {
        if (tree == null) {
            return;
        }
        inOrder(tree.left, list);
        list.add(tree.value);
        inOrder(tree.right, list);
    }

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        preOrder(tree, list);
        return list;
    }

    public static void preOrder(BST tree, List<Integer> list) {
        if (tree == null) {
            return;
        }
        list.add(tree.value);
        preOrder(tree.left, list);
        preOrder(tree.right, list);
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        postOrder(tree, list);
        return list;
    }

    public static void postOrder(BST tree, List<Integer> list) {
        if (tree == null) {
            return;
        }
        postOrder(tree.left, list);
        postOrder(tree.right, list);
        list.add(tree.value);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
