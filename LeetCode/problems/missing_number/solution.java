class Solution {
    public int missingNumber(int[] nums) {
        int index = 0;
        for (int i = 0; i <nums.length ; i++) {
           while (nums[i] != i) {
               if(nums[i] == nums.length) {
                   index = i;
                   break;
               }
               swap(nums, i, nums[i]);

           }

        }
        if (nums[index] == index) {
                return nums.length;
        }
        return index;

    }

    static void swap (int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}