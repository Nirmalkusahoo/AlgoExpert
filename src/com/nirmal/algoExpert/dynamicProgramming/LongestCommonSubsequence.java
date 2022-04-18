package com.nirmal.algoExpert.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {

    public static List<Character> longestCommonSubsequence(String str1, String str2) {
        // Write your code here.

        int[][] lengths = new int[str2.length() + 1][str1.length() + 1];

        for (int i = 1; i < str2.length() + 1; i++) {
            for (int j = 1; j < str1.length() + 1; j++) {
                if (str2.charAt(i - 1) == str1.charAt(j - 1)) {
                    lengths[i][j] = 1 + lengths[i - 1][j - 1];
                } else {
                    lengths[i][j] = Math.max(lengths[i - 1][j], lengths[i][j - 1]);
                }
            }
        }
        return makeSubsequence(lengths, str1);
    }

    public static List<Character> makeSubsequence(int[][] lengths, String str) {
        int i = lengths.length - 1;
        int j = lengths[0].length - 1;
        List<Character> list = new ArrayList<>();
        while (i != 0 && j != 0) {
            if (lengths[i - 1][j] == lengths[i][j]) {
                i--;
            } else if (lengths[i][j - 1] == lengths[i][j]) {
                j--;
            } else {
                list.add(0, str.charAt(j - 1));
                i--;
                j--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abc","ab"));
    }
}
