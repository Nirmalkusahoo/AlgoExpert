package com.nirmal.algoExpert;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practise {

    public static class MinHeap {
        List<Integer> heap = new ArrayList<>();

        MinHeap(List<Integer> array) {
            heap = buildHeap(array);
        }

        public List<Integer> buildHeap(List<Integer> array) {
            int firstPArentIdx = (array.size() - 2) / 2;
            for (int currentIdx = firstPArentIdx; currentIdx >= 0; currentIdx--) {
                siftDown(currentIdx, array.size()-1, array);
            }
            return array;
        }

        public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
            int childOneIdx = (2 * currentIdx) + 1;

            while (childOneIdx <= endIdx) {
                int childTwoIdx = (2 * currentIdx) + 2;
                childTwoIdx = childTwoIdx <= endIdx ? childTwoIdx : -1;

                int idxToSwap;
                if (childTwoIdx != -1 && heap.get(childTwoIdx) < heap.get(childOneIdx)) {
                    idxToSwap = childTwoIdx;
                } else {
                    idxToSwap = childOneIdx;
                }

                if (heap.get(currentIdx) > heap.get(idxToSwap)) {
                    swap(currentIdx, idxToSwap, heap);
                    currentIdx = idxToSwap;
                    childOneIdx = (currentIdx * 2) + 1;
                } else {
                    return;
                }
            }
        }

        public void siftUp(int currentIdx, List<Integer> heap) {
            int parentIdx = (currentIdx - 2) / 2;
            while (currentIdx > 0 && heap.get(currentIdx) < heap.get(parentIdx)) {
                swap(currentIdx, parentIdx, heap);
                currentIdx = parentIdx;
                parentIdx = (currentIdx - 2) / 2;
            }
        }

        public void insert(int value) {
            heap.add(value);
            siftUp(heap.size() - 1, heap);
        }

        public int remove() {
            swap(0, heap.size() - 1, heap);
            int numToRemove = heap.get(heap.size() - 1);
            heap.remove(heap.size() - 1);
            siftDown(0, heap.size(), heap);
            return numToRemove;
        }

        public static void swap(int firstIdx, int secondIdx, List<Integer> heap) {
            int temp = heap.get(firstIdx);
            heap.set(firstIdx, heap.get(secondIdx));
            heap.set(secondIdx, temp);
        }

        public int peek() {
            return heap.get(0);
        }
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41);
        System.out.println(new MinHeap(list));
    }
}
