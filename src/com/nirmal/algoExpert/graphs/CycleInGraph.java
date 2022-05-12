package com.nirmal.algoExpert.graphs;

import java.util.Arrays;

public class CycleInGraph {

    public static int WHITE = 0;
    public static int GRAY = 1;
    public static int BLACK = 2;

    public static boolean cycleInGraph(int[][] edges) {
        // Write your code here.
        int numberOfNodes = edges.length;
        int[] colors = new int[numberOfNodes];
        Arrays.fill(colors, WHITE);

        for (int node = 0; node < numberOfNodes; node++) {
            if (colors[node] != WHITE) {
                continue;
            }

            boolean containsCycle = traverseAndColorNodes(node, edges, colors);
            if (containsCycle) {
                return true;
            }
        }
        return false;
    }

    public static boolean traverseAndColorNodes(int node, int[][] edges, int[] colors) {
        colors[node] = GRAY;

        int[] neighbours = edges[node];
        for (int neighbour : neighbours) {
            if (colors[neighbour] == GRAY) {
                return true;
            }
            if (colors[neighbour] == BLACK) {
                continue;
            }

            boolean containsCycle = traverseAndColorNodes(neighbour, edges, colors);
            if (containsCycle) {
                return true;
            }
        }
        colors[node] = BLACK;
        return false;
    }
}
