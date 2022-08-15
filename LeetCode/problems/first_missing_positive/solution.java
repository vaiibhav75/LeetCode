class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= nums.length && nums[i] >0) {
                arr[nums[i]-1] = nums[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                return i + 1;
            }
        }
        return arr.length +1;
    }
}