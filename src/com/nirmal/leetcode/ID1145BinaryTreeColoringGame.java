package com.nirmal.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ID1145BinaryTreeColoringGame {

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        if(root.val==x){
            return false;
        }
        Map<Integer, TreeNode> map = new HashMap<>();
        findParents(root, null, map);

        TreeNode colourdNodeParent = map.get(x);
        if (colourdNodeParent.left.val == x) {
            if (colourdNodeParent.right != null) {
                return true;
            } else {
                return false;
            }
        } else {
            if (colourdNodeParent.left != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void findParents(TreeNode root, TreeNode parent, Map<Integer, TreeNode> map) {
        if (root != null) {
            map.put(root.val, parent);
            findParents(root.left, root, map);
            findParents(root.right, root, map);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
