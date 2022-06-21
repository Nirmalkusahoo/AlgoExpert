package com.nirmal.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ID745PrefixandSuffixSearch {
    Map<String, Integer> map = new HashMap<>();

    public void WordFilter(String[] words) {
        int index = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < word.length(); j++) {
                    String preFixAndSuffix = word.substring(0, i) + "#" + word.substring(j);
                    map.put(preFixAndSuffix, index);
                }
            }
            index++;
        }
    }

    public int f(String prefix, String suffix) {
        String query = prefix + "#" + suffix;
        return map.getOrDefault(query, -1);
    }

    public static void main(String[] args) {
        ID745PrefixandSuffixSearch obj = new ID745PrefixandSuffixSearch();
        obj.WordFilter(new String[]{"apple"});
        System.out.println(obj.f("a", "e"));
    }
}
