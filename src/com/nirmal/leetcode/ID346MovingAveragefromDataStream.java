package com.nirmal.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ID346MovingAveragefromDataStream {

    Deque dq = new ArrayDeque<Integer>();
    int count = 0;
    int size = 0;
    int sum = 0;

    public  void MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        int tail = 0;
        dq.add(val);
        count++;
        if (count > size) {
            tail = (int)dq.poll();
        }
        sum = sum - tail + val;
        return (sum * 1.0) / Math.min(size, count);
    }
   /* int wsize;
    List<Integer> list = new ArrayList<>();
    public void MovingAverage(int size) {
        wsize = size;
    }

    public double next(int val) {
        list.add(val);
        int sum = 0;
        int size = list.size();
        for (int i = Math.max(0, list.size() - wsize); i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        int avg = Math.min(wsize, list.size());

        return (sum* 1.0) / avg;
    }*/

    public static void main(String[] args) {
        ID346MovingAveragefromDataStream obj = new ID346MovingAveragefromDataStream();
        obj.MovingAverage(3);
        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));
    }
}
