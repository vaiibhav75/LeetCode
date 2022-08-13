class Solution {
    public int rob(int[] nums) {
        int n = nums.length-1;
        
//        
//        int rob0n =0;
//        int rob2n = 0;
//        int rob1n = 0;
//        int rob3n = 0;
//        int rob4n = 0;
//
//        int robn_1_n = 0;
//        int robn_2_n = 0;
//        int robn_3_n = 0;
//        int robn_4_n = 0;
//        
//        
//        rob0n = Math.max(nums[0]+rob2n, rob1n);
//        rob1n = Math.max(nums[1] + rob3n, rob2n);
//        rob2n = Math.max(nums[2]+rob4n,rob3n);
//        //
//        //
//        //
//        //
//        robn_1_n = Math.max(nums[n-1],nums[n] );
//        robn_2_n = nums[n-2] + nums[n];
//        robn_3_n = Math.max(nums[n-3] + robn_1_n, robn_2_n );
//        robn_4_n = Math.max(nums[n-4]+ robn_2_n, robn_3_n);
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
