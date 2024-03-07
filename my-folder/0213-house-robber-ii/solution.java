class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(rob1(subarray(nums, 0, nums.length-1)), rob1(subarray(nums, 1, nums.length)));
    }

    public int rob1(int[] nums) {
        int n = nums.length-1;

        if (nums.length == 1) {
            return nums[0];
        }
        int a = Math.max(nums[n-1],nums[n] );
        if (nums.length == 2){
            return a;
        }

        int b = Math.max(nums[n-2] + nums[n],nums[n-1]);
        if (nums.length == 3){
            return b;
        }
        for (int i = 3; i <= n ; i++) {
            int temp = Math.max(nums[n-i] + a, b );
            a = b;
            b = temp;
        }

        return b;




    }

    public static int[] subarray(int[] arr, int start, int end) {
        int[] subarray = new int[end - start];
        for (int i = start; i < end; i++) {
            subarray[i - start] = arr[i];
        }
        return subarray;
    }
}
