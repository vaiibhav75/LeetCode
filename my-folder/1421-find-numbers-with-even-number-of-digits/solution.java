class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            int a = nums[i];
            while (a != 0 ){
                a = a/10;
                j++;
            }
            if (j % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
