class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int breaks = 0;
        int brr = 0;

        for (int i = 1; i <nums.size() ; i++) {
            if (nums.get(i) < nums.get(i-1)) {
                breaks++;
                brr = i;
            }
        }

        if (breaks == 0) {
            return 0;
        }
        if (breaks > 1) {
            return -1;
        }
        if (nums.get(0) < nums.get(nums.size() - 1)) {
            return -1;
        }
        return nums.size() - brr;
    }
}
