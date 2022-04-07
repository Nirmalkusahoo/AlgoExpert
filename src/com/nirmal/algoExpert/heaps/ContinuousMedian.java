package com.nirmal.algoExpert.heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class ContinuousMedian {
    Heap lowerHalf = new Heap(Heap::MAX_HEAP_FUNC, new ArrayList<Integer>());
    Heap greaterHalf = new Heap(Heap::MIN_HEAP_FUNC, new ArrayList<Integer>());
    double median = 0;

    public void insert(int number) {
        // Write your code here.
        if (lowerHalf.length == 0 || number < lowerHalf.peak()) {
            lowerHalf.insert(number);
        } else {
            greaterHalf.insert(number);
        }
        reBalanceHeaps();
        updateMedian();
    }

    public void reBalanceHeaps() {
        if (lowerHalf.length - greaterHalf.length == 2) {
            greaterHalf.insert(lowerHalf.remove());
        } else if (greaterHalf.length - lowerHalf.length == 2) {
            lowerHalf.insert(greaterHalf.remove());
        }
    }

    public void updateMedian() {
        if (lowerHalf.length == greaterHalf.length) {
            median = ((double) lowerHalf.peak() + (double) greaterHalf.peak()) / 2;
        } else if (lowerHalf.length > greaterHalf.length) {
            median = lowerHalf.peak();
        } else {
            median = greaterHalf.peak();
        }
    }

    public double getMedian() {
        return median;
    }

    static class Heap {
        List<Integer> heap = new ArrayList<>();
        BiFunction<Integer, Integer, Boolean> comparisonFunc;
        int length;

        Heap(BiFunction<Integer, Integer, Boolean> func, List<Integer> array) {
            comparisonFunc = func;
            heap = buildHeap(array);
            length = heap.size();
        }

        public List<Integer> buildHeap(List<Integer> array) {
            int firstParentIdx = (array.size() - 2) / 2;

            for (int currentIdx = firstParentIdx; currentIdx >= 0; currentIdx--) {
                siftDown(currentIdx, array.size() - 1, array);
            }
            return array;
        }

        public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
            int firstChildIdx = currentIdx * 2 + 1;
            while (firstChildIdx <= endIdx) {
                int secondChildIdx = currentIdx * 2 + 2;
                secondChildIdx = secondChildIdx <= secondChildIdx ? endIdx : -1;
                int indexToSwap;
                if (secondChildIdx != -1) {
                    if (comparisonFunc.apply(heap.get(firstChildIdx), heap.get(secondChildIdx))) {
                        indexToSwap = firstChildIdx;
                    } else {
                        indexToSwap = secondChildIdx;
                    }
                } else {
                    indexToSwap = firstChildIdx;
                }

                if (comparisonFunc.apply(heap.get(indexToSwap), heap.get(currentIdx))) {
                    swap(indexToSwap, currentIdx, heap);
                    currentIdx = indexToSwap;
                    firstChildIdx = currentIdx * 2 + 1;
                } else {
                    return;
                }
            }
        }

        public void siftUp(int currentIdx, List<Integer> heap) {
            int parentIdx = (currentIdx - 1) / 2;
            while (currentIdx > 0) {
                if (comparisonFunc.apply(heap.get(currentIdx), heap.get(parentIdx))) {
                    swap(currentIdx, parentIdx, heap);
                    currentIdx = parentIdx;
                    parentIdx = (currentIdx - 1) / 2;
                } else {
                    return;
                }
            }
        }

        public int peak() {
            return heap.get(0);
        }

        public int remove() {
            swap(0, heap.size() - 1, heap);
            int numberToRemove = heap.get(heap.size() - 1);
            heap.remove(heap.size() - 1);
            length--;
            siftDown(0, heap.size() - 1, heap);
            return numberToRemove;
        }

        public void insert(int value) {
            heap.add(value);
            length++;
            siftUp(heap.size() - 1, heap);
        }

        public void swap(int firsIdx, int secondIdx, List<Integer> heap) {
            Integer temp = heap.get(firsIdx);
            heap.set(firsIdx, heap.get(secondIdx));
            heap.set(secondIdx, temp);
        }

        public static Boolean MAX_HEAP_FUNC(Integer a, Integer b) {
            return a > b;
        }

        public static Boolean MIN_HEAP_FUNC(Integer a, Integer b) {
            return a < b;
        }
    }


}
