package com.nirmal.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ID1046LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            int maxStone = maxHeap.remove();
            int secondMax = maxHeap.remove();
            if (maxStone != secondMax) {
                maxHeap.add(maxStone - secondMax);
            }
        }

        return maxHeap.isEmpty() ? 0: maxHeap.remove() ;
    }
}
