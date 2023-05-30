class Solution {
    public int rob(int[] nums) {
        int n = nums.length-1;
    
        if (nums.length == 1) {
            return nums[0];
        }
        int a = Math.max(nums[n-1],nums[n] );
        if (nums.length == 2){
            return a;
        }

        int b = Math.max(nums[n-2] + nums[n],nums[n-1]);
        if (nums.length == 3){
            return b;
        }
        for (int i = 3; i <= n ; i++) {
            int temp = Math.max(nums[n-i] + a, b );
            a = b;
            b = temp;
        }
        
        return b;
        
        
        
        
    }
}
