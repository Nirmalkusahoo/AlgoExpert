package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ID1268SearchSuggestionsSystem {
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        Arrays.sort(products);

        int L = 0;
        int R = products.length - 1;

        for (int i = 0; i < searchWord.length(); i++) {
            char c = searchWord.charAt(i);

            while (L <= R && (products[L].length() <= i || products[L].charAt(i) != c)) {
                L++;
            }

            while (L <= R && (products[R].length() <= i || products[R].charAt(i) != c)) {
                R--;
            }

            int maxWindow = R - L + 1;
            int upperBound = Math.min(maxWindow, 3);

            List<String> list = new ArrayList<>();
            for (int j = 0; j < upperBound; j++) {
                list.add(products[L + j]);
            }
            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {
        suggestedProducts(new String[]{"havana"}, "havana");
    }
}
