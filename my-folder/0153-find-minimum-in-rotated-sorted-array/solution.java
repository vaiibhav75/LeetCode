class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums[start] <= nums[end]) {
            return nums[0];
        }

        while (start <= end) {
            int mid = start + (end-start)/2 ;
            if (mid > 0) {
                if (nums[mid] < nums[mid-1]) {
                    return nums[mid];
                }
            }
             if (nums[mid] <= nums[nums.length-1]) {
                 end = mid - 1;
             } else {
                 start = mid + 1;
             }
        }
        return -1;
    }
}

