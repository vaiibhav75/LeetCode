class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Solution.nums = nums;
        return solve(0,target);
    }
    
    static int[] nums;
    static int solve (int i, int target) {
        if (i == nums.length) {
            if (target == 0) {
                return 1;
            } 
            return 0;
        }
        
        int count = 0;
        
        count+= solve(i+1, target-nums[i]);
        count+= solve(i+1, target+nums[i]);
        return count;
    }
}
