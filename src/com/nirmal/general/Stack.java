package com.nirmal.general;

import java.util.EmptyStackException;

public class Stack {

    int length;
    Node top;
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
            this.next=null;
        }
    }

    Stack(){
        length=0;
        top=null;
    }

    public void push(int value){
        Node temp=new Node(value);
        temp.next=top;
        top=temp;
        length++;
    }

    public boolean isEmpty(){
        return length==0;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result= top.value;
        top=top.next;
        length--;
        return result;
    }
    public int getPeek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.value;
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.getPeek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.getPeek());
    }
}
