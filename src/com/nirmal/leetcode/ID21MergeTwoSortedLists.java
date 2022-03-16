package com.nirmal.leetcode;

public class ID21MergeTwoSortedLists {
    /*public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode p1=list1;
        ListNode p2=list2;
        ListNode p1prev=null;

        while (p1 != null && p2 !=null ){
            if(p1.val<p2.val){
                p1prev=p1;
                p1=p1.next;
            } else {
                if(p1prev != null){
                    p1prev.next=p2;
                }
                p1prev=p2;
                p2=p2.next;
                p1prev.next=p1;
            }
        }

        if(p1 ==null){
            p1prev.next=p2;
        }

        return list1.val< list2.val ? list1 : list2;
    }*/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        else if(list2 == null){
            return list1;
        } else if(list1.val< list2.val){
            list1.next= mergeTwoLists(list1.next,list2);
            return list1;
        } else {
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }


    }

    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
