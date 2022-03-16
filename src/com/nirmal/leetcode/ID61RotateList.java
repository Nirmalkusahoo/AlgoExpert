package com.nirmal.leetcode;

public class ID61RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }


        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;
        int newTailPosition = 0;
        if (k == 0) {
            return head;
        }
        if (k > 0) {
            newTailPosition = length - k;
        } else {
            newTailPosition = k;
        }

        ListNode newTail = head;
        for (int i = 1; i < newTailPosition; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        return newHead;
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
}
