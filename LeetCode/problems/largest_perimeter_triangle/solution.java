class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length-1;
        while (j >= 2) {
            if (nums[j] < nums[j-1] + nums[j-2]) {
                return nums[j] + nums[j-1] + nums[j-2];
            } else {
                j--;
            }
        }
        return 0;
    }
}