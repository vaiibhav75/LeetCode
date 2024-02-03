class Solution {
    public int numberOfPairs(int[][] points) {
        boolean[][] arr = new boolean[51][51];
        
        for (int[] point: points) {
            arr[50-point[0]][point[1]] = true;
        }
        
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[0].length; k++) {
                if (arr[i][k]) {
                    ans += solve(i,k,arr);
                }
            }
        }
        
        return ans;
    }

    static int solve (int i, int j, boolean[][] points) {
        int ans = 0;
        int max = points[0].length;
        for (int k = i; k < points.length; k++) {
            for (int l = j; l < max; l++) {
                if (k == i && l == j) {
                    continue;
                }
                if (points[k][l]) {
                    ans++;
                    max = l;
                    break;
                }
            }
            if (max == j) {
                break;
            }
        }
        return ans;
    }
}
