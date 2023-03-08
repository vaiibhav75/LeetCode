class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            if (checkPrime(count(i))) {
                ans++;
            }
        }
        return ans;
        
    }
    static int count (int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }
    
    static boolean checkPrime (int n) {
        return n==2 || n==3 || n==5 || n==7 || n==11 || n==13 || n==17 || n==19;
    }
}
