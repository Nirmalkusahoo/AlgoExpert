package com.nirmal.algoExpert.strings;

public class LongestPalindromicSubString {
    public static String longestPalindromicSubstring(String str) {
        // Write your code here.

        int[] currentLongest={0,1};

        for(int i=1;i<str.length();i++){
            int[] odd=getLongestPalindromicString(str,i-1,i+1);
            int[] even=getLongestPalindromicString(str,i-1,i);

            int[] longest= odd[1]-odd[0] > even[1]-even[0]? odd : even;
            currentLongest= currentLongest[1]-currentLongest[0] > longest[1]-longest[0]? currentLongest : longest;
        }
        return str.substring(currentLongest[0],currentLongest[1]);
    }

    public static int[] getLongestPalindromicString(String str,int leftIndex,int rightIndex){
        while (leftIndex>=0 && rightIndex<str.length()){
            if(str.charAt(leftIndex) != str.charAt(rightIndex)){
                break;
            }
            leftIndex--;
            rightIndex++;
        }
        return new int[]{leftIndex+1,rightIndex};
    }
}
