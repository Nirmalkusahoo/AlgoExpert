package com.nirmal.algoExpert.linkedList;

public class ShiftLinkedList {
    public static class LinkedList{
        int value;
        LinkedList next;
        LinkedList(int value){
            this.value=value;
            this.next=null;
        }
    }

    public static LinkedList shiftLinkedList(LinkedList head, int k) {
        // Write your code here.
        if(k==0){
            return head;
        }
        int length=1;
        LinkedList list=head;
        while(list.next !=null){
            list=list.next;
            length++;
        }

        int actualPosition = Math.abs(k) % length;
        if(actualPosition==0){
            return head;
        }
        int newTailPosition;
        if(k>0){
            newTailPosition=length-actualPosition;
        } else {
            newTailPosition=actualPosition;
        }
        LinkedList newTail=head;
        for(int i=1;i<newTailPosition;i++){
            newTail=newTail.next;
        }
        LinkedList newHead=newTail.next;
        newTail.next=null;
        list.next=head;
        return newHead;
    }
}
