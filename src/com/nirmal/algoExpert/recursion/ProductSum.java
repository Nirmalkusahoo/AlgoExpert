package com.nirmal.algoExpert.recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ProductSum {
    // Solution 1
    /*public static int productSum(List<Object> array) {
        // Write your code here.


        return getSum( array,1,0);
    }

    public static int getSum(List<Object> array,int counter,int total){
        int index=0;
        while(index<array.size()){

            if(array.get(index) instanceof List){
                total=total+ getSum((List<Object>) array.get(index),counter+1,0);
            } else {
                total = total + new Integer((Integer) array.get(index));
            }
            index++;
        }
        return counter * total;
    }

    public static int productSum(List<Object> array) {
        // Write your code here.


        return getSum( array,1,0);
    }*/
    // Solution 2
    public static int productSum(List<Object> array) {
        // Write your code here.
        return getSum( array,1);
    }

    public static int getSum(List<Object> array,int multiplier){
        int sum=0;
        for(Object el:array){
            if(el instanceof List){
                sum = sum + getSum((List<Object>) el,multiplier+1);
            } else{
                sum = sum + (int)el;
            }
        }
        return sum*multiplier;
    }
    public static void main(String[] args) {
        List<Object> list= new ArrayList<Object>();
        list.add(1);
        list.add(2);

        List<Object> sec= new ArrayList<>();
        List<Object> nested= new ArrayList<>();
        nested.add(3);
        list.add(nested);
        list.add(4);
        list.add(5);
        System.out.println(list.toString());
        System.out.println(productSum(list));
    }
}
