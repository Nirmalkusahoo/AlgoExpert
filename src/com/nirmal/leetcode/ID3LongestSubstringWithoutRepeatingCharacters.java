package com.nirmal.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ID3LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int startIdx=0;
        Map<Character,Integer> lastSeen=new HashMap<>();
        int[] largest={0,1};
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(lastSeen.containsKey(c)){
                startIdx= Math.max(startIdx,lastSeen.get(c)+1);
            }
            if(largest[1]-largest[0]<(i+1-startIdx)){
                largest= new int[]{startIdx,i+1};
            }
            lastSeen.put(c,i);
        }
        return largest[1]-largest[0];
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
