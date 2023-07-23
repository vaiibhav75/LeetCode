class Solution {
    public int countGoodNumbers(long n) {
        long val = pow(4,n/2);
        val %= mod;

        val *= pow(5,n/2 + n%2);
        val %= mod;
        
        return (int) val;
        
        
    }
    
    static int pow (int n, long k) {
        if (k == 0) {
            return 1;
        }
        
        if (k == 1) {
            return n;
        }
        int x = pow(n,k/2);
        if (k%2 == 0) {
            long val = (long) x *x % mod;
            return (int) val;
        }

        long val = (long) x *x*n % mod;
        return (int) val;
    }
    
    static final int mod = 1000000000 + 7;
}