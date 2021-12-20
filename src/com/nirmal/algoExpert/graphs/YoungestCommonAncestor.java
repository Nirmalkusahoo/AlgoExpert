package com.nirmal.algoExpert.graphs;

public class YoungestCommonAncestor {
    public static AncestralTree getYoungestCommonAncestor(
            AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
        // Write your code here.
        int depthOne = getDepth(descendantOne, topAncestor);
        int depthTwo = getDepth(descendantTwo, topAncestor);

        if (depthOne > depthTwo) {
            return backTrackAncestralTree(descendantOne, descendantTwo, depthOne - depthTwo);
        } else {
            return backTrackAncestralTree(descendantTwo, descendantOne, depthTwo - depthOne);
        }
    }

    public static int getDepth(AncestralTree descendant, AncestralTree topAncestor) {
        int depth = 0;

        while (descendant != topAncestor) {
            descendant = descendant.ancestor;
            depth++;
        }

        return depth;
    }

    public static AncestralTree backTrackAncestralTree(AncestralTree lower, AncestralTree higher, int diff) {
        while (diff > 0) {
            lower = lower.ancestor;
            diff--;
        }

        while (lower != higher) {
            lower = lower.ancestor;
            higher = higher.ancestor;
        }
        return lower;
    }

    public static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }
    }
}
