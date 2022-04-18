package com.nirmal.leetcode;

import java.util.Stack;

public class ID430FlattenaMultilevelDoublyLinkedList {

    // Solution 1: Iterative approach
    // For solution watch- https://www.youtube.com/watch?v=F-oPHhK1em0
    public Node flatten(Node head) {
        Node cur = head;
        Node tail = head;
        Stack<Node> stack = new Stack<>();

        while (cur != null) {
            Node child = cur.child;
            if (child != null) {
                Node next = cur.next;
                if (next != null) {
                    stack.push(next);
                    next.prev = null;
                }
                cur.next = child;
                child.prev = cur;
                cur.child = null;
            }
            tail = cur;
            cur = cur.next;
        }

        while (!stack.isEmpty()) {
            cur = stack.pop();
            tail.next = cur;
            cur.prev = tail;
            if (cur != null) {
                tail = cur;
                cur = cur.next;
            }
        }
        return head;

    }


    // Solution 2:Recursive approach
    // For solution watch-https://www.youtube.com/watch?v=RIyPgR7AF7M
  /*  public Node flatten(Node head) {
        if (head != null) {
            flatten_rec(head);
        }
        return head;
    }

    public static Node flatten_rec(Node head) {

        Node current = head;
        Node tail = head;
        while (current != null) {
            Node next = current.next;
            Node child = current.child;
            if (child != null) {
                Node innerTail = flatten_rec(child);
                innerTail.next = next;
                if (next != null) {
                    next.prev = innerTail;
                }
                current.next = child;
                child.prev = current;
                current.child = null;
                current = tail;
            } else {
                current = next;
                if (current != null) {
                    tail = current;
                }
            }
        }
        return tail;
    }*/

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    ;
}
