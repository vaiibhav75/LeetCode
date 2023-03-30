class Solution {

    public int climbStairs(int n) {
        double ans = 0;
        for (int i = 0; i <= n/2 ; i++) {
            ans += C(n-i,i);
        }
        return (int)ans;
    }

    static double C (int n , int r) {
        if (r < n/2) {
            r = n -r;
        }

        if (r == n) {
            return 1;
        }

        if (r == n-1) {
            return n;
        }
        double ans = 1;
        int j = 1;
        for (int i = n-r+1; i <=n ; i++) {
            ans *= ((double) i /(double)j);
            j++;
        }

        return ans;


    }
}
