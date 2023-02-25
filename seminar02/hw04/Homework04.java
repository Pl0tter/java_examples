package org.example.seminar02.hw04;

public class Homework04 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Validate: " + isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        char[] numbers = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (char num : numbers) {
            for (int i = 0; i < board.length; i++) {
                int countRow = 0;
                int countCol = 0;
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == num) countRow++;
                    if (board[j][i] == num) countCol++;
                    if (countRow > 1 || countCol > 1) return false;
                }
            }
            for (int i = 0; i <= 6; i += 3) {
                for (int j = 0; j <= 6; j += 3) {
                    int countSquare = 0;
                    for (int k = 0; k < 9; k++) {
                        if (k < 3) {
                            if (board[i][j + k] == num) countSquare++;
                        } else if (k < 6) {
                            if (board[i + 1][j + k - 3] == num) countSquare++;
                        } else {
                            if (board[i + 2][j + k - 6] == num) countSquare++;
                        }
                    }
                    if (countSquare > 1) return false;
                }
            }
        }
        return true;
    }
}
