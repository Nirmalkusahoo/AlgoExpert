package com.nirmal.leetcode;

public class ID1423MaximumPointsYouCanObtainfromCards {
    public static int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int ans = 0;
        for (int num : cardPoints) {
            sum = sum + num;
        }

        int window = 0;
        int length = cardPoints.length;

        if (length == k) {
            return sum;
        }
        for (int i = 0; i < length - k - 1; i++) {
            window = window + cardPoints[i];
        }

        for (int i = length - k - 1; i < length; i++) {
            window = window + cardPoints[i];
            ans = Math.max(ans, sum - window);
            window = window - cardPoints[i - (length - k - 1)];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3));
    }
}
