class Solution {
    public int[] productExceptSelf(int[] nums) {
        
         // Initiating variable
        int[] ans = new int[nums.length];

        ans[0] = 1;
        for (int j = 1; j < nums.length; j++) {
            ans[j] = ans [j-1] * nums[j-1];
        }

        int mult2 = 1;
        for (int j = nums.length-2; j >= 0; j--) {
            mult2 = mult2 * nums[j+1];
            ans[j] = ans[j]*mult2;
        }


        return ans;
        
    }
}

