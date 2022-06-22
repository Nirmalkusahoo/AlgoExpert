package com.nirmal.leetcode;

import java.util.PriorityQueue;

public class ID215KthLargestElementinanArray {
    public static int findKthLargest(int[] nums, int k) {
       /* Arrays.sort(nums);
        return nums[nums.length-k];*/

        PriorityQueue<Integer> pq = new PriorityQueue<>(k + 1);

        for (int n : nums) {
            pq.offer(n);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }
}
