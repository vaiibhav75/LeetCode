class Solution {
    public int maxSubArray(int[] nums) {
        int totalMax = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            totalMax = Math.max(sum,totalMax);
            sum = Math.max(sum,0);
        }
        return totalMax;
    }
}