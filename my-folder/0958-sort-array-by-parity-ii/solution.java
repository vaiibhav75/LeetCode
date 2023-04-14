class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = nums.length-1;

        while (i < nums.length && j >= 0) {
            while (i < nums.length && nums[i] %2 == 0) {
                i += 2;
            }

            while (j >= 0 && nums[j] %2 != 0) {
                j -= 2;
                
            }
            if (j < 0 || i >= nums.length) {
                break;
            }
            swap(nums,i,j);
        }
        return nums;
    }

    static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
