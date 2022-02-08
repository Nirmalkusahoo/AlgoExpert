package com.nirmal.algoExpert.binaryTree;

import java.util.*;

public class FindNodesDistanceK {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public static class Pair {
        BinaryTree tree;
        int depth;

        Pair(BinaryTree tree, int depth) {
            this.tree = tree;
            this.depth = depth;
        }
    }

    public ArrayList<Integer> findNodesDistanceK(BinaryTree tree, int target, int k) {
        // Write your code here.

        HashMap<Integer, BinaryTree> parentMap = new HashMap<>();
        findParentNodes(tree, parentMap, null);
        BinaryTree targetNode = findTargetNode(target, parentMap, tree);
        return bfs(targetNode, tree, k,parentMap);
    }

    public static ArrayList<Integer> bfs(BinaryTree targetNode, BinaryTree tree, int k, HashMap<Integer, BinaryTree> parentMap) {
        Queue<Pair> queue = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        queue.offer(new Pair(targetNode, 0));
        seen.add(targetNode.value);

        while (queue.size() > 0) {
            Pair obj = queue.poll();
            int depth = obj.depth;
            BinaryTree currentNode = obj.tree;



            if (depth == k) {
                ArrayList<Integer> list = new ArrayList<>();
                for (Pair pair : queue) {
                    list.add(pair.tree.value);
                }
                list.add(currentNode.value);
                return list;
            }

            List<BinaryTree> connectedNode = new ArrayList<BinaryTree>();
            connectedNode.add(tree.left);
            connectedNode.add(tree.right);
            connectedNode.add(parentMap.get(currentNode.value));
            for (BinaryTree node : connectedNode) {
                if (node == null) {
                    continue;
                }
                if (seen.contains(node.value)) {
                    continue;
                }
                seen.add(node.value);
                queue.offer(new Pair(node, depth + 1));
            }
        }

        return new ArrayList<Integer>();
    }

    public BinaryTree findTargetNode(int target, HashMap<Integer, BinaryTree> parentMap, BinaryTree root) {
        if (root.value == target) {
            return root;
        }
        BinaryTree node = parentMap.get(target);
        if (node.left !=null && node.left.value == target) {
            return node.left;
        } else {
            return node.right;
        }
    }


    public static void findParentNodes(BinaryTree node, HashMap<Integer, BinaryTree> parentMap, BinaryTree parent) {
        if (node != null) {
            parentMap.put(node.value, parent);
            findParentNodes(node.left, parentMap, node);
            findParentNodes(node.right, parentMap, node);
        }
    }
}
