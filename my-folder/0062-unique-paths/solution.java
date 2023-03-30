class Solution {

    public static void main(String[] args) {
        System.out.println(uniquePaths(10,10));
    }
    static int uniquePaths(int m, int n) {
        return (int)C(m + n -2, m -1);
    }

    static long C (int n , int r) {
        if (r < n/2) {
            r = n -r;
        }

        if (r == n) {
            return 1;
        }

        if (r == n-1) {
            return n;
        }
        long ans1 = 1;
        long ans2 = 1;
        double j = 1;
        for (int i = n-r+1; i <=n ; i++) {
            ans1 *= i;
            ans2 *= j;
            j++;
            
            long gcd = gcd(ans1,ans2);
            ans1 /= gcd;
            ans2 /= gcd;
        }

        return ans1/ans2;


    }
    
    static long gcd (long a, long b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
}
