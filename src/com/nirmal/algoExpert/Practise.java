package com.nirmal.algoExpert;


import java.util.ArrayList;
import java.util.List;

public class Practise {

    public static class MinHeap {
        List<Integer> heap = new ArrayList<>();

        public static List<Integer> buildHeap(List<Integer> array) {
            int firstParentIdx = (array.size() - 2) / 2;
            for (int currentIndex = firstParentIdx; currentIndex >= 0; currentIndex--) {
                shiftDown(currentIndex, array.size() - 1, array);
            }
            return array;
        }

        public static void shiftDown(int currentIdx, int endIdx, List<Integer> heap) {
            int childOneIdx = currentIdx * 2 + 1;
            while (childOneIdx <= endIdx) {
                int childTwoIdx = currentIdx * 2 + 2 <= endIdx ? currentIdx * 2 + 2 : -1;
                int idxToSwap;
                if (childTwoIdx != -1 && heap.get(childTwoIdx) < heap.get(childOneIdx)) {
                    idxToSwap = childTwoIdx;
                } else {
                    idxToSwap = childOneIdx;
                }
                if (heap.get(currentIdx) > heap.get(idxToSwap)) {
                    swap(currentIdx, idxToSwap, heap);
                    currentIdx = idxToSwap;
                    childOneIdx = 2 * currentIdx + 1;
                } else {
                    return;
                }
            }
        }

        public static void shiftUp(int currentIdx, List<Integer> heap) {
            int parentIdx = (currentIdx - 1) / 2;

            while (parentIdx > 0 && heap.get(parentIdx) > heap.get(currentIdx)) {
                swap(parentIdx, currentIdx, heap);
                currentIdx = parentIdx;
                parentIdx = (currentIdx - 1) / 2;
            }
        }

        public int peak() {
            return heap.get(0);
        }

        public int remove() {
            swap(0, heap.size() - 1, heap);
            int numberToRemove = heap.get(heap.size() - 1);
            heap.remove(heap.size() - 1);
            shiftDown(0, heap.size() - 1, heap);
            return numberToRemove;
        }

        public void insert(int value) {
            heap.add(value);
            shiftUp(heap.size() - 1, heap);
        }

        public static void swap(int currentIdx, int endIdx, List<Integer> heap) {
            Integer temp = heap.get(currentIdx);
            heap.set(currentIdx, heap.get(endIdx));
            heap.set(endIdx, temp);
        }
    }


    public static void main(String[] args) {

        System.out.println(sunsetViews(new int[]{3, 5, 4, 4, 3, 1, 3, 2}, "EAST"));
    }
}
