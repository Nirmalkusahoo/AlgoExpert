package com.nirmal.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ID146LRUCache {
    int maXSize = 0;
    int currentSize = 0;
    DoublyLinkedList recentList = new DoublyLinkedList();
    Map<Integer, Node> cache = new HashMap<>();

    public ID146LRUCache(int capacity) {
        this.maXSize = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        updateRecentUsed(cache.get(key));
        return cache.get(key).value;
    }

    public void put(int key, int value) {
        if (!cache.containsKey(key)) {
            if (currentSize == maXSize) {
                evictLeastRecent();
            } else {
                currentSize++;
            }
            cache.put(key, new Node(key, value));
        } else {
            replaceValue(key, value);
        }
        updateRecentUsed(cache.get(key));
    }

    public void updateRecentUsed(Node node) {
        recentList.setHead(node);
    }

    public void replaceValue(int key, int value) {
        if (!cache.containsKey(key)) {
            return;
        }
        cache.get(key).value = value;
    }

    public void evictLeastRecent() {
        int key = recentList.tail.key;
        cache.remove(key);
        recentList.removeTail();
    }

    public static class DoublyLinkedList {
        Node head;
        Node tail;

        public void setHead(Node node) {
            if (node == head) {
                return;
            } else if (head == null) {
                head = node;
                tail = node;
            } else if (node == tail) {
                removeTail();
                head.prev = node;
                node.next = head;
                head = node;
            } else {
                node.removeBindings();
                head.prev = node;
                node.next = head;
                head = node;
            }

        }

        public void removeTail() {
            if (tail == null) {
                return;
            }
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            this.tail = this.tail.prev;
            tail.next = null;
        }
    }

    public static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        void removeBindings() {
            if (this.prev != null) {
                this.prev.next = this.next;
            }
            if (this.next != null) {
                this.next.prev = this.prev;
            }
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {

//["put","get","get","get"]
//[[4,4],[1],[3],[4]]
        ID146LRUCache obj = new ID146LRUCache(2);
        obj.put(1, 1);
        obj.put(2, 2);
        System.out.println(obj.get(1));
        obj.put(3, 3);
        System.out.println(obj.get(2));
    }
}
