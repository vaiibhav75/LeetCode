class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n = nums.size();
        int maxSame = 1;
        int currSame = 1;

        for (int i = 1; i < n; i++) {
            if (nums.get(i).equals(nums.get(i - 1))) {
                currSame++;
                maxSame = Math.max(maxSame, currSame);
            } else {
                currSame = 1;
            }
        }

        int val = n - maxSame;

        if (n % 2 == 0) {
            if (maxSame <= val) {
                return 0;
            } else {
                return maxSame - val;
            }
        } else {
            if (maxSame <= val) {
                return 1;
            } else {
                return maxSame - val;
            }
        }
    }
}
