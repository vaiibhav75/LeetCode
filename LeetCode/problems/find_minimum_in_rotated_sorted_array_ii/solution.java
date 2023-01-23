class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums[start] < nums[end]) {
            return nums[0];
        }
        int firstMin = Integer.MAX_VALUE;
        while (nums[start] == nums[end]){
            firstMin = Math.min(firstMin, nums[start]);
            if (start == end || start == end-1) {
                break;
            } else {
                start++;
                end--;
            }
        }
        
        int currMin = findMinInIndex(nums, start,end);
        if (currMin== -1) {
            currMin = nums[start];
        }
        return Math.min(firstMin,currMin);
        
        
    }
    public int findMinInIndex(int[] nums, int start, int end) {
        

        while (start <= end) {
            int mid = start + (end-start)/2 ;
            if (mid > 0) {
                if (nums[mid] < nums[mid-1]) {
                    return nums[mid];
                }
            }
            if (nums[mid] <= nums[end]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}