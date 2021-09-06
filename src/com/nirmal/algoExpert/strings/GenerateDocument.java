package com.nirmal.algoExpert.strings;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {

    // Solution 1:
    public static boolean generateDocument(String characters, String document) {
        // Write your code here.

        Map<Character, Integer> charCountMap= new HashMap<>();
        for(int i=0;i<characters.length();i++){
            char c=characters.charAt(i);
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c) +1);
            } else {
                charCountMap.put(c,1);
            }
        }

        for(int i=0;i<document.length();i++){
            char c=document.charAt(i);
            if(!charCountMap.containsKey(c) || charCountMap.get(c) ==0){
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) -1);
        }
        return true;
    }
    // Solution:: 2
   /* public static boolean generateDocument(String characters, String document) {
        // Write your code here.

        char[] arr= characters.toCharArray();
        Map<Integer, Integer> map= new HashMap<>();
        Map<Integer, Integer> docMap= new HashMap<>();
        for(int c:arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c) +1);
            } else {
                map.put(c,1);
            }
        }
        char[] docArr= document.toCharArray();

        for(int c:docArr){
            if(docMap.containsKey(c)){
                docMap.put(c, docMap.get(c) +1);
            } else {
                docMap.put(c,1);
            }
        }

        for(int c:docMap.keySet()){
            if (map.containsKey(c) && map.get(c)>= docMap.get(c)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }*/

    public static void main(String[] args) {
        System.out.println(GenerateDocument.generateDocument("A","a"));
    }
}
