class Solution {
    public int search(int[] nums, int target) {
      
        int start,end;
        if (target <= nums[nums.length-1]) {
            start = rotationMeasure(nums);
            end = nums.length-1;
        } else {
            start = 0;
            end = rotationMeasure(nums) - 1;
        }

        while (start <= end) {
            int mid = (start + end)/2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    static int rotationMeasure (int[] nums) {


        int start = 1;
        int end = nums.length - 1;

        if (nums[end] > nums[0]) {
            return 0;
        }
        while (start <= end) {
            int mid = (start + end)/2;

            if (nums[mid] < nums[mid-1]) {
                return mid;
            } else if (nums[mid] >= nums[0]) {
                start = mid +1 ;
            } else if (nums[mid] <= nums[nums.length-1]) {
                end = mid - 1;
            }
        }
        return 0;
    }
}
