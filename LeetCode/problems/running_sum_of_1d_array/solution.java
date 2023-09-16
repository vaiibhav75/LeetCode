class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];

        long sum = 0;
        
        for ( int i = 0; i < length; i = i + 1) {
            sum = sum + nums[i];
            ans[i] = (int) sum;
        }
        
        return ans;
    }
}