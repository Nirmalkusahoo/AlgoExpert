package com.nirmal.algoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    public int convert(double[] weights){
        double[] arr = {1.01, 1.991, 1.32, 1.4};
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while(left <= right){
            if(left == right){
                count++;
                break;
            }
            if(arr[left] + arr[right] <= 3.0){
                left++;
                right--;
                count++;
            }
            else{
                right--;
                count++;
            }
        }
        return count;
    }


    public static void main( String args[] ) {
        test obj= new test();
        System.out.println(obj.convert(new double[]{4,1.01,1.991,1.32,1.4}));
    }
}
