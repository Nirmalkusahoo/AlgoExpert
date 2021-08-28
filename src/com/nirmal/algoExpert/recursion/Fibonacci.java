package com.nirmal.algoExpert.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    // Solution 1:
 /*   public static int getNthFib(int n) {
        // Write your code here.
        if(n==1){
            return 0;
        } else if(n==2){
            return 1;
        } else{
            return getNthFib(n-1) + getNthFib(n-2);
        }
    }*/

    // Solution 2:
   /* public static int getNthFib(int n) {
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        map.put(1,0);
        map.put(2,1);
        return getNthFib(n,map);
    }
    public static int getNthFib(int n, Map<Integer,Integer> map) {
        if(map.containsKey(n)){
            return map.get(n);
        } else {
            map.put(n, getNthFib(n-1,map)+getNthFib(n-2,map));
             return map.get(n);
        }
    }*/

    //Solution 3::
    public static int getNthFib(int n) {
        int[] arr={0,1};

        if(n==0){
            return arr[0];
        } else if(n==1){
            return arr[1];
        } else {
            int counter =3;
            while (n>=counter){
                int nextFib=arr[0]+arr[1];
                arr[0]=arr[1];
                arr[1]=nextFib;
                counter++;
            }
            return arr[1];
        }
    }
    public static void main(String[] args) {

        System.out.println(Fibonacci.getNthFib(6));
    }
}
