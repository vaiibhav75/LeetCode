class Solution {
    static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }


        int start = 1;
        int end = x/2;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (mid <= x/mid) {
                ans = mid;
                start = mid +1;
                
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
