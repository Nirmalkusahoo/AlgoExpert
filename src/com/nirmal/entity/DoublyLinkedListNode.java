package com.nirmal.entity;

public  class DoublyLinkedListNode {
    public String key;
    public int value;
    public DoublyLinkedListNode prev;
    public DoublyLinkedListNode next;

    public DoublyLinkedListNode(String key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    public void removeBindings() {
        if (prev != null) {
            prev.next = next;
        }
        if (next != null) {
            next.prev = prev;
        }
        prev = null;
        next = null;
    }
}
