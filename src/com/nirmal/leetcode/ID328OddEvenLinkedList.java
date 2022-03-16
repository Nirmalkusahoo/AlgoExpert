package com.nirmal.leetcode;

public class ID328OddEvenLinkedList     {

    public ListNode oddEvenList(ListNode head) {
        if(head ==null){
            return null;
        }
        ListNode odd=head;
        ListNode even=odd.next;
        ListNode evenHead=even;

        while (even != null && even.next !=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }

        odd.next=evenHead;
        return head;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
