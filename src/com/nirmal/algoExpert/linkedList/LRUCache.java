package com.nirmal.algoExpert.linkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int maxSize;
    int currentSize = 0;

    Map<String, DoublyLinkedListNode> cache = new HashMap<String, DoublyLinkedListNode>();
    DoublyLinkedList list = new DoublyLinkedList();

    public LRUCache(int maxSize) {
        this.maxSize = maxSize > 1 ? maxSize : 1;
    }

    public void insertKeyValuePair(String key, int value) {
        // Write your code here.
        if (!cache.containsKey(key)) {
            if (currentSize == maxSize) {
                removeLeastRecent();
            } else {
                currentSize++;
            }
            cache.put(key, new DoublyLinkedListNode(key, value));
        } else {
            replace(key, value);
        }
        updateRecentNode(cache.get(key));
    }

    public void removeLeastRecent() {
        String key = list.tail.key;
        list.removeTail();
        cache.remove(key);
    }

    public void updateRecentNode(DoublyLinkedListNode node) {
        list.setHead(node);
    }

    public void replace(String key, int value) {
        if (!cache.containsKey(key)) {
            return;
        }
        cache.get(key).value = value;
    }

    public LRUResult getValueFromKey(String key) {
        // Write your code here.
        if (!cache.containsKey(key)) {
            return new LRUResult(false, -1);
        }
        updateRecentNode(cache.get(key));
        return new LRUResult(true, cache.get(key).value);
    }

    public String getMostRecentKey() {
        // Write your code here.
        if (list.head == null) {
            return "";
        }
        return list.head.key;
    }

    public static class LRUResult {
        boolean found;
        int value;

        LRUResult(boolean found, int value) {
            this.found = found;
            this.value = value;
        }
    }

    public static class DoublyLinkedList {
        DoublyLinkedListNode tail;
        DoublyLinkedListNode head;

        public void setHead(DoublyLinkedListNode node) {
            if (head == node) {
                return;
            } else if (head == null) {
                head = node;
                tail = node;
            } else if (head == tail) {
                tail.previous = node;
                head = node;
                head.next=tail;
            } else {
                if (node == tail) {
                    removeTail();
                }
                node.removeBindings();
                head.previous = node;
                node.next = head;
                head = node;
            }
        }

        public void removeTail() {
            if (tail == null) {
                return;
            } else if (tail == head) {
                tail = null;
                head = null;
                return;
            } else {
                tail = tail.previous;
                tail.next = null;
            }
        }
    }

    public static class DoublyLinkedListNode {
        String key;
        int value;
        DoublyLinkedListNode previous;
        DoublyLinkedListNode next;

        DoublyLinkedListNode(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public void removeBindings() {
            if (previous != null) {
                previous.next = next;
            }
            if (next != null) {
                next.previous = previous;
            }
            previous = null;
            next = null;
        }
    }
}
