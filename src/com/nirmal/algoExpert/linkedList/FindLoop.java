package com.nirmal.algoExpert.linkedList;

import java.util.ArrayList;
import java.util.List;

public class FindLoop {

    public static class LinkedList{
        public int value;
        public LinkedList next;
        public LinkedList(int value){
            this.value=value;
        }
    }
    // Solution 1:
    public static LinkedList findLoop(LinkedList head) {
        // Write your code here.

        LinkedList first=head.next;
        LinkedList second=head.next.next;

        while(first !=second){
            first=first.next;
            second=second.next.next;
        }
        first=head;
        while (first !=second){
            first=first.next;
            second=second.next;
        }
        return first;
    }

    // Solution 2:
    /*public static LinkedList findLoop(LinkedList head) {
        // Write your code here.

        LinkedList currenNode=head;
        List<LinkedList> list= new ArrayList<LinkedList>();

        while(!list.contains(currenNode)){
            list.add(currenNode);
            currenNode = currenNode.next;
        }
        return currenNode;
    }*/
}
