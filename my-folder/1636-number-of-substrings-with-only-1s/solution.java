class Solution {
    public int numSub(String s) {
        long sum = 0;
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                sum += counter(count);
                count = 0;
            }
        }
        sum += counter(count);
        return (int) (sum % (1000000007));
    }
    
    static long counter (long n) {
        if (n == 0 || n == 1) {
            return n;
        }
        long a = n*(n+1);
        return a/2;
    }
}
