class Solution {
    
    static int MOD = 1000000000 + 7;
    public int maxNiceDivisors(int primeFactors) {
        if (primeFactors <= 3) {
            return primeFactors;
        }
        int pow3 = 0;
        int pow2 = 0;
        if (primeFactors % 3 == 0) {
            pow3 = primeFactors/3;
        } else if (primeFactors % 3 == 1) {
            pow3 = primeFactors/3 - 1;
            pow2 = 2;
        } else {
            pow3 = primeFactors/3;
            pow2 = 1;
        }

        long ans = pow(3,pow3) * pow(2,pow2);
        return (int) (ans % MOD);
    }

    static long pow (long n, long x) {
        if (x == 0) return 1;
        if (x == 1) return n;

        long val = pow(n,x/2);
        if (x%2 == 0) return (val * val) % MOD;
        return (val*val*n)%MOD;
    }
}
