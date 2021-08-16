package com.nirmal.algoExpert.linkedList;

public class RemoveKthNodeFromEnd {
    public static class LinkedList{
        public LinkedList next;
        public int value;
        public void LinkedList(int value){
            this.value=value;
            this.next=null;
        }
    }

    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        // Write your code here.
        LinkedList first=head;
        LinkedList second=head;
        int counter=1;
        while(counter<=k){
            second=second.next;
            counter++;
        }
        if(second ==null){
            head=head.next;
            return;
        }
        while(second.next !=null){
            second=second.next;
            first=first.next;
        }
        first.next=first.next.next;
    }

    public static void main(String[] args) {

    }
}
