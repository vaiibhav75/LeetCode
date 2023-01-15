class Solution {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i +1) {
                if (nums[i] == nums[nums[i]-1]) {
                    return nums[i];
                }
                swap(nums, i ,  nums[i]-1);
            }

        }
        
        return -1;
    }
    static void swap (int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}