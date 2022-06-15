package com.nirmal.algoExpert.graphs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DijkstrasAlgorithim {
    public int[] dijkstrasAlgorithm(int start, int[][][] edges) {
        // Write your code here.
        int numberOfVertices = edges.length;
        int[] minDistances = new int[numberOfVertices];
        Arrays.fill(minDistances, Integer.MAX_VALUE);
        minDistances[start] = 0;

        Set<Integer> visited = new HashSet<>();

        while (visited.size() != numberOfVertices) {
            int[] vertexData = getVertexWithMinDistance(minDistances, visited);
            int vertex = vertexData[0];
            int currentDistance = vertexData[1];

            if (currentDistance == Integer.MAX_VALUE) {
                break;
            }
            visited.add(vertex);
            for (int[] edge : edges[vertex]) {
                int destinationVertex = edge[0];
                int destinationDistance = edge[1];

                int newDistance = destinationDistance + currentDistance;
                int currentDestinationDistance = minDistances[destinationVertex];
                if (newDistance < currentDestinationDistance) {
                    minDistances[destinationVertex] = newDistance;
                }
            }
        }

        int[] finalDistance = new int[minDistances.length];
        for (int i = 0; i < minDistances.length; i++) {
            int distance = minDistances[i];
            if (distance == Integer.MAX_VALUE) {
                finalDistance[i] = -1;
            } else {
                finalDistance[i] = minDistances[i];
            }
        }

        return finalDistance;
    }

    public int[] getVertexWithMinDistance(int[] minDistances, Set<Integer> visited) {
        int currentMinDistance = Integer.MAX_VALUE;
        int vertex = -1;

        for (int vertexIdx = 0; vertexIdx < minDistances.length; vertexIdx++) {
            int currentDistance = minDistances[vertexIdx];

            if (visited.contains(vertexIdx)) {
                continue;
            }

            if (currentDistance <= currentMinDistance) {
                currentMinDistance = currentDistance;
                vertex = vertexIdx;
            }
        }
        return new int[]{vertex, currentMinDistance};
    }
}
