public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 16; i++) {
            int x = (n >> i) & (1);
            int y = (n >> (31 -i)) & (1);
            
            ans += (y << i) + (x << (31 -i));
        }
        return ans;
    }
}