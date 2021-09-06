package com.nirmal.algoExpert.linkedList;

public class ReverseLinkedList {
    public static class LinkedList{
        public int value;
        public LinkedList next;
        public LinkedList(int value){
            this.value=value;
        }
    }
    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.

        LinkedList current= head;
        LinkedList previous=null;

        while(current !=null){
            LinkedList next= current.next;
            current.next=previous;
            previous=current;
            current=next;
        }

        return previous;
    }

    public static void main(String[] args) {

    }
}
