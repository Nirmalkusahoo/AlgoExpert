package com.nirmal.algoExpert.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RiverSizes {

    public static List<Integer> riverSizes(int[][] matrix) {
        // Write your code here.

        List<Integer> sizes = new ArrayList<Integer>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (visited[i][j]) {
                    continue;
                }
                traverseNode(i, j, visited, matrix,sizes);
            }
        }
        return sizes;
    }

    public static void traverseNode(int i, int j, boolean[][] visited, int[][] matrix,List<Integer> sizes) {
        int currentRiverSize = 0;
        Stack<Integer[]> nodeToExplore = new Stack<Integer[]>();
        nodeToExplore.push(new Integer[]{i, j});
        while (!nodeToExplore.isEmpty()) {
            Integer[] currentNode = nodeToExplore.pop();
            i = currentNode[0];
            j = currentNode[1];
            if (visited[i][j]) {
                continue;
            }
            visited[i][j] = false;

            if (matrix[i][j] == 0) {
                continue;
            }
            currentRiverSize++;
            List<Integer[]> nodes = getUnVisitedNodes(i, j, visited, matrix);
            for (Integer[] node : nodes) {
                nodeToExplore.push(node);
            }
        }

        if(currentRiverSize>0){
            sizes.add(currentRiverSize);
        }
    }

    public static List<Integer[]> getUnVisitedNodes(int i, int j, boolean[][] visited, int[][] matrix) {
        List<Integer[]> nodes = new ArrayList<Integer[]>();
        if (i > 0 && !visited[i - 1][j]) {
            nodes.add(new Integer[]{i - 1, j});
        }
        if (i < matrix.length -1 && !visited[i + 1][j]) {
            nodes.add(new Integer[]{i + 1, j});
        }
        if (j > 0 && !visited[i][j - 1]) {
            nodes.add(new Integer[]{i, j - 1});
        }
        if (j < matrix[0].length -1 && !visited[i][j + 1]) {
            nodes.add(new Integer[]{i, j + 1});
        }
        return nodes;
    }
}
