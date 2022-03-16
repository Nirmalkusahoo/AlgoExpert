package com.nirmal.leetcode;

public class ID19RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode first = head;
        ListNode second = head;
        while (n > 0) {
            second = second.next;
            n--;
        }
        if (second == null) {
            head = head.next;
            return head;
        }

        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;
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
}
