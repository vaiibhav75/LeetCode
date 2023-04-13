class Solution {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
    static int search(int[] nums, int target) {
        return solve(nums,target,0, nums.length-1);
    }

    static int solve (int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s +(e-s)/2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[s] <= nums[mid]) {
            if (target >= nums[s] && target <= nums[mid]){
                return solve(nums,target,s, mid-1);
            } else {
                return solve(nums,target,mid+1, e);
            }
        }
        if (nums[e] >= nums[mid]){
            if (target <= nums[e] && target >= nums[mid]){
                return solve(nums,target,mid+1, e);
            } else {
                return solve(nums,target,s, mid-1);
            }
        }
        
        return -1;
    }
}