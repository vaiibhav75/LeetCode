class Solution {
    public int reachNumber(int target) {
        int value = Math.abs(target);
        int step = 0;
        int sum = 0;

        while (sum < value || (sum-value)%2 != 0) {
            step++;
            sum += step;
        }
        return step;
    }
}
