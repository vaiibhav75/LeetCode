class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        while (slow != 1 && fast != 1) {
            slow = sum(slow);
            fast = sum(sum(fast));
            
            if (slow == 1 || fast == 1) {
                return true;
            }
            if (slow == fast) {
                return false;
            }
        }
        
        return true;
    }

    static int sum (int n) {
        int ans = 0;
        
        while (n > 0) {
            ans += (n%10)*(n%10);
            n/=10;
        }
        return ans;
    }
}
