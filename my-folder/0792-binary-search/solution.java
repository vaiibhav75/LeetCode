class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1 ;
        int mid = start + (end-start)/2;
        while (start <= end) {
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }
}
