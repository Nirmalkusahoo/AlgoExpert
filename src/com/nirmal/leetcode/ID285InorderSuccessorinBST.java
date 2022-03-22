package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ID285InorderSuccessorinBST {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode currentNode = root;
        List<TreeNode> list = new ArrayList<>();
        find(root, p, list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != p) {
                continue;
            }
            if (i == list.size() - 1) {
                return null;
            }
            return list.get(i + 1);
        }
        return null;
    }

    public void find(TreeNode root, TreeNode p, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        find(root.left, p, list);
        list.add(root);
        find(root.right, p, list);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
