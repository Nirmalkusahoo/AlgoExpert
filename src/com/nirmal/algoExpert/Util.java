package com.nirmal.algoExpert;

import com.nirmal.entity.LinkedList;

import java.util.List;

public class Util {
    /*  @Usage
        LinkedList head = new LinkedList(1);
        Util.createLinkedList(head, Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6));
    */
    public static LinkedList createLinkedList(LinkedList head, List<Integer> list) {
        LinkedList current = head;
        for (Integer val : list) {
            current.next = new LinkedList(val);
            current = current.next;
        }
        return head;
    }

    public static LinkedList getNthNode(int pos, LinkedList node) {
        int count = 1;
        while (pos != count) {
            node = node.next;
            count++;
        }
        return node;
    }
}
