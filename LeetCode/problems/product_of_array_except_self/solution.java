class Solution {
    public int[] productExceptSelf(int[] nums) {

        // Initiating variable
        int[] ans = new int[nums.length];

        int multi = 1;
        boolean zeroFound = false;
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zeroFound) {
                    return ans;
                } 
                zeroFound = true;
                zeroIndex = i;
                continue;
            }
            multi *= nums[i];
        }
        
        if (zeroFound) {
            ans[zeroIndex] = multi;
            return ans;
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = multi/nums[i];
        }

        return ans;

    }
}
