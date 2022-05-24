package com.nirmal.algoExpert.recursion;

import java.util.ArrayList;

public class GenerateDivTags {
    public ArrayList<String> generateDivTags(int numberOfTags) {
        // Write your code here.
        ArrayList<String> list = new ArrayList<>();
        generate("", numberOfTags, numberOfTags, list);
        return list;
    }

    public static void generate(String str, int open, int close, ArrayList<String> list) {
        if (open > 0) {
            String newStr = str + "<div>";
            generate(newStr, open - 1, close, list);
        }
        if (open < close) {
            String newStr =  str + "</div>";
            generate(newStr, open, close - 1, list);
        }
        if (close == 0) {
            list.add(str);
        }
    }
}
