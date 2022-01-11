package com.nirmal.algoExpert.searching;

import java.util.Arrays;

public class FindThreeLargestNumber {
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] largest=new int[3];
        Arrays.fill(largest,Integer.MIN_VALUE);
        for(int num:array){
            if(num>largest[2]){
                updateLargest(largest,num,2);
            } else if(num>largest[1]){
                updateLargest(largest,num,1);
            } else if(num>largest[0]){
                updateLargest(largest,num,0);
            }
        }
        for(int num:largest){
            System.out.print(num+ " ");
        }
        return largest;
    }

    public static void updateLargest(int[] largest,int num,int index){
        for(int i=0;i<=index;i++){
            if(i==index){
                largest[i]=num;
            } else {
                largest[i]=largest[i+1];
            }
        }
    }

    public static void main(String[] args) {
        FindThreeLargestNumber.findThreeLargestNumbers(new int[]{10,5,9,10,12});
    }
}
