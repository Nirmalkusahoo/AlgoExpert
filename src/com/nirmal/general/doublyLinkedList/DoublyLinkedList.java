package com.nirmal.general.doublyLinkedList;

public class DoublyLinkedList {

    public Node head;
    public Node tail;
    public int length;


    public static class Node {
        public Node previous;
        public Node next;
        public int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void traverseForward() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void traverseBackWard() {
        if (tail == null) {
            return;
        }
       Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.previous;
        }
        System.out.print("null");
    }

    public void insertData(int value) {
        Node newNode= new Node(value);
        if (isEmpty()){
            tail= newNode;
        } else {
              head.previous = newNode;
        }
        newNode.next=head;
        head=newNode;
        length ++;
    }

    public static void main(String[] args) {
        DoublyLinkedList obj=new DoublyLinkedList();
        obj.insertData(1);
        obj.insertData(10);

        obj.traverseForward();
        obj.traverseBackWard();
    }
}
