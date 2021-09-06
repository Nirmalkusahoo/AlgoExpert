package com.nirmal.algoExpert.strings;

import java.util.*;

public class FirstNonRepeatingCharacter {



    public static int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<string.length();i++){
            char c= string.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }

        for (int i=0;i<string.length();i++){
            if(map.get(string.charAt(i)) == 1){
               return i;
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNonRepeatingCharacter.firstNonRepeatingCharacter("faadabcbbebdf"));
    }
}
