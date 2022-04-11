package com.nirmal.algoExpert.heaps;

import java.util.ArrayList;
import java.util.List;

public class SortKSortedArray {
    public static int[] sortKSortedArray(int[] array, int k) {
        // Write your code here.
        int nextIndexToInsertElement = 0;

        List<Integer> heapValues = new ArrayList<>();
        for (int i = 0; i < Math.min(k + 1, array.length); i++) {
            heapValues.add(array[i]);
        }

        MinHeap minHeapWithKElement = new MinHeap(heapValues);

        for (int i = k + 1; i < array.length; i++) {
            array[nextIndexToInsertElement] = minHeapWithKElement.remove();
            nextIndexToInsertElement++;

            int currentElement = array[i];
            minHeapWithKElement.insert(currentElement);
        }

        while (!minHeapWithKElement.isEmpty()) {
            array[nextIndexToInsertElement] = minHeapWithKElement.remove();
            nextIndexToInsertElement++;
        }
        return array;
    }

    public static class MinHeap {
        public List<Integer> heap = new ArrayList<>();

        MinHeap(List<Integer> list) {
            this.heap = buildHeap(list);
        }

        public List<Integer> buildHeap(List<Integer> list) {

            int firstPArentIndex = (list.size() - 2) / 2;
            for (int currentIdx = firstPArentIndex; currentIdx >= 0; currentIdx--) {
                siftDown(currentIdx, list.size() - 1, list);
            }
            return list;
        }

        public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
            int firstChildIdx = 2 * currentIdx + 1;
            while (firstChildIdx <= endIdx) {
                int secondChildIdx = 2 * currentIdx + 2;
                secondChildIdx = secondChildIdx <= endIdx ? secondChildIdx : -1;
                int indexToBeSwap;
                if (secondChildIdx != -1 && heap.get(secondChildIdx) < heap.get(firstChildIdx)) {
                    indexToBeSwap = secondChildIdx;
                } else {
                    indexToBeSwap = firstChildIdx;
                }

                if (heap.get(indexToBeSwap) < heap.get(currentIdx)) {
                    swap(indexToBeSwap, currentIdx, heap);
                    currentIdx = indexToBeSwap;
                    firstChildIdx = 2 * currentIdx + 1;
                } else {
                    return;
                }
            }
        }

        public void siftUp(int currentIdx, List<Integer> heap) {
            int parentIdx = (currentIdx - 1) / 2;
            while (currentIdx > 0 && heap.get(currentIdx) < heap.get(parentIdx)) {
                swap(currentIdx, parentIdx, heap);
                currentIdx = parentIdx;
                parentIdx = (currentIdx - 1) / 2;
            }
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

        public boolean isEmpty() {
            return heap.size() == 0;
        }

        public void swap(int first, int second, List<Integer> heap) {
            int temp = heap.get(first);
            heap.set(first, heap.get(second));
            heap.set(second, temp);
        }
    }

    public static void main(String[] args) {
        System.out.println(sortKSortedArray(new int[]{3, 2, 1, 5, 4, 7, 6, 5},3));
    }
}
