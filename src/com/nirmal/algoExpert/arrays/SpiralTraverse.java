package com.nirmal.algoExpert.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.

        List<Integer> result = new ArrayList<Integer>();

        if(array.length==0){
            return new ArrayList<Integer>();
        }

        int startRow=0;
        int endRow=array.length-1;
        int startColumn=0;
        int endColumn=array[0].length-1;

        while(startRow<=endRow && startColumn<=endColumn){
            for(int col =startColumn ;col<=endColumn;col++){
                result.add(array[startRow][col]);
            }
            for(int row=startRow+1; row<=endRow;row++){
                result.add(array[row][endColumn]);
            }
            for(int col=endColumn-1; col>=startColumn;col--){
                if(startRow==endRow){
                    break;
                }
                result.add(array[endRow][col]);
            }
            for(int row=endRow-1; row>startRow;row--){
                if(startColumn == endColumn){
                    break;
                }
                result.add(array[row][startColumn]);
            }

            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
        return result;
    }

    // Solution 2-recursion;
/*    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        if(array.length==0){
            return new ArrayList<Integer>();
        }
        List<Integer> result= new ArrayList<Integer>();

        result=spiralFill(array,0, array.length-1,0, array[0].length-1,result );
        return result;
    }

    public static List<Integer> spiralFill(int[][] array,int startRow,int endRow,int startCol, int endCol, List<Integer> result){
        if(startRow>endRow || startCol>endCol){
            return result;
        }

        for(int col=startCol;col<=endCol;col++){
            result.add(array[startRow][col]);
        }
        for(int row=startRow+1 ;row<=endRow;row++){
            result.add(array[row][endCol]);
        }
        for(int col=endCol-1;col>=startCol;col--){
            if(startRow==endRow){
                break;
            }
            result.add(array[endRow][col]);
        }
        for(int row=endRow-1;row>startRow;row--){
            if(startCol == endCol){
                break;
            }
            result.add(array[row][startCol]);
        }
        return spiralFill(array,startRow+1,endRow-1,startCol+1,endCol-1,result);
    }*/
}
