class Solution {
    public boolean exist(char[][] board, String word) {
        n = board.length;
        m= board[0].length;
        map = new boolean[n][m];
        Solution.board = board;
        Solution.word = word;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (solve(i,j,1)){
                        return true;
                    }
                }
            }
        }
        
        return false;


    }

    static boolean solve (int i, int j, int x) {
        if (x == word.length()) {
            return true;
        }
        map[i][j] = true;
        
        if (check(word.charAt(x),i+1,j) && solve(i+1, j, x+1)) {
            return true;
        }

        if (check(word.charAt(x),i,j+1) && solve(i, j+1, x+1)) {
            return true;
        }
        if (check(word.charAt(x),i-1,j) && solve(i-1, j, x+1)) {
            return true;
        }
        if (check(word.charAt(x),i,j-1) && solve(i, j-1, x+1)) {
            return true;
        }
        map[i][j] = false;
        return false;
    }




    static int n;
    static int m;
    static boolean[][] map;
    static char[][] board;
    static String word;

    static boolean check (char c, int i, int j) {
        if (i < 0 || j < 0 || i > n-1 || j > m-1) {
            return false;
        }

        if (c != board[i][j] || map[i][j]) {
            return false;
        }

        return true;
    }

}
