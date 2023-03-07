class Solution {
    public double myPow(double x, int n) {

        boolean isNeg = false;
        
        if (n == Integer.MIN_VALUE) {
            if (Math.abs(x) == 1) {
            return 1;
        }
            return 0;
        } else if (n == 0) {
            return 1;
        } 
        if (n < 0) {
            n = Math.abs(n);
            isNeg = true;
        }
        double ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans*x;
            }

            n = n >> 1;
            x *= x;

        }

        if (isNeg) {
            ans = 1/ ans;
        }

        return ans;
    }
}