class Solution {
    public int splitArray(int[] nums, int k) {
        int end = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            end += nums[i];
            start = Math.max(start, nums[i]);
        }
        while (end >= start) {
            int mid = start + (end-start)/2;
            int pieces = pieceCounter(nums,mid);
            if (pieces <= k) {
                end = mid-1;
            } else {
                start =mid +1;
            }
        }
        return start;
        
        
        
    }
    
    static int pieceCounter (int[] nums, int maxValue) {
        int pieces = 1;
        int sum = 0;
        int i = 0;
        while (i < nums.length) {
            if (sum + nums[i] <= maxValue) {
                sum += nums[i];
                i++;
            } else {
                pieces ++;
                sum = nums[i];
                i++;
            }
        }
        return pieces;
    }
}