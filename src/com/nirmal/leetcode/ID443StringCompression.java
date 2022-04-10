package com.nirmal.leetcode;

public class ID443StringCompression {
    public static int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        int indexAns = 0;
        int startIndex = 0;
        while (startIndex < chars.length) {
            int currentCount = 0;
            char currentChar=chars[startIndex];
            while (startIndex < chars.length && currentChar == chars[startIndex]) {
                startIndex++;
                currentCount++;
            }

            chars[indexAns] = currentChar;
            indexAns++;
            if(currentCount !=1){
                for (char c : Integer.toString(currentCount).toCharArray()) {
                    chars[indexAns] = c;
                    indexAns++;
                }
            }

        }
        return indexAns;
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }
}
