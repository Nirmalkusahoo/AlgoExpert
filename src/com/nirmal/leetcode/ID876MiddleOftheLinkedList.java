package com.nirmal.leetcode;

public class ID876MiddleOftheLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if(head.next ==null){
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public class ListNode {
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
