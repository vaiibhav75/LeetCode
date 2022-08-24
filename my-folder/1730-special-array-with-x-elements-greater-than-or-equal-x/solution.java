class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i <=100 ; i++) {
            if (i == numbersGreater(i, nums)) {
                return i;
            }
        }
        return -1;


    }

    static int numbersGreater(int target, int[] nums) {
        int start = 0;
        int end = nums.length - 1 ;
        int mid = (start + end)/2;
        while (start <= end) {
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                if (mid == 0) {
                    return nums.length - mid;
                } else if (nums[mid-1] < nums[mid]){
                    return nums.length - mid;
                } else {
                    end = mid - 1;
                }

            }
            mid = (start + end)/2;
        }
        return nums.length - 1 - end;
    }
}
