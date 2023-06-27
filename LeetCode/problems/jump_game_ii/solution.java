class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(0, nums, dp);
    }

    static int solve (int n, int[] nums, int[] dp ) {
        if (n == nums.length-1) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int min = 1000000;  

        for (int i = 1; i <= nums[n] ; i++) {
            if (n+i < nums.length) {
                min = Math.min(min, solve(n+i, nums, dp));
            }
        }
        
        dp[n] = min+1;
        return min+1;
    }
}

