package com.nirmal.general.doublyLinkedList;

public class TraversingDoublyLinkedList {

    public Node head;
    public Node tail;
    public int length;


    public class Node{
        public Node prev;
        public Node next;
        public int value;
        public Node(int value){
            this.value=value;
        }
    }

    public boolean isEmpty(){
        return this.length ==0;
    }

}
