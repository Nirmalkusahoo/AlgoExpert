package com.nirmal.algoExpert.binaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxPathSumInBinaryTree {

    public static int maxPathSum(BinaryTree tree) {
        // Write your code here.

        List<Integer> maxSumArray = findMaxSum(tree);
        return maxSumArray.get(1);
    }

    public static List<Integer> findMaxSum(BinaryTree tree) {
        if (tree == null) {
            return new ArrayList<Integer>(Arrays.asList(0, Integer.MIN_VALUE));
        }
        List<Integer> leftMaxSumArray = findMaxSum(tree.left);
        Integer leftMaxSumAsBranch = leftMaxSumArray.get(0);
        Integer leftMaxPathSum = leftMaxSumArray.get(1);


        List<Integer> rightMaxSumArray = findMaxSum(tree.right);
        Integer rightMaxSumAsBranch = rightMaxSumArray.get(0);
        Integer rightMaxPathSum = rightMaxSumArray.get(1);

        Integer maxChildSumAsBranch = Math.max(leftMaxSumAsBranch, rightMaxSumAsBranch);
        Integer maxSumAsBranch = Math.max(maxChildSumAsBranch + tree.value, tree.value);

        Integer maxSumAsRootNode = Math.max(maxSumAsBranch, leftMaxSumAsBranch + rightMaxSumAsBranch + tree.value);
        Integer maxPathSum = Math.max(leftMaxPathSum, Math.max(rightMaxPathSum, maxSumAsRootNode));

        return new ArrayList<>(Arrays.asList(maxSumAsBranch, maxPathSum));
    }

    public static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
        }
    }
}
