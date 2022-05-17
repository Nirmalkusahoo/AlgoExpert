package com.nirmal.leetcode;

public class ID1290ConvertBinaryNumberinaLinkedListtoInteger {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum = sum * 2;
            sum = sum + head.val;
            head = head.next;
        }
        return sum;
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
