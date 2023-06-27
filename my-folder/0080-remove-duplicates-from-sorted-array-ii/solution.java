class Solution {

    
    public int removeDuplicates(int[] nums) {

        int swapsize = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                count++;
                if (count > 2) {
                    swapsize++;
                }
            } else {
                if (count == 1) {
                    swap(nums, i-1, i-1-swapsize);
                } else {
                    swap(nums, i-2, i-2-swapsize);
                    swap(nums, i-1, i-1-swapsize);

                }

                count = 1;
            }



        }

        if (count == 1) {
            swap(nums, nums.length-1, nums.length-1-swapsize);
        } else {
            swap(nums, nums.length-2, nums.length-2-swapsize);
            swap(nums, nums.length-1, nums.length-1-swapsize);

        }

        return nums.length-swapsize;
    }

    //swap
    static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}
