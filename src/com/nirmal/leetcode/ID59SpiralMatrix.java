package com.nirmal.leetcode;

public class ID59SpiralMatrix {
    public static  int[][] generateMatrix(int n) {
        int[][] array= new int[n][n];
        int starRow=0;
        int endRow=n-1;
        int startCol=0;
        int endCol=n-1;
        int num=1;
        while (starRow<=endRow && startCol<=endCol){
            for(int col=startCol;col<=endCol;col++){
                array[starRow][col]=num;
                num++;
            }
            for(int row=starRow+1;row<=endRow;row++){
                array[row][endCol]=num;
                num++;
            }

            for(int col=endCol-1;col>=startCol;col--){

                array[endRow][col]=num;
                num++;
            }
            for(int row=endRow-1;row>starRow;row--){

                array[row][startCol]=num;
                num++;
            }

            starRow++;
            endRow--;
            startCol++;
            endCol--;
//            num++;
        }
        return array;
    }

    public static void main(String[] args) {
        generateMatrix(3);
    }
}
