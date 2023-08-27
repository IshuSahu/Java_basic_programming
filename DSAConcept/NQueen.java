package DSAConcept;
import java.util.*;

class Solution {
    public boolean isSafe(int row, int col, char[][] board) {
        // horizontal
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char board[][], List<List<String>> allBoard) {
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
                row+=" ";
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }

    public void helper(char board[][], List<List<String>> allBoard, int col) {
        if (col == board.length) {
            saveBoard(board, allBoard);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoard, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> SolveQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoard, 0);
        return allBoard;
    }
}

public class NQueen {
    public static void main(String[] args) {
        int n = 4; // Set the value of n for the N-Queens problem
        Solution solution = new Solution();
        List<List<String>> solutions = solution.SolveQueens(n);

        // Print the solutions
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
