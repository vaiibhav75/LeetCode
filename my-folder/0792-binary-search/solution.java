class Solution {
    public int search(int[] nums, int target) {
        return BS(nums,target,0, nums.length-1);
    }
    
    static int BS(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e-s)/2;
        
        if (nums[m] > target) {
            return BS(nums,target,s,m-1);
        } else if (nums[m] < target) {
            return BS(nums,target,m+1,e);
        } else {
            return m;
        }
    }
}
