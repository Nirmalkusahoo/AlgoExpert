package com.nirmal.leetcode;

import java.util.Arrays;
import java.util.List;

public class ID539MinimumTimeDifference {
    public static int findMinDifference(List<String> timePoints) {
        boolean[] times = new boolean[24 * 60];
        for (String timePoint : timePoints) {
            String[] time = timePoint.split(":");
            int hr = Integer.parseInt(time[0]);
            int min = Integer.parseInt(time[1]);
            int inMinute = hr * 60 + min;
            if (times[inMinute]) {
                return 0;
            }
            times[inMinute] = true;
        }

        int first = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int prev = 0;

        for (int i = 0; i < 1440; i++) {
            if (times[i]) {
                if (first != Integer.MAX_VALUE) {
                    min = Math.min(min, i - prev);
                }
                first = Math.min(first, i);
                last = Math.max(last, i);
                prev = i;
            }
        }

         /*Why we need below line  min = Math.min(min, (1440 - last + first));
        We only calculates i - prev during the loop.
        At last, we need to take care the last and first time points. i.e. [00:00, 10:00, 23:00]. The smallest gap is between 23:00 and 00:00.*/
//        min = Math.min(min, 1440 - (first + last)); - > wrong
        min = Math.min(min, 1440 - last + first);
        return min;
    }

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("00:00", "23:59", "10:03");
        List<String> list = Arrays.asList("12:12","12:13");
        System.out.println(findMinDifference(list));


    }
}
