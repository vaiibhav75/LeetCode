class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a <= 'z' && a >= 'a') {
                ans.append(a);
            } else if (a>= 'A' && a <= 'Z') {
                a+= 'a' - 'A';
                ans.append(a);
            } else if (a >= '0' && a <= '9') {
                ans.append(a);
            }
        }
        
        for (int i = 0; i < ans.length()/2; i++) {
            if (ans.charAt(i) != ans.charAt(ans.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
