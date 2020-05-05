import java.util.ArrayList;
import java.util.List;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        if (board.length == 0)
            return false;
        List<Character> rowValues;
        List<Character> colValues;
        boolean validSudoku = true;
        for (int i = 0; i < board.length; i++) {
            rowValues = new ArrayList<>();
            colValues = new ArrayList<>();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    if (!rowValues.contains(board[i][j])) {
                        rowValues.add(board[i][j]);
                    } else {
                        return false;
                    }
                }

                if (board[j][i] != '.') {
                    if (!colValues.contains(board[j][i])) {
                        colValues.add(board[j][i]);
                    } else {
                        return false;
                    }

                }
            }
        }

        rowValues = new ArrayList<>();
        int j = 0;
        int i = 0;
        int repeat = 0;
        while (repeat < 3) {
            if (i == 0 || i == 3 || i == 6) {
                rowValues = new ArrayList<>();
            }

            while (j < board.length) {
                if (board[i][j] != '.') {
                    if (!rowValues.contains(board[i][j])) {
                        rowValues.add(board[i][j]);
                    } else {
                        return false;
                    }
                }

                if (j == 2 || j == 5 || j == 8) {
                    j -= 2;
                    break;
                }
                j++;
            }

            if (i == 8) {
                repeat++;
                i = 0;
                j += 3;
            }
        }

        return validSudoku;
    }

    public static void main(String[] args) {
        // char[][] input = { { '8', '3', '.', '.', '7', '.', '.', '.', '.' }, { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        // { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        // { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        // { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        char[][] input = { { '.', '.', '.', '.', '5', '.', '.', '1', '.' }, { '.', '4', '.', '3', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '3', '.', '.', '1' }, { '8', '.', '.', '.', '.', '.', '.', '2', '.' }, { '.', '.', '2', '.', '7', '.', '.', '.', '.' },
            { '.', '1', '5', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '2', '.', '.', '.' }, { '.', '2', '.', '9', '.', '.', '.', '.', '.' },
            { '.', '.', '4', '.', '.', '.', '.', '.', '.' } };

        System.out.println("valid sudoku " + isValidSudoku(input));
    }

}
