package com.nirmal.algoExpert;


public class Practise {

    public static String longestPalindrome(String s) {
        int[] longest = new int[]{0, 1};
        for (int i = 1; i < s.length(); i++) {
            int[] odd = findPalindrome(i - 1, i + 1, s);
            int[] even = findPalindrome(i - 1, i, s);
            int[] currentLongest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
            if (currentLongest[1] - currentLongest[0] > longest[1] - longest[0]) {
                longest = currentLongest;
            }
        }
        return s.substring(longest[0], longest[1]);
    }

    public static int[] findPalindrome(int l, int r, String s) {
        while (l >= 0 && r < s.length()) {
            if (s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            } else {
                return new int[]{++l, r};
            }
        }
        return new int[]{++l, r};
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        StringBuilder sb = new StringBuilder();
        sb.append("L");
        sb.append("R");
        System.out.println(sb.toString());
        System.out.println("U".repeat("LL".length()) + "RL".toString());
    }


}
