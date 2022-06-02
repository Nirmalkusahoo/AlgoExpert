package com.nirmal.algoExpert.dynamicProgramming;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DPTestCases {
    LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

    @Test
    public void longestIncreasingSubsequenceTest1() {
        List<Integer> expected = Arrays.asList(-24, 2, 3, 5, 6, 35);
        List<Integer> actual = longestIncreasingSubsequence.longestIncreasingSubsequence(new int[]{5, 7, -24, 12, 10, 2, 3, 12, 5, 6, 35});
        assertEquals(expected, actual);
    }

    @Test
    public void longestIncreasingSubsequenceTest2() {
        List<Integer> expected = Arrays.asList(-24, 2, 3, 5, 6, 35, 40);
        List<Integer> actual = longestIncreasingSubsequence.longestIncreasingSubsequence(new int[]{5, 7, -24, 12, 10, 2, 3, 12, 5, 6, 35, 40});
        assertEquals(expected, actual);
    }
}
