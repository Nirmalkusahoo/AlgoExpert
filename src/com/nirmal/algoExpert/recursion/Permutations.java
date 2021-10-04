package com.nirmal.algoExpert.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        // Write your code here.
        List<List<Integer>> list=new ArrayList<>();
        for (int i=0;i<array.size();i++){
            array.remove(i);
            StringBuilder str=new StringBuilder();
            str.append(array.get(i));
        }
        return new ArrayList<List<Integer>>();
    }

    public static void main(String[] args) {

    }
}
