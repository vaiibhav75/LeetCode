class Solution {
    public int singleNumber(int[] nums) {
        int[] arr = new int[32];
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            while (j < 32) {
                arr[j] += nums[i] & (1);
                nums[i] = nums[i] >> 1;
                j++;
            }
        }
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 != 0) {
                ret += 1 << i;
            }
        }
        return ret;
    }
}

