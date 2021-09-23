package com.nirmal.algoExpert.strings;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        Map<String,List<String>> map=new HashMap<>();
        for(String word:words){
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(map.containsKey(sorted)){
                map.get(sorted).add(word);
            } else {
                map.put(sorted,new ArrayList<>(Arrays.asList(word)));
            }

        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(GroupAnagrams.groupAnagrams( Arrays.asList(new String[]{"yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"})));
    }
}
