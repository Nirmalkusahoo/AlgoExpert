package com.nirmal.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ID57InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergedInterval= new ArrayList<>();
        int newStart=newInterval[0];
        int newEnd=newInterval[1];

        int i=0;
        while (i<intervals.length && intervals[i][1]<newStart){
            mergedInterval.add(intervals[i]);
            i++;
        }

        while(i<intervals.length && newEnd<=intervals[i][0]){
            newStart= Math.min(newStart,intervals[i][0]);
            newEnd= Math.max(newEnd,intervals[i][1]);
            i++;
        }
        while (i<intervals.length){
            mergedInterval.add(intervals[i]);
            i++;
        }
        return mergedInterval.toArray(new int[mergedInterval.size()][]);
    }



    public static void main(String[] args){
//        System.out.println(insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8}));
        System.out.println(insert(new int[][]{{1,5}}, new int[]{5,7}));
    }
}
