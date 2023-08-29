class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = new int[][]{{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        System.out.println(solution.uniquePathsIII(grid));
    }
    public int uniquePathsIII(int[][] grid) {

        int covered  = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == -1  ) {
                    visited[i][j] = true;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {

                    return solve(grid, i,j,visited);

                }
            }
        }

        return 0;
    }

    static int solve (int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0;
        }

        if (visited[i][j]) {
            return 0;
        }


        if (grid[i][j] == 2 ) {
            visited[i][j] = true;
            for (int k = 0; k < grid.length; k++) {
                for (int l = 0; l < grid[0].length; l++) {
                    if (!visited[k][l]) {
                        visited[i][j] = false;
                        System.out.println(false);
                        return 0;
                    }
                }
            }
            visited[i][j] = false;
            System.out.println(true);
            return 1;
        }



        int count =  0;
        visited[i][j] = true;

        count += solve(grid, i+1,j,visited);
        count += solve(grid, i-1,j,visited);
        count += solve(grid, i,j+1,visited);
        count += solve(grid, i,j-1,visited);

        visited[i][j] = false;
        return count;
    }
}
