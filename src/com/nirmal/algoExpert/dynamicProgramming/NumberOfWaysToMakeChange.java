package com.nirmal.algoExpert.dynamicProgramming;

public class NumberOfWaysToMakeChange {
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {

        // Write your code here.
        int[] ways = new int[n + 1];
        ways[0] = 1;

        for (int denom : denoms) {
            for (int amount = 1; amount <= n; amount++) {
                if (denom <= amount) {
                    ways[amount] = ways[amount] + ways[amount - denom];
                }
            }
        }
        return ways[n];
    }

    public static void main(String[] args) {

    }
}
