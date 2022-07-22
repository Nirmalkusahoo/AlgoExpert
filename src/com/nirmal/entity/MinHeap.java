package com.nirmal.entity;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

    List<Integer> heap = new ArrayList<>();

    MinHeap(List<Integer> array) {
        this.heap = buildHeap(array);
    }

    public List<Integer> buildHeap(List<Integer> array) {
        int firstParentIdx = (array.size() - 2) / 2;
        for (int currentIdx = firstParentIdx; currentIdx >= 0; currentIdx--) {
            shiftDown(currentIdx, array.size() - 1, array);
        }
        return array;
    }

    public void shiftDown(int currentIdx, int endIdx, List<Integer> heap) {
        int firstChildIdx = 2 * currentIdx + 1;
        while (firstChildIdx <= endIdx) {
            int secondChildIdx = 2 * currentIdx + 2 <= endIdx ? 2 * currentIdx + 2 : -1;
            int idxToBeSwap;
            if (secondChildIdx != -1 && heap.get(secondChildIdx) < heap.get(firstChildIdx)) {
                idxToBeSwap = secondChildIdx;
            } else {
                idxToBeSwap = firstChildIdx;
            }

            if (heap.get(idxToBeSwap) < heap.get(currentIdx)) {
                swap(idxToBeSwap, currentIdx, heap);
                currentIdx = idxToBeSwap;
                firstChildIdx = 2 * currentIdx + 1;
            } else {
                return;
            }
        }
    }

    public void shiftUp(int currentIdx, List<Integer> heap) {
        int parentIdx = (currentIdx - 1) / 2;
        while (parentIdx > 0 && heap.get(parentIdx) > heap.get(currentIdx)) {
            swap(parentIdx, currentIdx, heap);
            currentIdx = parentIdx;
            parentIdx = (currentIdx - 1) / 2;
        }
    }

    public int peek() {
        return heap.get(0);
    }

    public int remove() {
        swap(heap.size() - 1, 0, heap);
        int value = heap.get(heap.size() - 1);
        heap.remove(heap.size() - 1);
        shiftDown(0, heap.size() - 1, heap);
        return value;
    }

    public void insert(int value) {
        heap.add(value);
        shiftUp(heap.size() - 1, heap);
    }

    public void swap(int first, int second, List<Integer> list) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}
