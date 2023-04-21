class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        nums[nums.length-1]--;
        nums[nums.length-2]--;
        
        return (nums[nums.length-1]*nums[nums.length-2] );
    }
}
