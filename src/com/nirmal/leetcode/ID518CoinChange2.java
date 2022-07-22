package com.nirmal.leetcode;

public class ID518CoinChange2 {

    public int change(int amount, int[] coins) {
        int[] ways = new int[amount + 1];
        ways[0] = 1;
        for (int coin : coins) {
            for (int targetAMount = 1; targetAMount < amount + 1; targetAMount++) {
                if (coin <= targetAMount) {
                    ways[targetAMount] = ways[targetAMount] + ways[targetAMount - coin];
                }
            }
        }
        return ways[amount];
    }
}
