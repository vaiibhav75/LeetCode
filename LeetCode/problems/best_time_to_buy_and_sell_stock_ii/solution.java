class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            int x = prices[i] - prices[i-1];
            if (x > 0) {
                ans += x;
            }
        }
        return ans;
    }
}
