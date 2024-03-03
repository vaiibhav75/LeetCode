class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        boolean[][] map = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '0' || map[i][j]) {
                    continue;
                }
                ans++;
                mark(grid,map,i,j);
            }
        }
        
        return ans;
    }

    static void mark (char[][] grid, boolean[][] map, int i,int j) {
        if (i >= grid.length || i < 0) {
            return;
        }
        
        if (j >= grid[0].length || j < 0) {
            return;
        }
        
        if (grid[i][j] == '0' || map[i][j]) {
            return;
        }
        
        map[i][j] = true;


        mark(grid,map,i+1,j);
        mark(grid,map,i-1,j);
        mark(grid,map,i,j+1);
        mark(grid,map,i,j-1);
        
    }
}