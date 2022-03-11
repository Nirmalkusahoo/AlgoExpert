package com.nirmal.leetcode;

import java.util.Arrays;

public class ID252MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int i = 0;
        while (i < intervals.length - 1) {
            int[] currentInterval = intervals[i];
            int[] nextInterval = intervals[i + 1];
            if (currentInterval[1] > nextInterval[0]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
