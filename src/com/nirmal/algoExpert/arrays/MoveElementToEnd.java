package com.nirmal.algoExpert.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
    // Solution 1
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int start=0;
        int end=array.size()-1;
        while(start<end){
            while(start<end && array.get(end)== toMove){
                end--;
            }
            if(array.get(start) == toMove){
                int temp=array.get(start);
                array.set(start,array.get(end));
                array.set(end,temp);
            }
            start++;  // start should be outside of if to avoid infinite loop if both start and end is not equals to toMove
        }
        return array;
    }
    // Solution 2- with Multiple if else
    /*public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        Integer[] intArr= array.toArray(new Integer[array.size()]);

        System.out.println(Arrays.toString(intArr));
        int start=0;
        int end=intArr.length-1;
        while(start<end){
            int startNum=intArr[start];
            int endNum=intArr[end];
            if(startNum == toMove && endNum != toMove ){
                int temp= startNum;
                intArr[start] = endNum;
                intArr[end] = temp;
                start++;
                end--;
            } else if(startNum != toMove && endNum == toMove){
                start++;
                end--;
            } else if(startNum == toMove && endNum == toMove){
                end--;
            } else if(startNum != toMove && endNum != toMove){
                start++;
            }
        }
        return Arrays.asList(intArr);
    }*/
    public static void main(String[] args) {
        System.out.println(MoveElementToEnd.moveElementToEnd(Arrays.asList(new Integer[]{2, 1, 2, 2, 2, 3, 4, 2}),2));
    }
}
