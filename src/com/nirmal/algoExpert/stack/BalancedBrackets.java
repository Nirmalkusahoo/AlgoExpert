package com.nirmal.algoExpert.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalancedBrackets {
    public static boolean balancedBrackets(String str) {
        // Write your code here.
        String openingBrackets="({[";
        String closingBrackets=")}]";
        Map<Character,Character> matchingBrackets=new HashMap<Character,Character>();
        matchingBrackets.put('{','}');
        matchingBrackets.put('[',']');
        matchingBrackets.put('(',')');
        List<Character> stack=new ArrayList<>();

        for(char c:str.toCharArray()){
            if(openingBrackets.indexOf(c) != -1){
                stack.add(c);
            }
            else if(closingBrackets.indexOf(c) != -1){
                if(stack.size() ==0){
                    return false;
                } else if(matchingBrackets.get(stack.get(stack.size()-1)) == c){
                    stack.remove(stack.size()-1);
                } else {
                    return false;
                }
            }
        }
        return stack.size()==0;
    }

    public static void main(String[] args) {
        System.out.println(BalancedBrackets.balancedBrackets("()()[{()})]"));
    }
}
