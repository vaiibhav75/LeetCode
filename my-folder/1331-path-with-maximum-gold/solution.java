class Solution {
    public int getMaximumGold(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(max, solve(grid,i,j));
            }
        }
        return max;
    }

    static int solve (int[][] grid, int i, int j) {
        if (i >= grid.length || i < 0 || j < 0 || j >= grid[0].length) {
            return 0;
        }
        int gold = grid[i][j];
        if (gold == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int max = 0;
        
        max = Math.max(max,solve(grid,i-1,j));
        max = Math.max(max,solve(grid,i+1,j));
        max = Math.max(max,solve(grid,i,j-1));
        max = Math.max(max,solve(grid,i,j+1));
        grid[i][j] = gold;
        return gold+max;
    }
}
