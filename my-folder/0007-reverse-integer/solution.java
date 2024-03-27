class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) x = -x;
        int ans = 0;

        while (x > 0) {
            if (ans > Integer.MAX_VALUE / 10) {
                return 0;
            }
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return isNegative ? -ans : ans;
    }
}
