package com.nirmal.algoExpert.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiskStacking {
    public static List<Integer[]> diskStacking(List<Integer[]> disks) {
        // Write your code here.
        disks.sort((disk1, disk2) -> disk1[2].compareTo(disk2[2]));
        int[] heights = new int[disks.size()];
        for (int i = 0; i < disks.size(); i++) {
            heights[i] = disks.get(i)[2];
        }

        int[] sequences = new int[disks.size()];
        Arrays.fill(sequences, Integer.MIN_VALUE);

        int maxHeight = 0;
        for (int i = 1; i < disks.size(); i++) {
            Integer[] currentDisk = disks.get(i);
            for (int j = 0; j < i; j++) {
                Integer[] otherDisk = disks.get(j);
                if (isValidDisk(currentDisk, otherDisk)) {
                    if (heights[i] <= heights[j] + currentDisk[2]) {
                        heights[i] = heights[j] + currentDisk[2];
                        sequences[i] = j;
                    }
                }
            }

            if (heights[i] > heights[maxHeight]) {
                maxHeight = i;
            }
        }
        return buildSequence(disks, sequences, maxHeight);
    }

    public static List<Integer[]> buildSequence(List<Integer[]> disks, int[] array, int index) {
        List<Integer[]> sequences = new ArrayList<>();
        while (index != Integer.MIN_VALUE) {
            sequences.add(0, disks.get(index));
            index = array[index];
        }
        return sequences;
    }

    public static boolean isValidDisk(Integer[] currentDisk, Integer[] otherDisk) {
        return currentDisk[0] > otherDisk[0] && currentDisk[1] > otherDisk[1] && currentDisk[2] > otherDisk[2];
    }

    public static void main(String[] args) {
        List<Integer[]> input = new ArrayList<Integer[]>();
        input.add(new Integer[]{2, 1, 2});
        input.add(new Integer[]{3, 2, 3});
        input.add(new Integer[]{2, 2, 8});
        input.add(new Integer[]{2, 3, 4});
        input.add(new Integer[]{2, 2, 1});
        input.add(new Integer[]{4, 4, 5});
        System.out.println(diskStacking(input));
    }
}
