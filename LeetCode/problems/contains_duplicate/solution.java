class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 1; i <nums.length ; i++) {
            for (int j = i; j > 0 ; j--) {
                if (nums[j] == nums[j-1]) {
                    return true;
                } else if (nums[j] < nums[j-1]) {
                    swap(nums, j , j-1);
                } else {
                    break;
                }
              
            }
           
        }
        return false;
    }
    static void swap (int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}