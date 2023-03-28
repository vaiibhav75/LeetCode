class Solution {

    static int mySqrt(int x) {
        float x1 = 1;
        float x2 = (x1 + x/x1)/2;

        while (!(x1 <= x2 + 0.001 && x1 >= x2 - 0.001)) {
            x1 = x2;
            x2 = (x1 + x/x1)/2;
        }
        int ans = (int) x2;
        while (ans * ans > x) {
            ans-= 1;
        }

        return ans ;
    }
}