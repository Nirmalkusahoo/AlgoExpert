package com.nirmal.leetcode;

public class Id2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry=0;
        ListNode newHead= new ListNode(0);
        ListNode currentNode=newHead;
        while (l1 !=null || l2!=null || carry!=0){
            int valueOne=l1 !=null ? l1.val :0;
            int valueTwo=l2 !=null ? l2.val :0;

            int sum =valueOne + valueTwo + carry;
            carry= sum/10;
            int num=sum%10;

            ListNode newNode= new ListNode(num);
            currentNode.next=newNode;
            currentNode=currentNode.next;

            l1=l1 !=null ? l1.next :null;
            l2=l2 !=null ?l2.next:null;
        }
        return newHead.next;
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
