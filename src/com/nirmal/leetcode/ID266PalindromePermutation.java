package com.nirmal.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ID266PalindromePermutation {
    /*public static boolean canPermutePalindrome(String s) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i) - 'a';
            if (count[pos] == 1) {
                count[pos] = count[pos] - 1;
            } else {
                count[pos] = count[pos] + 1;
            }

        }
        int counter = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                counter = counter + 1;
            }

        }
        return counter < 2;
    }*/

    public static boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                set.remove(s.charAt(i));
            }
        }
        return set.size() <= 1;
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("carerac"));
    }
}
