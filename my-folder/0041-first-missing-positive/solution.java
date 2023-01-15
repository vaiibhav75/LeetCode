class Solution {
    public int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            // looping until we find the correct value 
            while (nums[i] != i+1) {
                
                // skipping out of range values
                if (nums[i] >= nums.length || nums[i] <= 0) {
                    break;
                }
                // skipping duplicates
                if (nums[i] == nums[nums[i]-1]) {
                    break;
                }
                // swapping with correct value
                swap(nums , i , nums[i]-1);
            }
        }

        // returning the missing positive value
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) {
                return i+1;
            }
        }
        return nums.length + 1;
    }

    // swap function
    static void swap (int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}
