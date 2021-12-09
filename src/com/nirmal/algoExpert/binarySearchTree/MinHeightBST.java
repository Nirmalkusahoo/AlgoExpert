package com.nirmal.algoExpert.binarySearchTree;

import java.util.List;

public class MinHeightBST {

    static BST root;

    public static BST minHeightBst(List<Integer> array) {
        // Write your code here.
        return createMinHeightBST(array, 0, array.size() - 1, null);
    }

    public static BST createMinHeightBST(List<Integer> array, int start, int end, BST bst) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        int valueToAdd= array.get(mid);
        if (bst == null) {
            bst = new BST(valueToAdd);
        } else {
            insert(valueToAdd);
        }
        createMinHeightBST(array, start, mid - 1, bst);
        createMinHeightBST(array, mid + 1, end, bst);
        return bst;
    }

    public static class BST {
        int value;
        BST left;
        BST right;

        BST(int value) {
            this.value = value;
        }
    }

    public static void insert(int value) {
        insert(value, root);
    }

    public static void insert(int value, BST root) {
        if (value < root.value) {
            if (root.right == null) {
                root.right = new BST(value);
            } else {
                insert(value, root.right);
            }
        } else {
            if (root.left == null) {
                root.left = new BST(value);
            } else {
                insert(value, root.left);
            }
        }
    }
}
