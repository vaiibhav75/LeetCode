class Solution {

    public static void main(String[] args) {
        //testing
        char[][] board = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'1','.','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','.'},
                {'4','.','.','8','.','3','.','.','.'},
                {'7','.','.','.','2','.','.','.','.'},
                {'.','.','.','6','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','.'},
                {'2','.','.','.','8','.','.','.','5'}

        };

        solveSudoku(board);
        System.out.println();
        System.out.println();
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
    }
    static void solveSudoku(char[][] board) {

        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                row[i][board[i][j] - '1'] = true;
                col[j][board[i][j] - '1'] = true;
                box[(i/3)*3 + (j/3)][board[i][j] - '1'] = true;

            }
        }

        boolean ans = solve(board, row, col, box);


    }



    static boolean solve (char[][] board, boolean[][] row, boolean[][] col, boolean[][] box) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    for (int k = 0; k <  9 ; k++) {
                        if (!row[i][k] && !col[j][k] && !box[(i/3)*3 + (j/3)][k]) {
                            row[i][k] = true;
                            col[j][k] = true;
                            box[(i/3)*3 + (j/3)][k] = true;
                            board[i][j] = (char) (k + '1');
                            if (solve(board,row,col,box)) {
                                return true;
                            }
                            board[i][j] = '.';
                            row[i][k] = false;
                            col[j][k] = false;
                            box[(i/3)*3 + (j/3)][k] = false;

                        }
                    }

                    return false;
                }



            }
        }

        return true;
    }
}