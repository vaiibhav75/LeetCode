class Solution {

    static int n;
    static int m;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        n = obstacleGrid.length;
        m = obstacleGrid[0].length;

        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0,0,dp,obstacleGrid);

    }

    static int solve (int i, int j, int[][] dp, int[][] obstacleGrid) {
        if (obstacleGrid[i][j] == 1) {
            return 0;
        }
        if (i == n-1 || j == m-1) {
            for (int k = i; k < n; k++) {
                if (obstacleGrid[k][j] == 1) {
                    return 0;
                }
            }
            
            for (int k = j; k < m; k++) {
                if (obstacleGrid[i][k] == 1) {
                    return 0;
                }
            }
            return 1;
        }



        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int count = 0;

        if (obstacleGrid[i+1][j] == 0) {
            count += solve(i+1,j,dp,obstacleGrid);
        }

        if (obstacleGrid[i][j+1] == 0) {
            count += solve(i,j+1,dp,obstacleGrid);
        }

        return dp[i][j] = count;
    }
}