package com.nirmal.algoExpert.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {

    // Iterative Solution
    /*public static List<List<Integer>> powerset(List<Integer> array) {
        // Write your code here.
        List<List<Integer>> subsets= new ArrayList<List<Integer>>();
        subsets.add(new ArrayList<Integer>());
        for(Integer num:array){
            int size=subsets.size();
           for (int i=0;i<size;i++){
               List<Integer> currentSubset=new ArrayList<Integer>(subsets.get(i));
               currentSubset.add(num);
               subsets.add(currentSubset);
           }
        }
        return subsets;
    }*/

    // Recursive

    public static List<List<Integer>> powerset(List<Integer> array) {
        return powerset(array,array.size()-1);
    }

    public static List<List<Integer>> powerset(List<Integer> array, int index) {
        if(index<0){
            List<List<Integer>> emptySet= new ArrayList<List<Integer>>();
            List<Integer> emptyList=new ArrayList<>();
            emptySet.add(emptyList);
            return emptySet;
        }

        int num=array.get(index);
        List<List<Integer>> subSet= powerset(array,index-1);
        int size=subSet.size();

        for (int i=0;i<size;i++){
            List<Integer> currentSubSet=new ArrayList<Integer>(subSet.get(i));
            currentSubSet.add(num);
            subSet.add(currentSubSet);
        }

        return subSet;
    }
    public static void main(String[] args) {
        System.out.println(PowerSet.powerset(Arrays.asList(new Integer[]{1,2,3})));
    }
}
