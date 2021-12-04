package com.nirmal.algoExpert.binarySearchTree;

public class FindClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        BST currentNode = tree;
        int closest = tree.value;
        while (currentNode != null) {
            if (Math.abs(currentNode.value - target) < Math.abs(closest - target)) {
                closest = currentNode.value;
            }

            if (currentNode.value < target) {
                currentNode = currentNode.right;
            } else if (currentNode.value > target) {
                currentNode = currentNode.left;
            } else {
                break;
            }
        }
        return closest;
    }

    // Solution 1:
  /*  public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst(tree, target, tree.value);

    }

    public static int findClosestValueInBst(BST tree, int target, int closest) {
        if (tree == null) {
            return closest;
        }

        if (Math.abs(tree.value - target) < Math.abs(target - closest)) {
            closest = tree.value;
        }

        if (tree.value > target) {
            return findClosestValueInBst(tree.left, target, closest);
        } else if (tree.value < target) {
            return findClosestValueInBst(tree.right, target, closest);
        } else {
            return closest;
        }
    }*/

    public static class BST {
        BST left;
        BST right;
        int value;

        BST(int value) {
            this.value = value;
        }
    }
}
