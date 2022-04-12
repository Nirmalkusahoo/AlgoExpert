package com.nirmal.leetcode;

public class ID289GameofLife {
    // Solution 1 : space complexity O(m*n)
 /*   public static void gameOfLife(int[][] board) {
        int maxRow = board.length;
        int maxCol = board[0].length;

        int[][] newBoard = new int[maxRow][maxCol];
        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxCol; j++) {
                newBoard[i][j] = board[i][j];
            }
        }


        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {

                int top = Math.max(row - 1, 0);
                int bottom = Math.min(row + 1, maxRow - 1);
                int left = Math.max(col - 1, 0);
                int right = Math.min(col + 1, maxCol - 1);

                int lives = 0;
                for (int i = top; i <= bottom; i++) {
                    for (int j = left; j <= right; j++) {
                        if (!(i==row && j==col) && newBoard[i][j] == 1) {
                            lives++;
                        }
                    }
                }

                if (lives < 2 || lives > 3) {
                    board[row][col] = 0;
                } else if (lives == 3) {
                    board[row][col] = 1;
                }
            }
        }
    }*/

    // Solution 2: Space Complexity O(1)
    // See the leetcode solution video
    public static void gameOfLife(int[][] board) {
        int maxRow = board.length;
        int maxCol = board[0].length;

        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {

                int top = Math.max(0, row - 1);
                int bottom = Math.min(row + 1, maxRow - 1);
                int left = Math.max(0, col - 1);
                int right = Math.min(col + 1, maxCol-1);

                int neighbours = 0;
                for (int i = top; i <= bottom; i++) {
                    for (int j = left; j <= right; j++) {
                        if (!(i == row && j == col) && Math.abs(board[i][j]) == 1) {
                            neighbours++;
                        }
                    }
                }

                if (board[row][col] == 1) {
                    if (neighbours < 2 || neighbours > 3) {
                        board[row][col] = -1;
                    }
                } else {
                    if (neighbours == 3) {
                        board[row][col] = 2;
                    }
                }

            }
        }
        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {
                if (board[row][col] == -1) {
                    board[row][col] = 0;
                } else if (board[row][col] == 2) {
                    board[row][col] = 1;
                }

            }
        }
    }

    public static void main(String[] args) {
        gameOfLife(new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}});
    }
}
