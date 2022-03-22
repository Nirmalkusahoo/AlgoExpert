package com.nirmal.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ID146LRUCache {
    int maxSize = 0;
    int currentSize = 0;

    Map<Integer, DoublyLinkedListNode> cache = new HashMap<>();
    DoublyLinkedList list = new DoublyLinkedList();

    public ID146LRUCache(int capacity) {
        maxSize = capacity;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            updateLatest(cache.get(key));
            return cache.get(key).key;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (!cache.containsKey(key)) {
            if (currentSize == maxSize) {
                removeLeastNode();
            } else {
                currentSize++;
            }
            cache.put(key, new DoublyLinkedListNode(key, value));
        } else {
            replaceKey(key, value);
        }
        updateLatest(cache.get(key));
    }

    public void replaceKey(int key, int value) {
        if (!cache.containsKey(key)) {
            return;
        }
        cache.get(key).value = value;
    }

    public void updateLatest(DoublyLinkedListNode node) {
        list.setHead(node);
    }

    public void removeLeastNode() {
        if (list.tail !=null){
            int key = list.tail.key;
            list.removeTail();
            cache.remove(key);
        }
    }

    public static class DoublyLinkedList {
        DoublyLinkedListNode head;
        DoublyLinkedListNode tail;

        public void setHead(DoublyLinkedListNode node) {
            if (node == head) {
                return;
            } else if (head == null) {
                head = node;
            } else if (head == tail) {
                node.next = tail;
                head = node;
                tail.previous = head;
            } else {
                if (node == tail) {
                    removeTail();
                }
                head.previous = node;
                node.next = head;
                head = node;
            }
        }

        public void removeTail() {
            if (tail == null) {
                return;
            } else if (head == tail) {
                head = null;
                tail = null;
                return;
            } else {
                tail = tail.previous;
                tail.next = null;
            }
        }
    }

    public static class DoublyLinkedListNode {
        int key;
        int value;

        DoublyLinkedListNode previous = null;
        DoublyLinkedListNode next= null;

        DoublyLinkedListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
