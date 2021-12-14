package com.nirmal.algoExpert.dynamicProgramming;

public class NumberOfWaysTraverseGraph {

    // Solution 1:
   /* public int numberOfWaysToTraverseGraph(int width, int height) {
        // Write your code here.

        if(height ==1 || width ==1){
            return 1;
        }
        return numberOfWaysToTraverseGraph(width-1,height) + numberOfWaysToTraverseGraph(width,height-1);
    }*/

    // Solution 2:
    public int numberOfWaysToTraverseGraph(int width, int height) {
        // Write your code here.

        int[][] numberOfWays = new int[height + 1][width + 1];

        for (int heightIdx = 1; heightIdx < height + 1; heightIdx++) {
            for (int widthIdx = 1; widthIdx < width + 1; widthIdx++) {
                if (widthIdx == 1 || heightIdx == 1) {
                    numberOfWays[heightIdx][widthIdx] = 1;
                } else {
                    int waysLeft = numberOfWays[heightIdx][widthIdx - 1];
                    int waysUp = numberOfWays[heightIdx - 1][widthIdx];
                    numberOfWays[heightIdx][widthIdx] = waysLeft + waysUp;
                }
            }
        }

        return numberOfWays[height][width];
    }

    public static void main(String[] args) {
        NumberOfWaysTraverseGraph obj = new NumberOfWaysTraverseGraph();
        System.out.println(obj.numberOfWaysToTraverseGraph(4,5));
    }
}
