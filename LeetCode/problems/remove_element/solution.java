class Solution {
    public int removeElement(int[] nums, int val) {
        
        int swapsize = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                swapsize++;
            }
            else {
                swap(nums, i, i-swapsize);
            }
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