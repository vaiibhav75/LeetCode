class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0]){
            return 0;
        }
        if (target > nums[nums.length-1]) {
            return nums.length;
        }
        int start = 0;
        int end = nums.length-1;
        int mid = start + (end - start)/2;
        
        while (start <= end) {
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                if (nums[mid-1] < nums[mid]){
                    return mid;
                } else {
                    end = mid-1;
                }
            }
            mid = start + (end - start)/2;
        }
        return start;
    }
}
