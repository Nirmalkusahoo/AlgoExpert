package com.nirmal.algoExpert;


public class Practise {

    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
                }
            }
        }
        return matrix[m - 1][n - 1];
    }


    public static void main(String[] args) {
        String s1 = null;
        String s2 = null;

        System.out.println(s1.equals(s2));
    }

}
