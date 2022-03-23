package com.nirmal.leetcode;

import java.util.*;

public class ID863AllNodesDistanceKinBinaryTree {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<Integer, TreeNode> parentMap = new HashMap<>();
        getParentNodes(parentMap, root, null);
        return bfs(target, k, parentMap);
    }

    public static List<Integer> bfs(TreeNode target, int k, Map<Integer, TreeNode> parentMap) {
        Queue<TreeInfo> queue = new LinkedList<>();
        queue.offer(new TreeInfo(target, 0));

        Set<Integer> seen = new HashSet<>(target.val);
        seen.add(target.val);

        while (!queue.isEmpty()) {
            TreeInfo treeInfo = queue.poll();
            int distance = treeInfo.distance;
            TreeNode node = treeInfo.node;

            if (distance == k) {
                List<Integer> list = new ArrayList<>();
                for (TreeInfo tf : queue) {
                    list.add(tf.node.val);
                }
                list.add(node.val);
                return list;
            }
            List<TreeNode> neighbours = new ArrayList<>();
            neighbours.add(node.left);
            neighbours.add(node.right);
            neighbours.add(parentMap.get(node.val));

            for (TreeNode neighbour : neighbours) {
                if (neighbour == null) {
                    continue;
                }
                if (seen.contains(neighbour.val)) {
                    continue;
                }
                queue.add(new TreeInfo(neighbour, distance + 1));
                seen.add(neighbour.val);
            }

        }
        return new ArrayList<>();
    }

    public static class TreeInfo {
        int distance;
        TreeNode node;

        TreeInfo(TreeNode node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public static void getParentNodes(Map<Integer, TreeNode> parentMap, TreeNode child, TreeNode parent) {
        if (child != null) {
            parentMap.put(child.val, parent);
            getParentNodes(parentMap, child.left, child);
            getParentNodes(parentMap, child.right, child);
        }
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
