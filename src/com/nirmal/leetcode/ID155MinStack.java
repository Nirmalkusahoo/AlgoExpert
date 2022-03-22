package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ID155MinStack {
    public List<Integer> stack= new ArrayList<>();
    public List<Map<String,Integer>> lastMinMax= new ArrayList<>();
    public void MinStack() {

    }

    public void push(int val) {
        Map<String,Integer> newMinMax= new HashMap<>();
        newMinMax.put("min",val);
        newMinMax.put("max",val);
        if(stack.size()>0){
            Map<String,Integer> lastItem= lastMinMax.get(stack.size()-1);
            int max=lastItem.get("max");
            int min=lastItem.get("min");

            newMinMax.replace("max",Math.max(val,max));
            newMinMax.replace("min",Math.min(val,min));
        }
        stack.add(val);
        lastMinMax.add(newMinMax);
    }

    public void pop() {
        lastMinMax.remove(lastMinMax.size()-1);
        stack.remove(stack.size()-1);
    }

    public int top() {
       return stack.get(stack.size()-1);
    }

    public int getMin() {
       return lastMinMax.get(lastMinMax.size()-1).get("min");
    }
}
