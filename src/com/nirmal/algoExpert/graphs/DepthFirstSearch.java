package com.nirmal.algoExpert.graphs;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    public static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            array.add(this.name);
            for (Node node : this.children) {
                node.depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name) {
            Node node = new Node(name);
            children.add(node);
            return this;
        }
    }
}
