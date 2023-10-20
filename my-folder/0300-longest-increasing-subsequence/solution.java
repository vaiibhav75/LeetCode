class Solution {

    static int[] dp;
    static int n;
    public int lengthOfLIS(int[] nums) {
        n = nums.length;
        dp = new int[n];

        dp[n-1] = 1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == 0) {
                dp[i] = solve(i,nums);
            }
            
            max = Math.max(max,dp[i]);
        }
        
        return max;
    }

    static int solve (int i, int[] arr) {
        if (dp[i] != 0) {
            return dp[i];
        }

        int val = 0;

        for (int j = i+1; j < n; j++) {
            if (arr[j] > arr[i]) {
                val = Math.max(val,solve(j,arr));
            }
        }
        
        return dp[i] = val+1;
    }
}
