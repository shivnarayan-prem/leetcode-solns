package medium;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] boxes = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int n = Character.getNumericValue(c) - 1;
                    int boxIndex = (i / 3) * 3 + (j / 3);
                    if (rows[i][n] == -1 || cols[j][n] == -1 || boxes[boxIndex][n] == -1) {
                        return false;
                    }
                    rows[i][n] = -1;
                    cols[j][n] = -1;
                    boxes[boxIndex][n] = -1;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][] {
                { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println(isValidSudoku(board));

    }
}
