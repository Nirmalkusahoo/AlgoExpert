package com.nirmal.algoExpert.dynamicProgramming;

public class LongestCommonSubsequence {

    public static int longestCommonSubsequence(String text1, String text2) {
        // Write your code here.
        // its not algo expert programe solution ,it will just count max length
        int[][] list = new int[text1.length() + 1][text2.length() + 1];


        for (int i = 1; i < text1.length() + 1; i++) {
            for (int j = 1; j < text2.length() + 1; j++) {
                char char1 = text1.charAt(i - 1);
                char char2 = text2.charAt(j - 1);
                if (char1 == char2) {
                    list[i][j] = list[i - 1][j - 1] + 1;
                } else {
                    list[i][j] = Math.max(list[i - 1][j], list[i][j - 1]);
                }
            }
        }
        return list[text1.length()][text2.length()];
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde", "ace"));
    }
}
