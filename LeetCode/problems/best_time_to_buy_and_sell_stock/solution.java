class Solution {
    public int maxProfit(int[] prices) {
        int[] maxMap = new int[prices.length];

        int max = 0;
        for (int i = prices.length-1; i > 0; i--) {
            max = Math.max(max, prices[i]);
            maxMap[i-1] = max;
        }

        int ans = 0;

        for (int i = 0; i < prices.length-1; i++) {
            ans = Math.max(ans, maxMap[i]-prices[i]);
        }

        return ans;
    }
}