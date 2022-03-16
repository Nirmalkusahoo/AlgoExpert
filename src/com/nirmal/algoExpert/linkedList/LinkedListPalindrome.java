package com.nirmal.algoExpert.linkedList;

public class LinkedListPalindrome {
//    Solution:2
    public boolean linkedListPalindrome(LinkedList head) {
        // Write your code here.

        LinkedList slow=head;
        LinkedList fast=head;

        while (fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        LinkedList reveredHead=reverse(slow);

        while (reveredHead !=null){
            if(head.value != reveredHead.value){
                return false;
            }
            head=head.next;
            reveredHead=reveredHead.next;
        }
        return true;
    }

    public static LinkedList reverse(LinkedList head){
        LinkedList previous=null;
        LinkedList current=head;

        while(current !=null){
            LinkedList next=current.next;
            current.next=previous;
            previous=current;
            current= next;
        }
        return previous;
    }

    //    Solution:1
    /*public boolean linkedListPalindrome(LinkedList head) {
        // Write your code here.

        Info info = isPalindrome(head, head);
        return info.isEqual;
    }

    public static Info isPalindrome(LinkedList left, LinkedList right) {
        if (right == null) {
            return new Info(true, left);
        }
        Info recursiveCallResults = isPalindrome(left, right.next);
        LinkedList leftNodeToBeCompared = recursiveCallResults.leftNode;

        boolean isEqualTill = recursiveCallResults.isEqual && leftNodeToBeCompared.value == right.value;
        return new Info(isEqualTill, leftNodeToBeCompared.next);

    }

    public static class Info {
        boolean isEqual;
        LinkedList leftNode;

        Info(boolean value, LinkedList leftNode) {
            this.isEqual = value;
            this.leftNode = leftNode;
        }
    }*/



    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
        }
    }
}
