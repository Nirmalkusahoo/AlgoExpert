package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ID716MaxStack {
    List<Integer> stack= new ArrayList<>();
    List<Integer> maxList= new ArrayList<>();
    public void MaxStack() {

    }

    public void push(int x) {

        if(stack.size()>0){
            int newMax= Math.max(x,maxList.get(maxList.size()-1));
            maxList.add(newMax);
        }
        stack.add(x);
    }

    public int pop() {
        if(maxList.size()>0 && stack.size()>0){
            maxList.remove(maxList.size()-1);
            return stack.remove(stack.size()-1);
        } else {
            return 0;
        }

    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int peekMax() {
        return maxList.get(maxList.size()-1);
    }

    public int popMax() {
        return maxList.remove(maxList.size()-1);
    }
}
