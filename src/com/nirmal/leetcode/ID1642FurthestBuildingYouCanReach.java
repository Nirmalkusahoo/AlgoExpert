package com.nirmal.leetcode;

import java.util.PriorityQueue;

public class ID1642FurthestBuildingYouCanReach {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 1; i < heights.length; i++) {
            int diff = heights[i] - heights[i - 1];

            if (diff > 0) {
                if (pq.size() < ladders) {
                    pq.offer(diff);
                } else {
                    int br = diff;
                    if (pq.size() > 0 && diff > pq.peek()) {
                        br = pq.remove();
                        pq.offer(diff);
                    }
                    if (bricks - br >= 0) {
                        bricks = bricks - br;
                    } else {
                        return i - 1;
                    }
                }
            }
        }
        return heights.length - 1;
    }

    public static void main(String[] args) {
        System.out.println(furthestBuilding(new int[]{14, 3, 19, 3}, 17, 0));
//        System.out.println(furthestBuilding(new int[]{4,12,2,7,3,18,20,3,19},10,2));
//        System.out.println(furthestBuilding(new int[]{4,2,7,6,9,14,12},5,1));
    }
}
