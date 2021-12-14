package com.nirmal.algoExpert.sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        // Write your code here.

        for(int i=0;i<array.length;i++){
            int j=i;
            while(j>0 && array[j-1]>array[j]){
                swap(array,j);
                j--;
            }
        }
        return array;
    }

    public static void swap(int[] array,int j){
        int temp=array[j-1];
        array[j-1] = array[j];
        array[j] = temp;
    }
}
