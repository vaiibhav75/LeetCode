class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = 0;
            for (int j = 0; j < points.length; j++) {
                int pLength = (queries[i][0] - points[j][0])*(queries[i][0] - points[j][0]);
                int lLength = (queries[i][1] - points[j][1])*(queries[i][1] - points[j][1]);
                if (pLength + lLength <= queries[i][2]*queries[i][2]) {
                    x++;
                }
            }
            ans[i] = x;
        }
        return ans;
    }
}