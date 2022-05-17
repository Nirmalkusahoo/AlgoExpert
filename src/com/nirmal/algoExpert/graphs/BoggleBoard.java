package com.nirmal.algoExpert.graphs;

import java.util.*;

public class BoggleBoard {
    public static List<String> boggleBoard(char[][] board, String[] words) {
        // Write your code here.
        Trie trie = new Trie();
        for (String str : words) {
            trie.add(str);
        }
        Set<String> set = new HashSet<>();
        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                explore(i, j, board, trie.root, visited, set);
            }
        }
        List<String> list = new ArrayList<>();
        list.addAll(set);
        return list;
    }

    public static void explore(int i, int j, char[][] board, TrieNode node, boolean[][] visited, Set<String> set) {
        if (visited[i][j]) {
            return;
        }
        char letter = board[i][j];
        if (!node.children.containsKey(letter)) {
            return;
        }
        visited[i][j] = true;
        node = node.children.get(letter);
        if (node.children.containsKey('*')) {
            set.add(node.word);
        }

        List<Integer[]> neighbours = getNeighbour(i, j, board);
        for (Integer[] neighbour : neighbours) {
            explore(neighbour[0], neighbour[1], board, node, visited, set);
        }
        visited[i][j] = false;
    }

    public static List<Integer[]> getNeighbour(int i, int j, char[][] board) {
        List<Integer[]> neighbours = new ArrayList<>();
        if (i > 0) neighbours.add(new Integer[]{i - 1, j});
        if (i > 0 && j < board[0].length - 1) neighbours.add(new Integer[]{i - 1, j + 1});
        if (j < board[0].length - 1) neighbours.add(new Integer[]{i, j + 1});
        if (i < board.length - 1 && j < board[0].length - 1) neighbours.add(new Integer[]{i + 1, j + 1});
        if (i < board.length - 1) neighbours.add(new Integer[]{i + 1, j});
        if (i < board.length - 1 && j > 0) neighbours.add(new Integer[]{i + 1, j - 1});
        if (j > 0) neighbours.add(new Integer[]{i, j - 1});
        if (i > 0 && j > 0) neighbours.add(new Integer[]{i - 1, j - 1});
        return neighbours;
    }

    static class Trie {
        TrieNode root;
        char endSymbol;

        Trie() {
            this.root = new TrieNode();
            this.endSymbol = '*';
        }

        public void add(String word) {
            TrieNode node = this.root;
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (!node.children.containsKey(letter)) {
                    TrieNode newNode = new TrieNode();
                    node.children.put(letter, newNode);
                }
                node = node.children.get(letter);
            }
            node.children.put(this.endSymbol, null);
            node.word = word;
        }
    }

    public static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        String word = "";
    }
}
