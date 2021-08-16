package com.nirmal.general.doublyLinkedList;

import java.util.NoSuchElementException;

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

    public void insertAtEnd(int value){
        Node newNode= new Node(value);
        if(isEmpty()){
            head = newNode;
            tail = newNode;

        } else {
            tail.next= newNode;
            newNode.previous= tail;
            tail=newNode;
        }
        length++;
    }

    public Node deleteFirst(){
        Node temp=head;
        if(isEmpty()){
            throw  new NoSuchElementException();
        } else if(head == tail){
            head=null;
            tail= null;
            length--;
        } else {
            head= head.next;
            head.previous=null;
            length--;
            temp.next= null;
        }
        return temp;
    }

    public Node deleteLast(){
        Node temp=tail;
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(head==tail){
            head=null;
            tail=null;
            length--;
        } else {
            tail=tail.previous;
            tail.next=null;
            length--;
            temp.previous=null;
        }
        return temp;
    }

    public static void main(String[] args) {
        DoublyLinkedList obj=new DoublyLinkedList();
//        obj.insertData(1);
        obj.insertData(10);
        obj.insertAtEnd(20);
        obj.traverseForward();
        obj.deleteFirst();
        obj.traverseForward();
        obj.deleteFirst();
        obj.traverseForward();
        obj.deleteFirst();
//        obj.traverseBackWard();
    }
}
