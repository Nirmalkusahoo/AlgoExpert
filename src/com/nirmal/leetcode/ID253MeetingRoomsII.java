package com.nirmal.leetcode;

import java.util.Arrays;

public class ID253MeetingRoomsII {
    public static int minMeetingRooms(int[][] intervals) {

        // Solution--https://www.youtube.com/watch?v=FdzJmTCVyJU

        int[] startTimes=new int[intervals.length];
        int[] endTimes=new int[intervals.length];
        int i=0;
        for(int[]interval :intervals){
            startTimes[i]=interval[0];
            endTimes[i]=interval[1];
            i++;
        }

        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int startIdx=0;
        int endIdx=0;
        int count=0;
        int rooms=0;
        while (startIdx<intervals.length){
            if(startTimes[startIdx]<endTimes[endIdx]){
                count++;
                startIdx++;
            } else {
                count--;
                endIdx++;
            }
            rooms= Math.max(rooms,count);
        }
        return rooms;

    }

    public static void main(String[] args) {

        // for solution watch youtube video--https://www.youtube.com/watch?v=FdzJmTCVyJU
        System.out.println(minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}}));
    }
}
