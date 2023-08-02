class Solution {
    public int countArrangement(int n) {
        return solve(1,new boolean[n+1]);
    }

    static int solve (int i, boolean[] visited) {
        if (i == visited.length) {
            return 1;
        }

        int count = 0;

        for (int j = 1; j <visited.length ; j++) {
            if (!visited[j]) {
                if (i % j == 0 || j % i == 0) {
                    visited[j] = true;
                    count +=solve(i+1,visited);
                    visited[j] = false;
                }
            }
        }
        return count;
    }
}
