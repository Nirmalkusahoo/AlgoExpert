package com.nirmal.leetcode;

public class ID2096StepByStepDirectionsFromaBinaryTreeNodetoAnother {

    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder start = new StringBuilder();
        StringBuilder dest = new StringBuilder();
        find(root, startValue, start);
        find(root, destValue, dest);
        start.reverse();
        dest.reverse();

        while (start.length()>0 && dest.length()>0 && start.charAt(0)==dest.charAt(0)){
            start.deleteCharAt(0);
            dest.deleteCharAt(0);
        }
        return "U".repeat(start.length()) + dest.toString();
    }

    public boolean find(TreeNode root, int value, StringBuilder sb) {
        if (root.val == value) {
            return true;
        }
        if (root.left != null && find(root.left, value, sb)) {
            sb.append("L");
            return true;
        }
        if (root.right != null && find(root.right, value, sb)) {
            sb.append("R");
            return true;
        }
        return false;
    }

    // Solution 1 using Graph BFs traversal
  /*  Map<TreeNode, TreeNode> parentMap = new HashMap<>();
    TreeNode startNode;
    int startVal;

    public String getDirections(TreeNode root, int startValue, int destValue) {
        startVal = startValue;
        updateParentMap(root, null);
        Queue<Pair> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(new Pair(startNode, ""));
        visited.add(startNode.val);
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            TreeNode currentNode = current.node;
            String str = current.str;
            if (currentNode.val == destValue) {
                return str;
            }

            if (parentMap.get(currentNode) != null && !visited.contains(parentMap.get(currentNode).val)) {
                TreeNode parent = parentMap.get(currentNode);
                queue.offer(new Pair(parent, str + "U"));
            }
            if (currentNode.left != null && !visited.contains(currentNode.left.val)) {
                TreeNode left = currentNode.left;
                queue.offer(new Pair(left, str + "L"));
            }
            if (currentNode.right != null && !visited.contains(currentNode.right.val)) {
                TreeNode right = currentNode.right;
                queue.offer(new Pair(right, str + "R"));
            }
        }
        return "";
    }

    public void updateParentMap(TreeNode root, TreeNode parent) {
        if (startVal == root.val) {
            startNode = root;
        }
        parentMap.put(root, parent);
        if (root.left != null) {
            updateParentMap(root.left, root);
        }

        if (root.right != null) {
            updateParentMap(root.right, root);
        }
    }

    public class Pair {
        TreeNode node;
        String str;

        Pair(TreeNode node, String string) {
            this.node = node;
            this.str = string;
        }
    }
*/
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
