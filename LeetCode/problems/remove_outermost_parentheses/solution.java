class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='(') {
                val++;
                if (val > 1) {
                    ans.append(s.charAt(i));
                }
            } else {
                val--;
                if (val > 0) {
                    ans.append(s.charAt(i));
                }
            }
            
        }

        return ans.toString();
    }
}