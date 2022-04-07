package com.nirmal.leetcode;

import java.util.*;

public class ID127WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);
        set.remove(beginWord);
        queue.offer(beginWord);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                level++;
                String word = queue.poll();
                if (word.equals(endWord)) {
                    return level;
                }

                List<String> neighbours = getNeighbours(word);
                for (String neighbour : neighbours) {
                    if (set.contains(neighbour)) {
                        set.remove(neighbour);
                        queue.offer(neighbour);
                    }
                }
            }
        }
        return 0;
    }

    public static List<String> getNeighbours(String word) {
        char[] charArray = word.toCharArray();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            char temp = charArray[i];

            for (char c = 'a'; c <= 'z'; c++) {
                charArray[i] = c;
                String string = new String(charArray);
                list.add(string);
            }
            charArray[i] = temp;
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println(ladderLength("hit","dog", Arrays.asList("hot","dot","dog","lot","log","cog")));
    }
}
