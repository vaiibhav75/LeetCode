class Solution {
    public int kthGrammar(int n, int k) {
        return zero(n-1,k);
    }
    
    static int zero (int n,int k) {
        if (n == 0) {
            return 0;
        }
        int x = (int) Math.pow(2,n-1);
        if (k > Math.pow(2,n-1)) {
            return one(n-1,k-x);
        } 
        return zero(n-1,k);
    }

    static int one (int n,int k) {
        if (n == 0) {
            return 1;
        }
        int x = (int) Math.pow(2,n-1);
        if (k > Math.pow(2,n-1)) {
            return zero(n-1,k-x);
        }
        return one(n-1,k);
    }
}