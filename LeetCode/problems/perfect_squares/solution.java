class Solution {
    public int numSquares(int n) {
        map = new int[n+1];
        Arrays.fill(map,-1);
        map[0] = 0;

        for (int i = 0; i*i <= n ; i++) {
            map[i*i] = 1;
        }
        
        return solve(n);
    }
    
    static int[] map;
    
    static int solve (int n) {
        if (map[n] != -1) {
            return map[n];
        }
        
        int ans = n;

        for (int i = 1; i*i <= n ; i++) {
            ans = Math.min(ans, solve(n-(i*i) )+1);
        }
        
        map[n] = ans;
        return ans;
    }
}