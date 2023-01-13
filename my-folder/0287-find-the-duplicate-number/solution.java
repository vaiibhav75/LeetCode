class Solution {
    
    public int findDuplicate(int[] nums) {
        int[] arr = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]] == 0) {
                arr[nums[i]] = 1;
            } else {
                return nums[i];
            }
        }
        return arr[0];
    }
}
