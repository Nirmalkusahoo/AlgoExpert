package com.nirmal.leetcode;

import java.util.*;

public class ID49GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);
            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedString, list);
            }

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
