class Solution {
    public int countHomogenous(String s) {
        long sum = 0;
        char X = s.charAt(0);
        long count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == X) {
                count++;
            } else {
                sum += counter(count);
                count = 1;
                X = s.charAt(i);
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
