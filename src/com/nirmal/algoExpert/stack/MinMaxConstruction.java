package com.nirmal.algoExpert.stack;

import java.util.*;

public class MinMaxConstruction {
    // Solution:1
    static class MinMaxStack {
        List<Map<String,Integer>> minMaxList=new ArrayList<Map<String,Integer>>();
        List<Integer> stack= new ArrayList<>();
        public int peek() {
            // Write your code here.
            return stack.get(stack.size()-1);
        }

        public int pop() {
            // Write your code here.
            minMaxList.remove(minMaxList.size()-1);
            return stack.remove(stack.size()-1);

        }

        public void push(Integer number) {
            // Write your code here.
            HashMap<String,Integer> newMinMax=new HashMap<>();
            newMinMax.put("min",number);
            newMinMax.put("max",number);
            if(stack.size()>0){
                HashMap<String,Integer> lastMinMax=new HashMap<>(minMaxList.get(minMaxList.size()-1));
                newMinMax.replace("min",Math.min(number,lastMinMax.get("min")));
                newMinMax.replace("max",Math.max(number,lastMinMax.get("max")));
            }
            minMaxList.add(newMinMax );
            stack.add(number);
        }

        public int getMin() {
            // Write your code here.
            return minMaxList.get(minMaxList.size()-1).get("min");
        }

        public int getMax() {
            // Write your code here.
            return minMaxList.get(minMaxList.size()-1).get("max");
        }
    }
    // Solution:2
    /*static class MinMaxStack {
        int length;
        Node top;
        MinMaxStack(){
            this.length=0;
            this.top=null;
        }
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public boolean isEmpty(){
            return length==0;
        }
        public int peek() {
            // Write your code here.
            if(isEmpty()){
                throw new EmptyStackException();
            }
            return top.data;
        }

        public int pop() {
            // Write your code here.
            if(isEmpty()){
                throw new EmptyStackException();
            }
            int result=top.data;
            top=top.next;
            length--;
            return result;
        }

        public void push(Integer number) {
            // Write your code here.
            Node temp=new Node(number);
            temp.next=top;
            top=temp;
            length++;
        }

        public int getMin() {
            // Write your code here.
            int min=99999999;
            Node node=top;
            while (node!=null){
                if(node.data<min){
                    min=node.data;
                }
                node=node.next;
            }
            return min;
        }

        public int getMax() {
            // Write your code here.
            int max=-99999999;
            Node node=top;
            while (node!=null){
                if(node.data>max){
                    max=node.data;
                }
                node=node.next;
            }
            return max;
        }
    }*/
    public static void main(String[] args) {

    }
}
