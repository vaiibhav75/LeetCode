class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[]{0, 0};
        int[] freq = new int[nums.length];
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] - 1]++;
            xor ^= (nums[i] ^ (i + 1));
            if (freq[nums[i] - 1] > 1) ans[0] = nums[i];
        }
        ans[1] = xor ^ ans[0];
        return ans;

    }
}
