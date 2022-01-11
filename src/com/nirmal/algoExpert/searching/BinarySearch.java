package com.nirmal.algoExpert.searching;

public class BinarySearch {
    // Solution::2
    public static int binarySearch(int[] array, int target) {
        // Write your code here.

        int left=0;
        int right= array.length-1;

        while (left<=right){
            int m=(left+right)/2;
            int potentialMatch=array[m];
            if(potentialMatch == target){
                return m;
            } else if(target<potentialMatch){
                right=m-1;
            } else {
                left=m+1;
            }
        }
        return -1;
    }

    // Solution :1
    /*public static int binarySearch(int[] array, int target) {
        // Write your code here.
        return binarySearchHelper(array,target,0,array.length-1);
    }

    public static int binarySearchHelper(int[] array,int target,int left,int right){
        if(left>right){
            return -1;
        }
        int m=(left+right)/2;
        int potentialMatch=array[m];
        if(potentialMatch == target){
            return m;
        } else if(target<potentialMatch){
           return binarySearchHelper(array,target,left,m-1);
        } else {
            return binarySearchHelper(array,target,m+1,right);
        }
    }*/

    public static void main(String[] args) {
        System.out.println(BinarySearch.binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73},33));
    }
}
