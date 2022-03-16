package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ID725SplitLinkedListinParts {
    public ListNode[] splitListToParts(ListNode head, int k) {


        // INCOMPLETE //
        int length=1;
        ListNode last=head;
        while (last.next !=null){
            last=last.next;
            length++;
        }

        List<ListNode> list= new ArrayList<>();
        if(k>length){
            int counter=1;
            while (length>=0){
                ListNode node=head;
                list.add(node);
                node=node.next;
                length--;
            }
            while (counter<=k){
                list.add(new ListNode());
            }

        }
        return list.toArray(new ListNode[list.size()]);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
