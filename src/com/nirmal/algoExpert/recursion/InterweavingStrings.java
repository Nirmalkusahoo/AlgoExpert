package com.nirmal.algoExpert.recursion;

import java.util.Arrays;

public class InterweavingStrings {
    public static boolean interweavingStrings(String one, String two, String three) {
        // Write your code here.

        int[] charCount= new int[256];
        Arrays.fill(charCount,0);

        for (char c:one.toCharArray()){
            charCount[c]=charCount[c] +1;
        }
        for (char c:two.toCharArray()){
            charCount[c]=charCount[c] +1;
        }

        int[] resultCharCount= new int[256];
        for (char c:three.toCharArray()){
            resultCharCount[c]=resultCharCount[c] +1;
        }
        for (int i=0;i<256;i++){
            if(resultCharCount[i] != charCount[i]){
                return false;
            }
        }
        return true;
    }
}
