class Solution {
    public int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i +1) {
                if (nums[i] == nums[nums[i]-1]) {
                    break;
                }
                swap(nums, i ,  nums[i]-1);
            }

        }

        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i +1) {
                ans[0] = nums[i];
                ans[1] = i +1;
            }
        }
        return ans;
    }
    static void swap (int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}
