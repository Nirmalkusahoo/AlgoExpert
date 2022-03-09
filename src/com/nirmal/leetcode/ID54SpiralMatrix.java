package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ID54SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list= new ArrayList<>();
        int startRow=0;
        int endRow= matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while (startRow<=endRow && startCol<=endCol){

            for(int col=startCol;col<=endCol;col++){
                list.add(matrix[startRow][col]);
            }

            for (int row=startRow;row<=endRow;row++){
                list.add(matrix[row][endCol]);
            }

            for(int col=endCol-1;col>=startCol;col--){
                if(startRow==endRow){
                    break;
                }
                list.add(matrix[endRow][col]);
            }

            for (int row=endRow-1;row>startRow;row--){
                if(startCol==endCol){
                    break;
                }
                list.add(matrix[row][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return list;
    }
}
