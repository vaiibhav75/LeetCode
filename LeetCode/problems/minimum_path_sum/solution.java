class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        
        return solve(n-1,m-1,grid,dp);
    }

    static int solve (int i, int j, int[][] grid, int[][] dp) {

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int sum = 0;
        if (i == 0) {

            for (int k = j; k >= 0 ; k--) {
                sum += grid[i][k];
            }
            return dp[i][j] = sum;
        }

        if (j == 0) {
            for (int k = i; k >= 0 ; k--) {
                sum += grid[k][j];
            }
            return dp[i][j] = sum;
        }

        int val = grid[i][j];

        val += Math.min(solve(i-1,j,grid,dp), solve(i,j-1,grid,dp));
        
        return dp[i][j] = val;
    }
}