class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            if (checker(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
    
    static boolean checker (int n) {
        int x = n;
        while (x > 0) {
            int a = x%10;
            if (a == 0) {
                return false;
            }
            if ( n %a != 0) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}
