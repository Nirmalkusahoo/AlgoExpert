package com.nirmal.algoExpert.heaps;

import java.util.ArrayList;
import java.util.List;

public class MinHeapConstruction {

    public static class MinHeap {
        List<Integer> heap = new ArrayList<Integer>();

        MinHeap(List<Integer> array) {
            heap = buildHeap(array);
        }

        public List<Integer> buildHeap(List<Integer> array) {
            int firstParentIdx = (array.size() - 2) / 2;
            for (int currentIdx = firstParentIdx; currentIdx >= 0; currentIdx--) {
                siftDown(currentIdx, array.size() - 1, array);
            }
            return array;
        }

        public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
            int childOneIdx = 2 * currentIdx + 1;

            while (childOneIdx <= endIdx) {
                int childTwoIdx = 2 * currentIdx + 2 <= endIdx ? 2 * currentIdx + 2 : -1;

                int idxToBeSwap;
                if (childTwoIdx != -1 && heap.get(childTwoIdx) < heap.get(childOneIdx)) {
                    idxToBeSwap = childTwoIdx;
                } else {
                    idxToBeSwap = childOneIdx;
                }
                if (heap.get(currentIdx) > heap.get(idxToBeSwap)) {
                    swap(currentIdx, idxToBeSwap, heap);
                    currentIdx = idxToBeSwap;
                    childOneIdx = 2 * currentIdx + 1;
                } else {
                    return;
                }

            }
        }

        public void siftUp(int currentIdx, List<Integer> heap) {
            int parentIdx = (currentIdx - 1) / 2;
            while (parentIdx > 0 && heap.get(parentIdx) > heap.get(currentIdx)) {
                swap(currentIdx, parentIdx, heap);
                currentIdx = parentIdx;
                parentIdx = (currentIdx - 1) / 2;
            }
        }

        public int peak() {
            return heap.get(0);
        }

        public int remove() {
            swap(0, heap.size() - 1, heap);
            int valueToBeRemoved = heap.get(heap.size() - 1);
            heap.remove(heap.size() - 1);
            siftDown(0, heap.size() - 1, heap);
            return valueToBeRemoved;
        }

        public void insert(int value) {
            heap.add(value);
            siftUp(heap.size() - 1, heap);
        }

        public void swap(int i, int j, List<Integer> heap) {
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }
    }
}
