package com.nirmal.leetcode;

public class ID206ReverseLinkedList {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode current = head;

        while (left > 1) {
            prev = current;
            current = current.next;
            left--;
            right--;
        }

        ListNode connection = prev;
        ListNode tail = current;

        while (right > 0) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            right--;
        }

        if (connection != null) {
            connection.next = prev;
        } else {
            head = prev;
        }

        tail.next = current;
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        reverseBetween(node1, 2, 4);
    }
}
