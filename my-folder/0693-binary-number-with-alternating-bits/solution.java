class Solution {
    public boolean hasAlternatingBits(int n) {
        int dig = n &1;
        while (n > 0) {
            n >>= 1;
            if ((n&1) == dig) {
                return false;
            }
            dig = n &1;
            
        }
        return true;
    }
}
