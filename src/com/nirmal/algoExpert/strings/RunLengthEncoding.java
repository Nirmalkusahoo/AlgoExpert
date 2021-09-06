package com.nirmal.algoExpert.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RunLengthEncoding {
    public static String runLengthEncoding(String string) {
        // Write your code here.
        StringBuilder newString=new StringBuilder();
        int currentLength=1;
        for(int i=1;i<string.length();i++){
            char currentChar=string.charAt(i);
            char previousChar=string.charAt(i-1);

            if(currentChar != previousChar || currentLength ==9){
                newString.append(currentLength);
                newString.append(previousChar);
                currentLength=0;
            }
            currentLength++;

        }

        newString.append(currentLength);
        newString.append(string.charAt(string.length()-1));

        return newString.toString();
    }

    public static void main(String[] args) {
        System.out.println(RunLengthEncoding.runLengthEncoding("A"));
    }
}
