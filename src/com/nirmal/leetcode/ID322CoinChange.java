package com.nirmal.leetcode;

import java.util.Arrays;

public class ID322CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] numOfCoins=new int[amount+1];
        Arrays.fill(numOfCoins,Integer.MAX_VALUE);
        numOfCoins[0]=0;
        int toCompare=0;
        for(int coin:coins){
            for(int currentAmount=1;currentAmount<amount+1;currentAmount++){
                if(coin<=currentAmount){
                    if(numOfCoins[currentAmount-coin] == Integer.MAX_VALUE){
                        toCompare= numOfCoins[currentAmount-coin];
                    } else {
                        toCompare= 1+ numOfCoins[currentAmount-coin];
                    }
                    numOfCoins[currentAmount]=Math.min(numOfCoins[amount],toCompare);
                }
            }
        }
        return numOfCoins[amount]== Integer.MAX_VALUE ? -1 : numOfCoins[amount];
    }
}
