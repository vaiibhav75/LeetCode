class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return false;
        int end = n - 1;
        int start = 0;
        
        while(start <= end) {
            int mid = start + (end-start)/2;
            
            if (nums[mid] == target) return true;
            
            if (isBinaryUseful(nums, start, target)) {
                start++;
                continue;
            }
            
            boolean midArr = inFirstArray(nums, start, nums[mid]);
            boolean tarArr = inFirstArray(nums, start, target);
            
            if (midArr ^ tarArr) {
                if (tarArr) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    static boolean isBinaryUseful (int[] arr, int start, int element) {
        return arr[start] != element;
    }

    static boolean inFirstArray (int[] arr, int start, int element){
        return arr[start] <= element;
    }
}



