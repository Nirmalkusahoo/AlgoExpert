package com.nirmal.algoExpert;


import java.util.HashMap;
import java.util.Map;

public class Practise {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> location = new HashMap<>();

        int[] length = new int[]{0, 1};
        int startIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (location.containsKey(c)) {
                startIdx=Math.max(location.get(c)+1,startIdx);
            }
            if (length[1] - length[0] < i + 1 - startIdx) {
                length[0] = startIdx;
                length[1] = i + 1;
            }

            location.put(c, i);
        }
        return length[1] - length[0];
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("tmmzuxta"));
    }

}
