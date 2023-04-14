class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        while (i < nums.length ) {
            if (nums[i] < 0) {
                nums[i] *= -1;
                i++;
            } else {
                break;
            }
        }
        int[] arr = new int[nums.length];
        int j = i - 1;
        int k = 0;
        while (i < nums.length && k < nums.length) {
            if (j >= 0 && nums[j] <= nums[i]) {
                    arr[k] = nums[j]*nums[j];
                    k++;
                    j--;
                    continue;
            }
            arr[k] = nums[i]*nums[i];
            i++;
            k++;
        }
        while (j >= 0) {
            arr[k] = nums[j]*nums[j];
            k++;
            j--;
        }
        return arr;
    }
}