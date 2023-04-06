class Solution {
    public int kthFactor(int n, int k) {
        int x = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                x++;
            }
            if (x == k){
                return i;
            }
        }
        
        return -1;
    }
}
