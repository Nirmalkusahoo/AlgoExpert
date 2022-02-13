package com.nirmal.algoExpert.recursion;

public class StairCaseTraversal {

    public int staircaseTraversal(int height, int maxSteps) {
        // Write your code here.

        int[] ways= new int[height+1];
        ways[0]=1;
        ways[1]=1;

        for (int currentHeight=2;currentHeight<height+1;currentHeight++){
            int step=1;
            while (step<=maxSteps && step<=currentHeight){
                ways[currentHeight] = ways[currentHeight] + ways[currentHeight-step];
                step++;
            }
        }
        return ways[height];
    }
}
