package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ID652FindDuplicateSubtrees {
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

    List<TreeNode> list = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        postOrder(root);
        return list;
    }

    public String postOrder(TreeNode root) {
        if (root == null) {
            return "N";
        }

        String left = postOrder(root.left);
        String right = postOrder(root.right);

        String current = root.val +" "+ left +" "+ right;
        if (map.containsKey(current)) {
            map.put(current, map.get(current) + 1);
        } else {
            map.put(current, 1);
        }
        if (map.get(current) == 2) {
            list.add(root);
        }
        return current;
    }
}
