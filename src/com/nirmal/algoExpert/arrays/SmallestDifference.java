package com.nirmal.algoExpert.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int first=0;
        int second=0;
        int smallest=Integer.MAX_VALUE;
        int current=Integer.MAX_VALUE;
        int[] pairs= new int[2];

        while(first<arrayOne.length && second<arrayTwo.length){
            int firstNum=arrayOne[first];
            int secondNum=arrayTwo[second];
            if(firstNum>secondNum){
                current=firstNum-secondNum;
                second++;
            } else if(firstNum<secondNum){
                current=secondNum-firstNum;
                first++;
            } else {
                return new int[]{firstNum,secondNum};
            }

            if(smallest>current){
                smallest=current;
                pairs= new int[]{firstNum,secondNum};
            }
        }

        return pairs;
    }
}
