package com.nirmal.algoExpert.strings;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordsInAString {

    //Solution 1:
    /*public String reverseWordsInString(String string) {
        // Write your code here.
        ArrayList<String> list = new ArrayList<String>();
        int startOfWord = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                list.add(string.substring(startOfWord, i));
                startOfWord = i;
            } else if (string.charAt(startOfWord) == ' ') {
                list.add(" ");
                startOfWord = i;
            }
        }

        list.add(string.substring(startOfWord));
        Collections.reverse(list);

        return String.join("",list);
    }*/

    //Solution 2:
    public String reverseWordsInString(String string) {
        // Write your code here.

        char[] charArray=reverseCharArray(string.toCharArray(),0,string.length());

        int startIndex=0;
        while (startIndex<charArray.length){
            int endIndex=startIndex;
            while(endIndex<charArray.length && charArray[endIndex] != ' '){
                endIndex++;
            }
            reverseCharArray(charArray,startIndex,endIndex-1);
            startIndex=endIndex+1;
        }

        return new String(charArray);
    }

    public char[] reverseCharArray(char[] array, int startIdx, int endIdx){
        while (startIdx<endIdx){
            char temp=array[startIdx];
            array[startIdx] = array[endIdx];
            array[endIdx] =temp;

            startIdx++;
            endIdx--;
        }
        return array;
    }
}
