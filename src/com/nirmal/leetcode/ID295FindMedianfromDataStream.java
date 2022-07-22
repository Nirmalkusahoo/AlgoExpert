package com.nirmal.leetcode;

import java.util.PriorityQueue;

public class ID295FindMedianfromDataStream {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);

    public void MedianFinder() {

    }

    public void addNum(int num) {
        if (maxHeap.size() == 0 || maxHeap.peek() > num) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }
        reBalance();
    }

    public void reBalance() {
        if (maxHeap.size() - minHeap.size() == 2) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() - maxHeap.size() == 2) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return ((double) maxHeap.peek() + (double) minHeap.peek()) / 2;
        } else if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } else {
           return minHeap.peek();
        }
    }
}
