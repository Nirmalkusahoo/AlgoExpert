package com.nirmal.leetcode;

public class ID221MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int maxRow=matrix.length;
        int maxCol=matrix[0].length;

        int[][] dpMatrix=new int[maxRow+1][maxCol+1];
        int largest=Integer.MIN_VALUE;
        for(int i=1;i<=maxRow;i++){
            for(int j=1;j<=maxCol;j++){
                if(matrix[i-1][j-1]=='1'){
                    dpMatrix[i][j]= 1 + Math.min(dpMatrix[i-1][j-1],Math.min(dpMatrix[i-1][j],dpMatrix[i][j-1]));
                    largest=Math.max(largest,dpMatrix[i][j]);
                }
            }
        }

        return largest * largest;
    }
}
