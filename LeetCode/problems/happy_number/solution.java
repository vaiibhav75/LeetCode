class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hash = new HashSet<>();
        
        while (n != 1 && !hash.contains(n)) {
            hash.add(n);
            int sum = 0;
            
            while (n > 0) {
                sum += (n%10)*(n%10);
                n /= 10;
            }
            
            n = sum;
        }
        
        return n == 1;
    }
}